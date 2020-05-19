package 建造者模式.传统实现;

/**
 * @Author: 张天旭
 * @Date: 2020/4/21 10:17
 * @Version 1.0
 */
public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子打砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子打封顶");
    }
}
