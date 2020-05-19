package 策略模式.传统方式;

/**
 * @Author: 张天旭
 * @Date: 2020/5/8 14:44
 * @Version 1.0
 */
public abstract class Duck {
    public Duck() {
    }

    public void quack() {
        System.out.println("鸭子会叫");
    }
    public void swim() {
        System.out.println("鸭子会游泳");
    }
    public void fly() {
        System.out.println("鸭子会飞");
    }

    /**
     * 显示鸭子的信息
     *
     */
    public abstract void display();
}
