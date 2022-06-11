package year2022.month6.day6;

public class FunctionDemo2 {
    public static void main(String[] args) {
        int sum = getSum(4, 6);
        System.out.println("sum = " + sum);

        sum = getSum(1, -1);
        System.out.println("sum = " + sum);
    }

    /* 需求：定义功能，完成3+4运算，并返回结果
     1.明确返回值类型
     2.明确参数列表
     */
    public static int getSum() {
        return 3 + 4;
    }

    /* 需求：用户指定两个加数，返回结果
     1.返回int类型的和
     2.两个int类型未知数参与运算
     */
    public static int getSum(int x, int y) {
        return x + y;
    }

    /* 需求：判断两个数是否相同
     1.结果是boolean类型
     2.有两个int类型未知数参与运算
     */
    public static boolean compare(int a, int b) {
        return a == b;
    }

    /* 需求：获取两个数中最大的数
     1.返回int类型数
     2.两个int类型未知数参与运算
     */
    public static int getMax(int x, int y) {
        return (x > y) ? x : y;
    }
}
