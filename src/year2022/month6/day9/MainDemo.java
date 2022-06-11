package year2022.month6.day9;
/*
public static void main(String[] args)
 */

public class MainDemo {
    static {
        System.out.println("mainDemo");
    }

    public static void main(String[] args) {
        String[] arr = {"hello", "world", "!"};

        MainTest.main(arr);
    }

    public static void main(int arg) {
        System.out.println("public static void main(int arg)");
    }
}

class MainTest {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
