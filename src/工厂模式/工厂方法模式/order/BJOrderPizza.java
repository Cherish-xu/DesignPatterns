package 工厂模式.工厂方法模式.order;

import 工厂模式.工厂方法模式.pizza.BJChoosePizza;
import 工厂模式.工厂方法模式.pizza.BJGreekPizza;
import 工厂模式.工厂方法模式.pizza.Pizza;

/**
 * @Author: 张天旭
 * @Date: 2020/4/15 11:18
 * @Version 1.0
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
        } else if (orderType.equals("choose")) {
            pizza = new BJChoosePizza();
        }
        return pizza;
    }
}
