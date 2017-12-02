/*
 * 文件名：EncryptTest.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： EncryptTest.java
 * 修改人：Administrator
 * 修改时间：2016年10月30日
 * 修改内容：新增
 */
package com.sbs.edu.portal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
public class EncryptTest
{
    /**
     * 传入文本内容，返回 SHA-256 串
     * 
     * @param strText
     * @return
     */
    public String SHA256(final String strText)
    {
        return SHA(strText, "SHA-256");
    }
    
    /**
     * 传入文本内容，返回 SHA-512 串
     * 
     * @param strText
     * @return
     */
    public String SHA512(final String strText)
    {
        return SHA(strText, "SHA-512");
    }
    
    public static void main(String[] args)
    {
        EncryptTest test = new EncryptTest();
        String plainText = "HelloWorld";
        String sha512 = test.SHA512(plainText);
        String sha256 = test.SHA256(plainText);
        System.out.println("明文是：" + plainText);
        System.out.println("SHA-256:" + sha256);
        System.out.println("SHA-512:" + sha512);
    }
    
    /**
     * 字符串 SHA 加密
     * 
     * @param strSourceText
     * @return
     */
    private String SHA(final String strText, final String strType)
    {
        // 返回值
        String strResult = null;
        
        // 是否是有效字符串
        if (strText != null && strText.length() > 0)
        {
            try
            {
                // SHA 加密开始
                // 创建加密对象 并傳入加密類型
                MessageDigest messageDigest = MessageDigest.getInstance(strType);
                // 传入要加密的字符串
                messageDigest.update(strText.getBytes());
                // 得到 byte 類型结果
                byte byteBuffer[] = messageDigest.digest();
                
                // 將 byte 轉換爲 string
                StringBuffer strHexString = new StringBuffer();
                // 遍歷 byte buffer
                for (int i = 0; i < byteBuffer.length; i++)
                {
                    String hex = Integer.toHexString(0xff & byteBuffer[i]);
                    if (hex.length() == 1)
                    {
                        strHexString.append('0');
                    }
                    strHexString.append(hex);
                }
                // 得到返回結果
                strResult = strHexString.toString();
            }
            catch (NoSuchAlgorithmException e)
            {
                e.printStackTrace();
            }
        }
        return strResult;
    }
}
