/*
 * 文件名：UserDAO.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： UserDAO.java
 * 修改人：Administrator
 * 修改时间：2016年3月23日
 * 修改内容：新增
 */
package com.sbs.edu.basic.dao;

import java.util.List;

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
 * @version    SBS V001R001 2016年3月23日
 * @since      SBS V001R001C00
 */
public interface IUserDAO
{
    /**
     * 根据用户名查询用户信息。
     * 
     * @param name 用户名
     * @return 用户
     */
    User getUserByName(String name);
    
    /**
     * 添加用户信息。
     * 
     * @param user 用户信息
     * @return 添加结果：true, 成功；false, 失败
     */
    boolean addUser(User user);
    
    /**
     * 销户。
     * 
     * @param id 根据用户id进行删除
     * @return 删除结果：true, 成功；false, 失败
     */
    boolean delUser(Integer id);
    
    /**
     * 更新用户信息
     * 
     * @param user 用户信息
     * @return 更新结果 ：true, 成功；false, 失败
     */
    boolean update(User user);
    
    /**
     * 查询所有用户
     * 
     * @return 用户列表
     */
    List<User> queryAllUsers();
}
