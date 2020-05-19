package 适配器模式.对象适配器模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/28 8:30
 * @Version 1.0
 */
// 被适配的类
public class Voltage220V {

    public int outPut220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }

}
