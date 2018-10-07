package api.demo.bean;

import java.io.Serializable;

/**
 * @Author: CarryJey
 * @Date: 2018/10/7 10:47:27
 */

/**
 * desc：
 * 接口request和response定义
 */
public class DemoBean implements Serializable {

    private static final long seriaVersionUID = 2792428807215756098L;

    private int id;

    private String name;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemoBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
