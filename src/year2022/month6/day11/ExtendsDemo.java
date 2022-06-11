package year2022.month6.day11;
/*
将共性提取出来单独描述

不要为了提取其他类的功能，简化代码而继承
是类和类的所属关系才可以继承
 */

class Person{
    String name;
    int age;
}

class Student extends Person{
    void study(){
        System.out.println("study");
    }
}

class Worker extends Person{
    void work(){
        System.out.println("work");
    }
}

public class ExtendsDemo {
}
