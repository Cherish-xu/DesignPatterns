package 单例模式.type5;

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

// 懒汉式（线程安全的）
class Singleton {
    // 私有化构造器
    private Singleton() {
    }

    private static Singleton singleton;

    public  static Singleton getInstance() {
        if (singleton == null) {
            synchronized(Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }

}
