/*
public static void main(String[] args)

�����������⺯�����ɱ�jvm����

���������壺
public: ����Ȩ��
static: ������������ļ��ؾ��Ѿ�����
void: ������û�о���ķ���ֵ
main: ���ǹؼ��֣�����һ������ĵ��ʣ��ɱ�jvmʶ��
(string[] arr): �������ͣ���һ���洢�ַ������͵�����

�������ǹ̶���ʽ
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
