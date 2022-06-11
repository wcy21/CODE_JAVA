package year2022.month6.day9;
/*
 方法被调用才初始化，也称对象的延时加载，懒汉式
 */
class Single2 {
    private static Single2 single = null;

    private Single2() {
    }

    public static Single2 getSingle() {
        if (single == null) {
            synchronized (Single.class) {
                if (single == null) {
                    single = new Single2();
                }
            }
        }
        return single;
    }
}

/*
 记录原则：定义单例，建议使用饿汉式
 */
public class SingleDemo2 {
    public static void main(String[] args) {
    }
}
