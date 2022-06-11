public class FunctionDemo {
    public static void main(String[] args) {
//        int x = 4;
//        System.out.println(x * 3 + 5);
//
//        x = 6;
//        System.out.println(x * 3 + 5);

        getResult(4);

        getResult(6);
    }

    /*
      代码出现重复
      抽取代码提高代码的复用性
      将该部分定义为独立的功能
    */

    public static void getResult(int num) {
        System.out.println(num * 3 + 5);
    }
}
