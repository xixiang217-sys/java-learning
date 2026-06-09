package opptest3;

public class test1 {
   public static void main(String[] args) {
       Cook c1=new Cook();
       c1.Name="杨豪";
       c1.Age=20;

       System.out.println("姓名："+c1.Name+"  年龄："+c1.Age+"岁");
       c1.cook();
   }
}
