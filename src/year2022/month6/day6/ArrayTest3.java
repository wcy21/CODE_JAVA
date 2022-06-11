package year2022.month6.day6;

public class ArrayTest3 {
    public static void main(String[] args) {
//        int[] arr = {1, -2, 3, -5, 0, -9, 4};
//        int index = getIndex(arr, 4);

        int[] arr = {1, 3, 5, 9, 11, 16, 18};
        int index = halfSearch2(arr, 8);
        System.out.println("index = " + index);

    }

    // 折半查找,需要保证数组有序
    public static int halfSearch(int[] arr, int key) {
        int min, max, mid;
        min = 0;
        max = arr.length - 1;
        mid = (max + min) / 2;

        while (arr[mid] != key) {
            if (key > arr[mid]) {
                min = mid + 1;
            } else if (key < arr[mid]) {
                max = mid - 1;
            }

            if (min > max) {
                return -1;
            }
            mid = (max + min) / 2;
        }
        return mid;
    }

    // 折半查找的另一种循环写法
    public static int halfSearch2(int[] arr, int key) {
        int min = 0, max = arr.length - 1, mid;

        while (min <= max) {
            mid = (max + min) / 2;

            if (key > arr[mid]) {
                min = mid + 1;
            } else if (key < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // 数组的查找
    // 下标从0查找，返回-1表示没找到
    public static int getIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
