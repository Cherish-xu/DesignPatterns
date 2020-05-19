package 工厂模式.简单工厂模式.order;

import 工厂模式.简单工厂模式.pizza.Pizza;

import java.util.Scanner;

/**
 * @Author: 张天旭
 * @Date: 2020/4/14 8:50
 * @Version 1.0
 */
public class OrderPizza {

    private Pizza pizza = null;
    private String orderType = "";
    // 构造器
    public OrderPizza() {
        do {
            orderType = this.getType();
            pizza = SimpleFactory.createPizza(orderType);

            // 输出
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            } else {
                System.out.println("不好意思，目前还没有您订购的Pizza种类");
                break;
            }
        }while (true);
    }


    // 获取客户需要订购的披萨种类
    private String getType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("您订购的披萨种类：");
        return sc.nextLine();
    }
}
