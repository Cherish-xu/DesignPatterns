package 建造者模式.建造者模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/26 15:07
 * @Version 1.0
 */
// 指挥者，动态的指定制作流程，返回成品
public class HouseDirector {

    HouseBuild houseBuild = null;

    // 1.构造器传入houseBuild
    public HouseDirector(HouseBuild houseBuild) {
        this.houseBuild = houseBuild;
    }

    // 2.通过set方法传入
    public void setHouseBuild(HouseBuild houseBuild) {
        this.houseBuild = houseBuild;
    }

    // 具体具体盖房子的流程由指挥者决定，先干什么在干什么
    public House constructHouse() {
        houseBuild.bulidBasic();
        houseBuild.bulidWalls();
        houseBuild.roofed();
        return houseBuild.buildHouse();
    }

}
