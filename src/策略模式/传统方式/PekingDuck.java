package 策略模式.传统方式;

/**
 * @Author: 张天旭
 * @Date: 2020/5/8 14:49
 * @Version 1.0
 */
public class PekingDuck extends Duck {

    /**
     * 显示鸭子的信息
     */
    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不会飞");
    }
}
