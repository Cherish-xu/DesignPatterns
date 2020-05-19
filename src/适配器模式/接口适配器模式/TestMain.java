package 适配器模式.接口适配器模式;

import 单例模式.type1.Test;
import 建造者模式.传统实现.AbstractHouse;

/**
 * @Author: 张天旭
 * @Date: 2020/4/28 9:14
 * @Version 1.0
 */
public class TestMain extends AbsAdpater {

    // 在这里只需要去重写或实现自己需要的方法
    @Override
    public void test1() {
        System.out.println("这个是重写的test1方法");
    }

    public static void main(String[] args) {
        TestMain main = new TestMain();
        main.test1();
        main.test2();

    }
}
