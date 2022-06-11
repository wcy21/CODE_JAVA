public class FunctionTest {
    public static void main(String[] args) {
        draw(5, 7);
        printSplitLine();
        draw(3, 9);
    }

    /* 需求：打印矩形
     1.无返回值类型
     2.有两个未知数（行，列）
     */
    public static void draw(int row, int col) {
        for (int x = 0; x < row; ++x) {
            for (int y = 0; y < col; ++y) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSplitLine() {
        System.out.println("-----------");
    }
}
