/*
 * 文件名：RegisterAction.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： RegisterAction.java
 * 修改人：Administrator
 * 修改时间：2016年4月6日
 * 修改内容：新增
 */
package com.sbs.edu.portal;

import com.opensymphony.xwork2.ActionSupport;
import com.sbs.edu.basic.entity.User;
import com.sbs.edu.basic.service.IUserService;

/**
 * 注册Action。
 * <p>
 * 用于信用户的注册
 * <p>
 * register
 * <pre>
 * </pre>
 * 
 * @author     Administrator
 * @version    SBS V001R001 2016年4月6日
 * @since      SBS V001R001C00
 */
public class RegisterAction extends ActionSupport
{
    private IUserService userService;
    
    /**
     * 序列化
     */
    private static final long serialVersionUID = 1L;
    
    private User user;
    
    public String execute()
    {
        return SUCCESS;
    }

    public String register()
    {
        User user1 = userService.getUserByName(user.getName());
        if (null != user1)
        {
            // 已经存在用户
            return ERROR;
        }
        else if (!userService.addUser(user))
        {
            return ERROR;
        }
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
    
    public User getUser()
    {
        return user;
    }
    
    public void setUser(User user)
    {
        this.user = user;
    }
}
