package opptest8;

public class Students3 {
    private  String name;
    private int age;

    //构造方法

    public Students3() {
    }

    public Students3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //get set

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
    //行为；方法
    public void study() {
        System.out.println("学习");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
    public void eat() {
        System.out.println("吃饭");
    }
}
