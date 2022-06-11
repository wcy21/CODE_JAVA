public class ArrayTest4 {
    public static void main(String[] args) {
        toBin(6);
//        toHex(-13);
    }

    /*
      十进制转十六进制
     */
    public static void toHex(int num) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 8; i++) {
            int temp = num & 15;
            if (temp > 9) {
                sb.append((char) (temp - 10 + 'A'));
            } else {
                sb.append(temp);
            }

            num = num >> 4;
        }
        System.out.println(sb.reverse());
    }

    /*
      十进制转化为二进制
     */
    public static void toBin(int num) { // 只能计算正数
        StringBuffer sb = new StringBuffer();

        while (num != 0) {
            sb.append(num % 2);
            num /= 2;
        }

        System.out.println(sb.reverse());
    }
}
