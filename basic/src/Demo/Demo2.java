package Demo;

import java.net.SocketOption;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的身高");
        Double myheight=sc.nextDouble();
        System.out.println("请输入朋友的身高");
        Double myfriendheight=sc.nextDouble();
        boolean result=myheight>myfriendheight;
        System.out.println("我比朋友高吗？");
        System.out.println(result);
     }

}
