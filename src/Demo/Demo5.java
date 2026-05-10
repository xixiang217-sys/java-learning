package Demo;
import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args) {
        Boolean result1=true;
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个数");
        int number=sc.nextInt();

        //判断一个数有几位
        int count=1;
        int tool=number;

    if(tool==0){
        result1=true;
    }
    else{
        while(tool/10!=0){
            count++;
            tool=tool/10;
        }
    }
    //奇数位的情况
    if(count%2!=0){
        int headnumber=number;
        int endnumber=number;
        int num=1;
        for(int j=0;j<count-1;j++){
            num*=10;
        }
        for(int i=(count-1)/2;i>=0;i--){
            if(headnumber/num!=endnumber%10){
                result1=false;
                break;
            }
            headnumber=headnumber%num;
            num=num/10;
            endnumber=endnumber/10;
        }
    }
    //偶数位的情况
    else{
        int headnumber1=number;
        int endnumber1=number;
        int num=1;
        for(int j=0;j<count-1;j++){
            num*=10;
        }
        for(int i=count/2-1;i>=0;i--){
            if(headnumber1/num!=endnumber1%10){
                result1=false;
                break;
            }
            headnumber1=headnumber1%num;
            num=num/10;
            endnumber1=endnumber1/10;
        }
    }
    if(result1) {System.out.println("是回文数");}
    else{System.out.println("不是回文数");}
}
}
