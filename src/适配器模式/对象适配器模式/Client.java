package 适配器模式.对象适配器模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/28 8:38
 * @Version 1.0
 */
// 对象适配器模式
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
