/*
 * 文件名：UserServiceImpl.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： UserServiceImpl.java
 * 修改人：Administrator
 * 修改时间：2016年5月15日
 * 修改内容：新增
 */
package com.sbs.edu.basic.service.impl;

import java.util.List;

import com.sbs.edu.basic.dao.IUserDAO;
import com.sbs.edu.basic.entity.User;
import com.sbs.edu.basic.service.IUserService;

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
 * @version    SBS V001R001 2016年5月15日
 * @since      SBS V001R001C00
 */
public class UserServiceImpl implements IUserService
{
    private IUserDAO userDAO;
    
    /** 
     * {@inheritDoc} 
     */
    @Override
    public User getUserByName(String name)
    {
        return userDAO.getUserByName(name);
    }
    
    /** 
     * {@inheritDoc} 
     */
    @Override
    public boolean addUser(User user)
    {
        return userDAO.addUser(user);
    }
    
    /** 
     * {@inheritDoc} 
     */
    @Override
    public boolean delUser(Integer id)
    {
        return false;
    }
    
    /** 
     * {@inheritDoc} 
     */
    @Override
    public boolean update(User user)
    {
        return false;
    }
    
    /** 
     * {@inheritDoc} 
     */
    @Override
    public List<User> queryAllUsers()
    {
        return null;
    }
    
    public IUserDAO getUserDAO()
    {
        return userDAO;
    }
    
    public void setUserDAO(IUserDAO userDAO)
    {
        this.userDAO = userDAO;
    }
}
