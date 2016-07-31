/*
 * 文件名：UserDAOImpl.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： UserDAOImpl.java
 * 修改人：Administrator
 * 修改时间：2016年3月23日
 * 修改内容：新增
 */
package com.sbs.edu.basic.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.sbs.edu.basic.dao.IUserDAO;
import com.sbs.edu.basic.entity.User;
import com.sbs.edu.basic.utils.DAOUtil;

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
 * @version    SBS V001R001 2016年3月23日
 * @since      SBS V001R001C00
 */
public class UserDAOImpl implements IUserDAO
{
    Logger log = Logger.getLogger(UserDAOImpl.class);
    
    /** 
     * {@inheritDoc} 
     */
    public User getUserByName(String name)
    {
        return (User)DAOUtil.getInstance().queryForObject("selectUserByName", name);
    }
    
    /** 
     * {@inheritDoc} 
     */
    public boolean addUser(User user)
    {
        Object ret = DAOUtil.getInstance().insert("addUser", user);
        if (null == ret)
        {
            return false;
        }
        return true;
    }
    
    /** 
     * {@inheritDoc} 
     */
    public boolean delUser(Integer id)
    {
        return false;
    }
    
    /** 
     * {@inheritDoc} 
     */
    public boolean update(User user)
    {
        return false;
    }
    
    /** 
     * {@inheritDoc} 
     */
    public List<User> queryAllUsers()
    {
        return null;
    }
}
