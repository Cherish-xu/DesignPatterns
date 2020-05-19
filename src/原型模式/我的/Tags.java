package 原型模式.我的;

import java.io.Serializable;

/**
 * @Author: 张天旭
 * @Date: 2020/4/21 9:27
 * @Version 1.0
 */
public class Tags implements Serializable,Cloneable {

    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
