package 原型模式.传统方式实现;

/**
 * @Author: 张天旭
 * @Date: 2020/4/20 18:17
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 传统方式，创建十只羊（tom）
        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep6 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep7 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep8 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep9 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep10 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());


    }
}
