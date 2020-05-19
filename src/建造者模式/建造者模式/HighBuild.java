package 建造者模式.建造者模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/26 15:05
 * @Version 1.0
 */
public class HighBuild extends HouseBuild {
    @Override
    public void bulidBasic() {
        System.out.println("高楼打地基，50米");
    }

    @Override
    public void bulidWalls() {
        System.out.println("高楼砌墙，墙厚20厘米");
    }

    @Override
    public void roofed() {
        System.out.println("高楼搭屋顶，强化材质");
    }
}
