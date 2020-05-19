package 工厂模式.抽象工厂模式.order;

import 工厂模式.抽象工厂模式.pizza.*;

/**
 * @Author: 张天旭
 * @Date: 2020/4/17 16:49
 * @Version 1.0
 */
public class LDFactory implements AbsFactory {

    // 伦敦的工厂子类
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesekPizza();
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
