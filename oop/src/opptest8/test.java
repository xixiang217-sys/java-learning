package opptest8;

import opptest6.Student;

public class test {
    public static void main(String[] args) {

        Students3 s1 = new Students3("向熙", 19);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        s1.sleep();
        s1.study();
        s1.eat();
    }
}
