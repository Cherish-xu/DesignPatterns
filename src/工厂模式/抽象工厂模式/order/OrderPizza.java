package 工厂模式.抽象工厂模式.order;

import 工厂模式.抽象工厂模式.pizza.Pizza;

import java.util.Scanner;

/**
 * @Author: 张天旭
 * @Date: 2020/4/17 16:51
 * @Version 1.0
 */
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);

    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            } else {
                System.out.println("不好意思，暂时没有您订购的种类");
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
