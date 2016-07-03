/*
 * 文件名：CheckLoginInterceptor.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CheckLoginInterceptor.java
 * 修改人：Administrator
 * 修改时间：2016年7月3日
 * 修改内容：新增
 */
package com.sbs.edu.portal.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.sbs.edu.portal.LoginAction;

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
public class CheckLoginInterceptor extends AbstractInterceptor
{
    /**
     * TODO 添加字段注释
     */
    private static final long serialVersionUID = 1L;
    
    public static final String LOGIN_KEY = "LOGIN";
    
    public static final String LOGIN_PAGE = "global.login";
    
    public String intercept(ActionInvocation actionInvocation) throws Exception
    {
        System.out.println("begin check login interceptor!");
        
        // 对LoginAction不做该项拦截
        Object action = actionInvocation.getAction();
        if (action instanceof LoginAction)
        {
            System.out.println("exit check login, because this is login action.");
            return actionInvocation.invoke();
        }
        
        // 确认Session中是否存在LOGIN
        Map<?, ?> session = actionInvocation.getInvocationContext().getSession();
        String login = (String)session.get(LOGIN_KEY);
        if (login != null && login.length() > 0)
        {
            // 存在的情况下进行后续操作。
            System.out.println("already login!");
            return actionInvocation.invoke();
        }
        else
        {
            // 否则终止后续操作，返回LOGIN
            System.out.println("no login, forward login page!");
            return LOGIN_PAGE;
        }
    }
}
