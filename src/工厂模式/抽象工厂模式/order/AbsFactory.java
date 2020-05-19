package 工厂模式.抽象工厂模式.order;

/**
 * @Author: 张天旭
 * @Date: 2020/4/17 16:39
 * @Version 1.0
 */

import 工厂模式.抽象工厂模式.pizza.Pizza;

/**
 * 这是抽象工厂模式的抽象层（接口）
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
