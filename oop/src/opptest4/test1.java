package opptest4;

public class test1 {
    public static void main(String[] args) {
        Worker w1=new Worker();
        w1.Age=68;
        w1.Name="杨旭";
        w1.Workdays=30;
        System.out.println("姓名："+w1.Name+"  年龄："+w1.Age+"岁  工作年龄:"+w1.Workdays+"年");
        w1.Work();
    }


}
