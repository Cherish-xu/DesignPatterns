package 原型模式.改进1;

/**
 * @Author: 张天旭
 * @Date: 2020/4/20 18:17
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 传统方式，创建十只羊（tom）
        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();
        Sheep sheep6 = (Sheep) sheep.clone();
        Sheep sheep7 = (Sheep) sheep.clone();
        Sheep sheep8 = (Sheep) sheep.clone();
        Sheep sheep9 = (Sheep) sheep.clone();
        Sheep sheep10 = (Sheep) sheep.clone();

        System.out.println(sheep2);

    }
}
