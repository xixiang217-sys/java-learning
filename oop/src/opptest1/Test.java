package opptest1;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.Age=2;
        dog1.Name="小黑";
        dog1.Weight=5.0;
        dog1.Color="黑色";
        System.out.println("名字是："+dog1.Name+"，年龄是："+dog1.Age+"岁，体重是："+dog1.Weight+"公斤，颜色是："+dog1.Color);

        Dog dog2 = new Dog();
        dog2.Age=3;
        dog2.Name="小黄";
        dog2.Weight=4.0;
        dog2.Color="黄色";
        System.out.println("名字是："+dog2.Name+"，年龄是："+dog2.Age+"岁，体重是："+dog2.Weight+"公斤，颜色是："+dog2.Color);

    }
}
