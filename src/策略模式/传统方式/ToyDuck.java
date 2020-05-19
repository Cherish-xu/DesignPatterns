package 策略模式.传统方式;

/**
 * @Author: 张天旭
 * @Date: 2020/5/8 14:51
 * @Version 1.0
 */
public class ToyDuck extends Duck {

    /**
     * 显示鸭子的信息
     */
    @Override
    public void display() {
        System.out.println("玩具鸭子");
    }

    // 需要重写父类的所有方法

    @Override
    public void quack() {
        System.out.println("玩具鸭子不会叫");
    }
    @Override
    public void swim() {
        System.out.println("玩具鸭子不会游泳");
    }
    @Override
    public void fly() {
        System.out.println("玩具鸭子不会飞");
    }

}
