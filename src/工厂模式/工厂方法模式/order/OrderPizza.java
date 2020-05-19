package 工厂模式.工厂方法模式.order;

import 工厂模式.工厂方法模式.pizza.Pizza;

import java.util.Scanner;

/**
 * @Author: 张天旭
 * @Date: 2020/4/15 11:10
 * @Version 1.0
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("不好意思暂时没有您所选的种类");
                break;

            }

        } while (true);
    }

    // 获取客户需要订购的披萨种类
    private String getType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("您订购的披萨种类：");
        return sc.nextLine();
    }
}
