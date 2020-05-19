package 工厂模式.抽象工厂模式.pizza;

/**
 * @Author: 张天旭
 * @Date: 2020/4/15 11:02
 * @Version 1.0
 */
public class LDCheesekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦口味奶酪披萨");
        System.out.println("准备伦敦口味的奶酪披萨");
    }
}
