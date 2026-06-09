package Demo;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number=sc.nextInt();
        boolean result=number>=1&&number<=10;
        if(result)
            System.out.println("你输入的整数是1-10之间的");
            else
                System.out.println("你输入的整数不是1-10之间的");



    }
}
