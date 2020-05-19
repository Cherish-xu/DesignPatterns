package 工厂模式.工厂方法模式.order;

import java.util.Scanner;

/**
 * @Author: 张天旭
 * @Date: 2020/4/15 11:22
 * @Version 1.0
 */
public class PizzaStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的所在地:");
        String city = sc.nextLine();
        if (city.equals("beijing")) {
            new BJOrderPizza();
        } else if (city.equals("lundun")) {
            new LDOrderPizza();
        } else {
            System.out.println("不好意思，您所在的城市暂不支持订购服务");
        }
    }
}
