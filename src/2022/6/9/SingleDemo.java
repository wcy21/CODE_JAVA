/*
设计模式：解决某一问题最行之有效的方法

单例设计模式：解决一个类在内存只存在一个对象

想保证对象唯一：
1.为避免其他程序过多建立该类对象，先禁止其他程序建立该对象
2.为了让其他程序可以访问该类对象，在本类中自定义一个对象
3.为了方便其他程序对自定义对象的访问，对外提供一些访问方式

实现：
1.构造函数私有化
2.类中创建一个本类对象
3.提供一个方法获取到该对象
 */

/*
 先初始化对象，饿汉式
 */
class Single {

    private static Single s = new Single();
    private int num;

    private Single() {
    }

    public static Single getInstance() {
        return s;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class SingleDemo {
    public static void main(String[] args) {
        Single single1 = Single.getInstance();
        Single single2 = Single.getInstance();

        single1.setNum(20);

        System.out.println(single2.getNum());

        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
    }
}

class Student {
    private static Student student = new Student();
    private int age;

    private Student() {
    }

    public static Student getStudent() {
        return student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}