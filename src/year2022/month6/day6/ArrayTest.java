package year2022.month6.day6;

public class ArrayTest {
    /* 获取数组中的最大值
     步骤
      1.用变量存储最大值，初始化为数组任意一个元素即可
      2.循环语句遍历数组，将元素与存储的最大值进行比较
      3.若遍历的元素大于最大值变量，将该元素赋值给最大值
     需求
      1.返回int类型数组的最大元素
      2.int[]类型未知数组变量参与函数运算
    */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // max初始化为数组下标0
    public static double getMax(double[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                arr[max] = arr[i];
            }
        }
        return arr[max];
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 15, 9, 2, 6, 5, 3, 58, 9, 7, 93, 23, 8};
        int max = getMax(arr);
        System.out.println("max = " + max);

        double[] arr2 = {4.6, 2.6, 4.3, 3.8, 3.2, 7.9, 5.0, 2.8, 8.4, 1.9};
        double max2 = getMax(arr2);
        System.out.println("max2 = " + max2);
    }
}
