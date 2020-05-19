package 建造者模式.传统实现;

/**
 * @Author: 张天旭
 * @Date: 2020/4/21 10:19
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
