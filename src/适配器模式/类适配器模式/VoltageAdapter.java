package 适配器模式.类适配器模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/28 8:33
 * @Version 1.0
 */
// 适配器类
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int outPut5V() {
        int src = outPut220V();
        int dstv = src / 44;
        return dstv;
    }
}
