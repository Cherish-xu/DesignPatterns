package 工厂模式.工厂方法模式.pizza;

/**
 * @Author: 张天旭
 * @Date: 2020/4/15 11:02
 * @Version 1.0
 */
public class BJChoosePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京口味奶酪披萨");
        System.out.println("准备北京口味的奶酪披萨");
    }
}
