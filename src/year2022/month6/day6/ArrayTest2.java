package year2022.month6.day6;

import java.util.Arrays;

public class ArrayTest2 {
    // 选择排序法排序数组
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /*
      排序需要对元素位置进行交换，
      将相同代码提取封装成一个函数
     */
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 6, 9, 3, 2, 5};

        System.out.printf("排序前的数组：");
        ArrayDemo.printArray(arr);

//        selectSort(arr);
//        bubbleSort(arr);
        Arrays.sort(arr);

        System.out.printf("排序后的数组：");
        ArrayDemo.printArray(arr);
    }
}
