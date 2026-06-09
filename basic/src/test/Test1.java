import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //红包总金额：20000分
        int money = 20000;
        //红包人数5人
        int n = 5;

        //规则：每人最少1分钱，前面n-1人随机，最后1人拿剩余，预留后面每人至少1分
        if (money < n) {
            System.out.println("红包金额不够,请充值~");
        } else {
            Random r = new Random();
            //循环前n-1个人
            for (int i = 1; i <= n - 1; i++) {
                /*
                bound = 当前剩余钱 - 后面还剩(n-i)人 * 1分（给后面每人保底1分）
                +1：nextInt是左闭右开，+1保证最少能抢到1分
                */
                int myMoney = r.nextInt(money - (n - i)) + 1;
                money = money - myMoney;
                System.out.println("第" + i + "个人，抢到" + myMoney + "分");
            }
            //最后一人拿剩下所有
            System.out.println("第" + n + "个人，抢到" + money + "分");
        }
    }
}