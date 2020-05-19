package 建造者模式.建造者模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/26 15:00
 * @Version 1.0
 */
// 抽象的建造者
public abstract class HouseBuild {
    private House house = new House();

    // 具体的建造过程需要用的的步骤
    public abstract void bulidBasic();

    public abstract void bulidWalls();

    public abstract void roofed();

    // 调用建造房子的每个流程的方法，开始建造
    // 将成品返回
    public House buildHouse() {
        return house;
    }


}
