/*
 * 文件名：Client.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Client.java
 * 修改人：Administrator
 * 修改时间：2016年6月10日
 * 修改内容：新增
 */
package com.sbs.tools.poi;

import java.io.IOException;
import java.util.List;

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
public class Client
{
    public static void main(String[] args) throws IOException
    {
        String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
        String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
        // read the 2003-2007 excel
        List<Student> list = new ReadyExcelWithPoi().readExcel(excel2010);
        if (list != null)
        {
            for (Student student : list)
            {
                System.out.println("No. : " + student.getNo() + ", name : " + student.getName() + ", age : "
                    + student.getAge() + ", score : " + student.getScore());
            }
        }
        System.out.println("======================================");
        // read the 2010 excel
        List<Student> list1 = new ReadyExcelWithPoi().readExcel(excel2010);
        if (list1 != null)
        {
            for (Student student : list1)
            {
                System.out.println("No. : " + student.getNo() + ", name : " + student.getName() + ", age : "
                    + student.getAge() + ", score : " + student.getScore());
            }
        }
    }
}
