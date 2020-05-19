package 策略模式.策略模式;

/**
 * @Author: 张天旭
 * @Date: 2020/5/8 14:47
 * @Version 1.0
 */
public class WildDuck extends Duck{

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    /**
     * 显示鸭子的信息
     */
    @Override
    public void display() {
        System.out.println("这是野鸭子的");
    }

}
