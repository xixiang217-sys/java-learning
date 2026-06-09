package Demo;

import java.util.Scanner;

public class Demo7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = contains(arr, num);
        System.out.println(result);
  }
    //定义一个方法，判断num在数组arr中是不是存在
        public static boolean contains(int[] arr, int num) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    return true;
                }
            }
            return false;
        }
}
