/*
 * 文件名：User.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： User.java
 * 修改人：Administrator
 * 修改时间：2016年3月23日
 * 修改内容：新增
 */
package com.sbs.edu.basic.entity;

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
public class User
{
    /**
     * 用户ID
     */
    private String id;
    
    /**
     * 用户名
     */
    private String name;
    
    /**
     * 用户密码登录
     */
    private String password;
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
}
