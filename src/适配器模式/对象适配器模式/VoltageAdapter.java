package 适配器模式.对象适配器模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/28 8:33
 * @Version 1.0
 */
// 适配器类
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    // 通过构造器传入一个实例,关联关系中的聚合关系
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int outPut5V() {
        int dst = 0;
        if (voltage220V != null) {
            // 获取被适配的电压数
            int src = voltage220V.outPut220V();
            System.out.println("使用是·对象适配器");
            dst = src / 44;
            System.out.println("适配完成，已完成电压转换");
        }
        return dst;
    }
}
