import java.util.Arrays;

public class SwapArrayMethod2Test {

    public static void main(String[] args) throws InterruptedException {
        int[] arr = TheArrays.arr;
        int[] arrResult = new int[arr.length];

        /**
         * 这样都做法虽然不用进行交换了
         * 但是需要声明一个同样大小都数组
         * 从而不是原地算法了
         * 是完全借助了另一个数组
         * 不过从实现上也更加好理解
         * 其空间复杂度为O（n）
         * 时间复杂度为O（n）
         * 会创建n大小都数组
         * 也会将数据一个一个遍历一遍
         */
        long timeMillis = System.currentTimeMillis();
        for(int i=0;i<arr.length;i++){
            arrResult[i]=arr[arr.length-1-i];
        }
        System.out.println(System.currentTimeMillis()-timeMillis+"ms");
        Thread.sleep(10000);
//        Arrays.stream(arrResult).forEach(System.out::println);
    }
}
