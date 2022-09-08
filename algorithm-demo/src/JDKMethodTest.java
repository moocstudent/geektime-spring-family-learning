import java.util.*;
import java.util.stream.Collectors;

/**
 * 虽然使用了sort，但是其其实是进行完整排序的方法
 * 并不是进行数组的倒置
 */
public class JDKMethodTest {
    public static void main(String[] args) throws InterruptedException {

        int[] arr = TheArrays.arr;
//        Integer[] arr = TheArrays.arrBox;
//        Arrays.stream(arr).forEach(System.out::println);
        List<Integer> arrList = new ArrayList<>();

        long boxStart = System.currentTimeMillis();
        //即使用下面的装箱方式，1E个数据运行不到20秒基本上就java.lang.OutOfMemoryError: Java heap space
//        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println("装好箱了"+(System.currentTimeMillis()-boxStart)+"ms");

        /**
         * 对同样对数据无法即时完成int装箱，这句话基本都输出不了
         */
//        System.out.println("the boxed is finished!");

        long timeMillis = System.currentTimeMillis();
//        Arrays.sort(arr,(a,b)->b-a);//非倒置，而仅仅是逆序

        //倒置方法
        Collections.reverse(arrList);
//        Collections.reverse(integerList);
//        Arrays.parallelSort(arr);
//        Arrays.sort(arr);
        System.out.println(System.currentTimeMillis()-timeMillis+"ms");
        Thread.sleep(10000);
        System.out.println("after sort");
//        arrList.stream().forEach(System.out::println);

    }
}
