/*
 * 文件名：DAOUtil.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： DAOUtil.java
 * 修改人：Administrator
 * 修改时间：2016年5月15日
 * 修改内容：新增
 */
package com.sbs.edu.basic.utils;

import java.sql.SQLException;

import org.springframework.web.context.ContextLoader;

import com.ibatis.sqlmap.client.SqlMapClient;

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
public class DAOUtil
{
    private static DAOUtil instance = null;
    
    private SqlMapClient sqlMapClient;
    
    private DAOUtil()
    {
        if (ContextLoader.getCurrentWebApplicationContext().containsBean("sqlMapClient"))
        {
            sqlMapClient = (SqlMapClient)ContextLoader.getCurrentWebApplicationContext().getBean("sqlMapClient");
        }
    }
    
    public static DAOUtil getInstance()
    {
        if (null == instance)
        {
            synchronized (DAOUtil.class)
            {
                if (null == instance)
                {
                    instance = new DAOUtil();
                }
            }
        }
        return instance;
    }
    
    /**
     * 根据sql-ID和参数返回查询结果。
     * 
     * @param paramString sql-ID
     * @param paramObject 查询参数
     * @return 查询结果
     */
    public Object queryForObject(String paramString, Object paramObject)
    {
        try
        {
            return this.sqlMapClient.queryForObject(paramString, paramObject);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * 添加对象。
     * 
     * @param paramString 添加对象sql-ID
     * @param paramObject 添加对象
     * @return 结果
     */
    public Object insert(String paramString, Object paramObject)
    {
        try
        {
            return sqlMapClient.insert(paramString, paramObject);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
