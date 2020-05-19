package 建造者模式.建造者模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/26 14:59
 * @Version 1.0
 */
// 产品-->Product
public class House {

    private String baise;
    private String walls;
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String wall) {
        this.walls = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
