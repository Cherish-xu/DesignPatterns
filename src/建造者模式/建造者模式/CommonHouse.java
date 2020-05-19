package 建造者模式.建造者模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/26 15:04
 * @Version 1.0
 */
public class CommonHouse extends HouseBuild {

    House house = new House();
    @Override
    public void bulidBasic() {
        System.out.println("普通房子打地基，5米");
    }

    @Override
    public void bulidWalls() {
        System.out.println("普通房子砌墙，墙厚10厘米");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子搭屋顶，普通材质");
    }
}
