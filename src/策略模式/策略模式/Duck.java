package 策略模式.策略模式;

/**
 * @Author: 张天旭
 * @Date: 2020/5/8 14:44
 * @Version 1.0
 */
public abstract class Duck {
    // 属性，策略接口

    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void quack() {
        System.out.println("鸭子会叫");
    }

    public void swim() {
        System.out.println("鸭子会游泳");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    /**
     * 显示鸭子的信息
     */
    public abstract void display();
}
