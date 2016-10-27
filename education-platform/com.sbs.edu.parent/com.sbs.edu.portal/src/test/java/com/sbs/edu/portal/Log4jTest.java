/*
 * 文件名：Log4jTest.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Log4jTest.java
 * 修改人：Administrator
 * 修改时间：2016年3月23日
 * 修改内容：新增
 */
package com.sbs.edu.portal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
public class Log4jTest
{
    static Logger logger = LogManager.getLogger(Log4jTest.class);
    
    public static void main(String[] args)
    {
        logger.trace("trace message");
        for (int i = 0; i < 1000; i++)
        {
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.trace("trace message");
//            logger.debug("debug message");
//            logger.info("info message");
//            logger.warn("warn message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.error("error message");
//            logger.fatal("fatal message");
            System.out.println("Hello World!");
            
            for (int j = 0; j < 10; j++)
            {
                logger.trace("trace message " + i);
                logger.debug("debug message " + i);
                logger.info("info message " + i);
                logger.warn("warn message " + i);
                logger.error("error message " + i);
                logger.fatal("fatal message " + i);
            }
            System.out.println("Hello World! 2");
        }
    }
}
