/*
 * 文件名：IEncryption.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： IEncryption.java
 * 修改人：Administrator
 * 修改时间：2016年10月30日
 * 修改内容：新增
 */
package com.sbs.edu.common.encrypt;

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
 * @version    SBS V001R001 2016年10月30日
 * @since      SBS V001R001C00
 */
public interface IEncryption
{
    /**
     * 加密。
     * 
     * @param plainText 明文
     * @param algorithm 加密算法
     * @return 密文
     */
    String encrypt(String plainText, String algorithm);
}
