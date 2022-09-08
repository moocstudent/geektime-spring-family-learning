import java.util.Arrays;

/**
 * 查阅：
 * https://blog.csdn.net/m0_52711790/article/details/123012899
 * https://baike.baidu.com/item/%E7%A9%BA%E9%97%B4%E5%A4%8D%E6%9D%82%E5%BA%A6/9664257?fr=aladdin
 */
public class SwapArrayTest {
    /**
     * 今天有位面试官问了一个常见的小算法题
     * 有个数组大小10，需要将整个数组元素进行倒置
     * 那么我感觉应该是这样来解决的
     *
     * 在写完博客之后
     * 我又进行思考，面试官究竟问得是将有序数组得前后置换
     * 还是将无序得数组进行从大到小到排列
     * 我已经记不清了（其实应该是前后倒置，因为我回答出SwapArrayMethod2Test中到方式到时候，
     * 其实是感觉到了面试官到默许的）
     *
     * 而其实如果只有10个数字，是完全可以使用Integer数组来进行sort(arr,(a,b)->b-a)这样倒置的
     * 所以说我的博客写的名字逆序不对，应该是倒置才对的。
     */
    public static void main(String[] args) throws InterruptedException {


        int[] arr = TheArrays.arr;

        long timeMillis = System.currentTimeMillis();
        for(int i=0;i<arr.length/2;i++){
//            swap(i,arr.length-1-i,arr);
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(System.currentTimeMillis()-timeMillis+"ms");
//        Thread.sleep(10000);
//        Arrays.stream(arr).forEach(System.out::println);
        /**
         * 虽然每个元素都进行来移动，但是是在原数组空间上进行交换
         * 所以是原地排序
         * 如果数组大小为偶数，其中中间都元素是不用动的
         * 所以从算法时间复杂度上来讲是O（n/2）
         * 从空间复杂度上来讲，因为只是作为两两交换
         * 并没有开辟新的内存空间
         * 而交换是声明的int temp
         * 可以说每次n/2的数据过来作为一个缓存
         * 但是每次都只是赋值给temp并没有temp2
         * 加上占用次数n/2
         * 那么空间复杂度也为O（n/2）
         */

    }

    /**
     * swap the array's element
     * @param aIndex left nearly element index
     * @param bIndex right nearly element index
     * @param arr original array
     */
    public static void swap(int aIndex,int bIndex,int[] arr){
        int temp = arr[aIndex];
        arr[aIndex] = arr[bIndex];
        arr[bIndex] = temp;
    }
}
