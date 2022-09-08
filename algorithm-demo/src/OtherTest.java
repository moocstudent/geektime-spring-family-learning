public class OtherTest {
    public static void main(String[] args) {


        System.out.println(10>>1);
        System.out.println(11>>1);
        System.out.println(12>>1);

        int count = 0;
        /**
         * 声明两个参数用来做swapArray中的a和b即i和j
         * java/util/Collections.java:379
         */
        for (int i=0, mid=10>>1, j=10-1; i<mid; i++, j--){
            count++;
        }
        System.out.println(count);
    }
}
