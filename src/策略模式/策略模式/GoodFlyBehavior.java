package 策略模式.策略模式;

/**
 * @Author: 张天旭
 * @Date: 2020/5/8 15:52
 * @Version 1.0
 */
public class GoodFlyBehavior implements FlyBehavior {

    /**
     * 子类具体实现
     */
    @Override
    public void fly() {
        System.out.println("这个鸭子飞翔技术高超");
    }
}
