package Demo;

public class Demo10 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        int val=1;
        int slow=0; //慢指针
        int fast=0;//快指针
        while(fast<arr.length){
            //相等
            if(arr[fast]==val){
              fast++;
            }
            //不相等
            else{
                arr[slow]=arr[fast];
                slow++;
                fast++;
            }
        }
        for(int i=0;i<slow;i++){
            System.out.println(arr[i]);
        }
    }
}
