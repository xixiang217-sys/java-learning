package Demo;

import java.util.Scanner;

public class Demo4  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数");
        int number=sc.nextInt();
        if(number>=10||number<=1){
            System.out.println("这个数不在1和10之间");
        }else{
            System.out.println("这个数在1和10之间");
        }
    }
}
