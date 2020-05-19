package 单例模式.type7;

/**
 * @Author: 张天旭
 * @Date: 2020/4/10 16:19
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}

// 静态内部类  完成单例模式
class Singleton {
    // 私有化构造器
    private Singleton() {
    }

    private static Singleton singleton;

    // 一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一个静态的公有方法，直接返回静态内部类中的实例化对象属性
    public  static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
