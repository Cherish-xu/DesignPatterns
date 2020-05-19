package 建造者模式.传统实现;

/**
 * @Author: 张天旭
 * @Date: 2020/4/21 10:14
 * @Version 1.0
 */
public abstract class AbstractHouse {

    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    // 由于这三个方法有前后的流程顺序，所以写在一个方法中
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
