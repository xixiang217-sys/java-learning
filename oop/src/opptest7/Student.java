package opptest7;

public class Student {
     private  String name;
     private int age;
     private String sex;
     private double height;
     public Student(String name, int age, String sex, double height){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.height=height;
        System.out.println("有参构造方法被调用");
    }
    public Student(){
         System.out.println("无参构造方法被调用");
    }
   //set get
    public void setName(String name){
         this.name=name;
    }
    public String getName(){
         return name;
    }
    public void setAge( int age){
         this.age=age;
    }
    public int getAge(){
         return age;
    }
    public void setSex(String sex){
         this.sex=sex;
    }
    public String getSex(){
         return sex;
    }
    public void setHeight(double height){
         this.height=height;
    }
    public double getHeight(){
         return height;
    }
}
