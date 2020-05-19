package 工厂模式.简单工厂模式.pizza;

/**
 * @Author: 张天旭
 * @Date: 2020/4/14 8:48
 * @Version 1.0
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原料");
    }
}
