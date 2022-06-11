/*
public static void main(String[] args)

主函数是特殊函数，可被jvm调用

主函数定义：
public: 访问权限
static: 主函数随着类的加载就已经存在
void: 主函数没有具体的返回值
main: 不是关键字，但是一个特殊的单词，可被jvm识别
(string[] arr): 参数类型，是一个存储字符串类型的数组

主函数是固定格式
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
