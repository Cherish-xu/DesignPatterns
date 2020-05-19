package 策略模式.策略模式;

import java.util.Arrays;

/**
 * @Author: 张天旭
 * @Date: 2020/5/8 16:01
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
    }
}
