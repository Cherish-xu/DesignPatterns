package 单例模式.type2;

/**
 * @Author: 张天旭
 * @Date: 2020/4/10 15:39
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

// 饿汉式（静态代码块）
class Singleton {
    // 1.私有化构造器
    private Singleton() {
    }

    // 在静态代码块中创建单例对象
    static {
        singleton = new Singleton();
    }

    // 2.在本类内部创建对选哪个实例
    private static Singleton singleton;

    // 3.对外提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return singleton;
    }
}


