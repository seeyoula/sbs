/*
 * 文件名：Util.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Util.java
 * 修改人：Administrator
 * 修改时间：2016年6月10日
 * 修改内容：新增
 */
package com.sbs.tools.poi;

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
 * @version    SBS V001R001 2016年6月10日
 * @since      SBS V001R001C00
 */
public class Util
{
    /**
     * get postfix of the path
     * @param path
     * @return
     */
    public static String getPostfix(String path)
    {
        if (path == null || Common.EMPTY.equals(path.trim()))
        {
            return Common.EMPTY;
        }
        if (path.contains(Common.POINT))
        {
            return path.substring(path.lastIndexOf(Common.POINT) + 1, path.length());
        }
        return Common.EMPTY;
    }
}
