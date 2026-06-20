package opptest10;
//工具类
public class arrayuitl {
    private arrayuitl() {}//私有化构造方法
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
