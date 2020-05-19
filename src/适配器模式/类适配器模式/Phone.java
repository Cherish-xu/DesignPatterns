package 适配器模式.类适配器模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/28 8:36
 * @Version 1.0
 */
public class Phone {

    public void charging(Voltage5V v) {
        if (v.outPut5V() == 5) {
            System.out.println("电压为5V，已完成转换");
        } else if (v.outPut5V() > 5) {
            System.out.println("电压过高，此时充电会损坏手机");
        }
    }
}
