/*
 * 文件名：VolidationUtil.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： VolidationUtil.java
 * 修改人：Administrator
 * 修改时间：2016年7月31日
 * 修改内容：新增
 */
package com.sbs.edu.basic.utils;

import org.apache.commons.lang3.StringUtils;

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
 * @version    SBS V001R001 2016年7月31日
 * @since      SBS V001R001C00
 */
public class VolidationUtil
{
    public static String volidateNull(String params)
    {
        return StringUtils.isBlank(params) ? null : params;
    }
    
    public static boolean volidateStrEquals(String src, String target)
    {
        if(null == src)
        {
            if(null == target)
            {
                return true;
            }
            return false;
        }
        return src.equals(target);
    }
}
