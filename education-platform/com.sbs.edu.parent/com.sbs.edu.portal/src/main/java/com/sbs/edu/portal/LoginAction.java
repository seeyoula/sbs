/*
 * 文件名：LoginAction.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： LoginAction.java
 * 修改人：Administrator
 * 修改时间：2016年5月22日
 * 修改内容：新增
 */
package com.sbs.edu.portal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sbs.edu.basic.entity.User;
import com.sbs.edu.basic.service.IUserService;
import com.sbs.edu.basic.utils.MessageUtil;
import com.sbs.edu.basic.utils.VolidationUtil;

/**
 * 登陆模块
 * <p>
 * 用于验证用户登录状态
 * <p>
 * execute
 * <pre>
 * </pre>
 * 
 * @author     Administrator
 * @version    SBS V001R001 2016年5月22日
 * @since      SBS V001R001C00
 */
public class LoginAction extends ActionSupport
{
    /**
     * 打印日志
     */
    private static Logger LOGGER = LogManager.getLogger(LoginAction.class);
    
    /**
     * 序列化
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 注入用户服务
     */
    private IUserService userService;
    
    /** 
     * {@inheritDoc} 
     */
    @Override
    public String execute() throws Exception
    {
        if (LOGGER.isDebugEnabled())
        {
            LOGGER.debug(MessageUtil.ecodeMsg("start login to system."));
        }
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("userName");
        String pwd = request.getParameter("password");
        if (StringUtils.isBlank(username))
        {
            LOGGER.error("User Name can`t be null!");
            return ERROR;
        }
        if (StringUtils.isBlank(pwd))
        {
            LOGGER.error("Password can`t be null!");
            return ERROR;
        }
        User user = userService.getUserByName(username);
        if (null == user)
        {
            LOGGER.error("User is not found, please register!");
            return ERROR;
        }
        if (VolidationUtil.volidateStrEquals(user.getPassword(), pwd))
        {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return SUCCESS;
        }
        
        return ERROR;
    }
    
    /**
     * redirect
     */
    public String forwardMain()
    {
        return SUCCESS;
    }
    
    public IUserService getUserService()
    {
        return userService;
    }
    
    public void setUserService(IUserService userService)
    {
        this.userService = userService;
    }
    
}
