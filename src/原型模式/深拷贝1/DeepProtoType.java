package 原型模式.深拷贝1;

import sun.dc.pr.PRError;

import java.io.*;

/**
 * @Author: 张天旭
 * @Date: 2020/4/21 9:08
 * @Version 1.0
 */
public class DeepProtoType implements Serializable ,Cloneable {

    private String name;
    public  DeepCloneableTarget deepCloneableTarget; // 引用数据类型

    public DeepProtoType() {
    }

    // 完成深拷贝实现
    // 方式一  使用clone方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 先完成对基本数据类型的克隆
        deep = super.clone();
        // 单独对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }


    // 深拷贝   通过对象的序列化实现
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前这个对象以流的方式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType deepProtoType = (DeepProtoType) ois.readObject();
            return deepProtoType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            // 关闭打开的流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
