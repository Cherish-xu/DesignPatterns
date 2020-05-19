package 工厂模式.简单工厂模式.order;

/**
 * @Author: 张天旭
 * @Date: 2020/4/14 8:57
 * @Version 1.0
 */
// 相当于一个客户端
public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza();
        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("----退出程序----");
        new OrderPizza();
    }
}
