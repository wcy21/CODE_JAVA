public class ArrayDemo {
    public static void main(String[] args) {
        // 需求：定义一个可以存储3个整数的数组
        int[] arr = new int[3];

        // 第二种数组定义方式
        int[] arr2 = new int[]{1, 4, 2, 8, 5};

        // 获取数组中的元素，通常用到遍历
        // 数组名.length 可获得数组长度
        System.out.print("arr2: ");
        printArray(arr2);

        System.out.println("arr2.length = " + arr2.length);

        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
            sum += arr2[i];
        }
        System.out.println("sum = " + sum);
    }

    // 打印数组中元素，元素间以逗号间隔
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "]\n");
            }
        }
    }
}
