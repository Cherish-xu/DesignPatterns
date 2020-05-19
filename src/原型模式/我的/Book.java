package 原型模式.我的;

import 原型模式.深拷贝1.DeepProtoType;

import java.io.*;

/**
 * @Author: 张天旭
 * @Date: 2020/4/20 19:43
 * @Version 1.0
 */
public class Book implements Cloneable, Serializable {

    // 重写clone方法
    @Override
    protected Object clone() {
        Book book = null;
        try {
            book = (Book) super.clone();
            book.tags = (Tags) tags.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }


    // 深拷贝   通过对象的序列化实现
    public Object bookClone() {
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
            Book book = (Book) ois.readObject();
            return book;
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


    private String name;
    private int age;
    private String sex;
    private Ink ink ;
    private Tags tags;

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Book(String name, int age, String sex, Ink ink, Tags tags) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ink = ink;
        this.tags = tags;
    }

    public Book() {
    }
}
