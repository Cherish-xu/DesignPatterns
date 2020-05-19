package 建造者模式.建造者模式;

/**
 * @Author: 张天旭
 * @Date: 2020/4/26 15:12
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 盖普通房子
        CommonHouse commonHouse = new CommonHouse();

        // 创建指挥者    传入的参数决定建造的类型
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        // 返回成品
        House house = houseDirector.constructHouse();

    }
}
