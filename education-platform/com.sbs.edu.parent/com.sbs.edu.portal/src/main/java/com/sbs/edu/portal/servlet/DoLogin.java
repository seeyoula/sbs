/*
 * 文件名：DoLogin.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： DoLogin.java
 * 修改人：Administrator
 * 修改时间：2016年7月3日
 * 修改内容：新增
 */
package com.sbs.edu.portal.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sbs.edu.basic.entity.User;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 * 
 * @author     Administrator
 * @version    SBS V001R001 2016年7月3日
 * @since      SBS V001R001C00
 */
public class DoLogin extends HttpServlet
{
    private static Logger LOGGER = LogManager.getLogger(DoLogin.class);
    
    /**
     * TODO 添加字段注释
     */
    private static final long serialVersionUID = 1L;
    
    public DoLogin()
    {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.doPost(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        HttpSession session = request.getSession();
        User user = new User();

        LOGGER.debug("start to login.");
        LOGGER.info(user);
        if ("1".equals(role)) //普通用户
        {
            if ("ajie".equals(userName) && "10086".equals(password))
            {
                user.setName(userName);
                user.setPassword(password);
                // user.setRole(role);
                session.setAttribute("user", user);
                //System.out.println("登录成功");//测试用
                response.sendRedirect("result.jsp");//result.jsp页面用于给用户选择是要到query.jsp还是update.jsp页面
            }
            else
            {
                //System.out.println("登录失败");//测试用
                //重定向
                //response.sendRedirect("login.jsp?uid="+userName+"&userRole="+role+"&error=true");//采用这种方式，客户端才能获取到以前输入的信息
                //请求转发
                request.setAttribute("uid", userName);
                request.setAttribute("userRole", role);
                request.setAttribute("error", "true");
                RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
                dis.forward(request, response);
            }
        }
        else if ("2".equals(role)) //超级管理员
        {
            if ("admin".equals(userName) && "admin".equals(password))
            {
                user.setName(userName);
                user.setPassword(password);
                //user.setRole(role);
                session.setAttribute("user", user);
                //System.out.println("登录成功");//测试用
                response.sendRedirect("result.jsp");//result.jsp页面用于给用户选择是要到query.jsp还是update.jsp页面
            }
            else
            {
                //System.out.println("登录失败");//测试用
                //重定向
                //response.sendRedirect("login.jsp?uid="+userName+"&userRole="+role+"&error=true");
                //请求转发
                request.setAttribute("uid", userName);
                request.setAttribute("userRole", role);
                request.setAttribute("error", "true");
                RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
                dis.forward(request, response);
            }
        }
        else//不存在的用户类型
        {
            //System.out.println("登录失败");//测试用
            //重定向
            //response.sendRedirect("login.jsp?uid="+userName+"&userRole="+role+"&error=true");
            //请求转发
            request.setAttribute("uid", userName);
            request.setAttribute("userRole", role);
            request.setAttribute("error", "true");
            RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
            dis.forward(request, response);
        }
    }
    
}
