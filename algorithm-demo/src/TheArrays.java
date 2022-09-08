import java.util.Random;

public class TheArrays {
    public static int[] arr;
    public static int[] reverseArr;
    public static Integer[] arrBox;
    private static Random r  = new Random(3);
    static{
        arr=new int[100000000];
        for(int i=1;i<=100000000;i++){
            arr[i-1]=i;
        }
        reverseArr=new int[100000000];
        for(int i=100000000;i>0;i--){
            reverseArr[100000000-i]=i;
        }
        /**
         * 若使用Arrays.sort进行逆序，但其只对对象box类型支持，
         * 但是这个装箱操作非常耗时基本不太可能使用这种方式
         */
//        arrBox=new Integer[100000000];
//        for(int i=1;i<=100000000;i++){
//            arrBox[i-1]=i;
//        }
         arrBox=new Integer[10];
        for(int i=1;i<=10;i++){
            arrBox[i-1]=r.nextInt(11);
        }
    }
}
