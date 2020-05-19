package 适配器模式.接口适配器模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/28 9:13
 * @Version 1.0
 */
public abstract class AbsAdpater implements InterfaceTest {

    // 默认实现所有类
    // 如果你认为这里有的方法是需要继承者必须重写的，就不实现，当子类继承是不需要强制实现

    // 假设这个test1的方法是我们需要的方法，那么我们就保留这个抽象的方法
    @Override
    public abstract void test1();

    @Override
    public void test2() {

    }

    @Override
    public void test3() {

    }

    @Override
    public void test4() {

    }

    @Override
    public void test5() {

    }

    @Override
    public void test6() {

    }

    @Override
    public void test7() {

    }

    @Override
    public void test8() {

    }
}
