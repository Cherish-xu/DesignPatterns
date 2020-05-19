package 策略模式.策略模式;

/**
 * @Author: 张天旭
 * @Date: 2020/5/8 15:53
 * @Version 1.0
 */
public class BadFlyBehavior implements FlyBehavior {
    /**
     * 子类具体实现
     */
    @Override
    public void fly() {
        System.out.println("这个鸭子飞向技术一半");
    }
}
