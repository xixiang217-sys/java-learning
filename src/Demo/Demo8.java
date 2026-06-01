package Demo;

import java.util.Scanner;

public class Demo8 {
//定义一个方法判断num在数组arr中是否存在
public static boolean contain(int arr[],int num){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
            return true;
        }

    }
    return false;
 }
/* //生成一个随机数组
    public static int[] createarray(int length){
        int[] arr=new int[length];
       for(int i=0;i<length;i++){
           arr[i]=(int)(Math.random()*101)+50;
       }
        return arr;
    }
    没必要创建一个方法
    */
//得到一个没有重复的数组
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<arr.length;i++){
           int temp=(int)(Math.random()*101)+50;
           while(contain(arr,temp)){
               temp=(int)(Math.random()*101)+50;
           }
           arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
      }
    }


