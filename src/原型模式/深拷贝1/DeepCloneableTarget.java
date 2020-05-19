package 原型模式.深拷贝1;

import java.io.Serializable;

/**
 * @Author: 张天旭
 * @Date: 2020/4/21 9:06
 * @Version 1.0
 */
public class DeepCloneableTarget implements Serializable ,Cloneable{


    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }


    // 默认的克隆会对基本数据类型进行拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
