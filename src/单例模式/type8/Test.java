package 单例模式.type8;

/**
 * @Author: 张天旭
 * @Date: 2020/4/10 16:54
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        singleton1.sayOK();
        singleton2.sayOK();
    }
}

enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("ok~");
    }
}
