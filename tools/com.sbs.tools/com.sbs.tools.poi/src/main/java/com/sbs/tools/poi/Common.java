/*
 * 文件名：Common.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Common.java
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
public class Common
{
    public static final String OFFICE_EXCEL_2003_POSTFIX = "xls";
    
    public static final String OFFICE_EXCEL_2010_POSTFIX = "xlsx";
    
    public static final String EMPTY = "";
    
    public static final String POINT = ".";
    
    public static final String LIB_PATH = "lib";
    
    public static final String STUDENT_INFO_XLS_PATH = LIB_PATH + "/student_info" + POINT + OFFICE_EXCEL_2003_POSTFIX;
    
    public static final String STUDENT_INFO_XLSX_PATH = LIB_PATH + "/student_info" + POINT + OFFICE_EXCEL_2010_POSTFIX;
    
    public static final String NOT_EXCEL_FILE = " : Not the Excel file!";
    
    public static final String PROCESSING = "Processing...";
}
