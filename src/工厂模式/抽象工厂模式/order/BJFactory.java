package 工厂模式.抽象工厂模式.order;

import 工厂模式.抽象工厂模式.pizza.BJCheesePizza;
import 工厂模式.抽象工厂模式.pizza.BJGreekPizza;
import 工厂模式.抽象工厂模式.pizza.Pizza;

/**
 * @Author: 张天旭
 * @Date: 2020/4/17 16:41
 * @Version 1.0
 */
public class BJFactory implements AbsFactory {

    // 北京的工厂子类
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
