package opptest7;

public class test {
    public static void main(String[] args) {
        /*Student s1=new Student();
        
        System.out.println("姓名："+s1.getName()+"  年龄："+s1.getAge()+"岁  性别："+s1.getSex()+"  身高："+s1.getHeight());*/


        Student s1=new Student("向熙", 20, "男", 180.0);
        System.out.println("姓名："+s1.getName()+"  年龄："+s1.getAge()+"岁  性别："+s1.getSex()+"  身高："+s1.getHeight());


    }

}
