package 单例模式.type3;

/**
 * @Author: 张天旭
 * @Date: 2020/4/10 16:08
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}


class Singleton {
    // 私有化构造器
    private Singleton() {
    }

    // 创建一个singleton的属性，但是不创建实例化对象
    private static Singleton singleton;

    // 提供一个静态的公有方法，在使用该方法时才去创建实例化对象
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
