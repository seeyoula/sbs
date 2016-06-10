/*
 * 文件名：Student.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Student.java
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
public class Student
{
    /**
     * id   
     */
    private Integer id;
    
    /**
     * 学号
     */
    private String no;
    
    /**
     * 姓名
     */
    private String name;
    
    /**
     * 学院
     */
    private String age;
    
    /**
     * 成绩
     */
    private float score;
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    public String getNo()
    {
        return no;
    }
    
    public void setNo(String no)
    {
        this.no = no;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getAge()
    {
        return age;
    }
    
    public void setAge(String age)
    {
        this.age = age;
    }
    
    public float getScore()
    {
        return score;
    }
    
    public void setScore(float score)
    {
        this.score = score;
    }
}
