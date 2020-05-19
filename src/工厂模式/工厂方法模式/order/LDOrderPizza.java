package 工厂模式.工厂方法模式.order;

import 工厂模式.工厂方法模式.pizza.*;

/**
 * @Author: 张天旭
 * @Date: 2020/4/15 11:18
 * @Version 1.0
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
        } else if (orderType.equals("choose")) {
            pizza = new LDChoosekPizza();
        }
        return pizza;
    }
}
