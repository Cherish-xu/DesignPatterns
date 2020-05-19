package 工厂模式.简单工厂模式.order;

import 工厂模式.简单工厂模式.pizza.CheesePizza;
import 工厂模式.简单工厂模式.pizza.GreekPizza;
import 工厂模式.简单工厂模式.pizza.Pizza;

/**
 * @Author: 张天旭
 * @Date: 2020/4/14 9:44
 * @Version 1.0
 */
// 简单工厂类
public class SimpleFactory {

    // 根据orderType返回对应的Pizza实例对象
    public static Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }

        return pizza;
    }
}
