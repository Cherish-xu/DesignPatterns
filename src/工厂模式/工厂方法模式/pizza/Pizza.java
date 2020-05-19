package 工厂模式.工厂方法模式.pizza;

/**
 * @Author: 张天旭
 * @Date: 2020/4/14 8:42
 * @Version 1.0
 */
// 抽象的类
public abstract class Pizza {
    // 名字
    protected String name;

    // 准备原材料，因为每个披萨的原材料不同所以是抽象的
    public abstract void prepare();

    // 烘烤
    public void bake() {
        System.out.println(name + "披萨进行烘烤");
    }

    // 切割
    public void cut() {
        System.out.println(name + "披萨进行切割");
    }

    // 打包
    public void box() {
        System.out.println(name + "披萨进行打包");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
