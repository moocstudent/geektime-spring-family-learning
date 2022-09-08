public class TheArrays {
    public static int[] arr;
    static{
        arr=new int[100000000];
        for(int i=1;i<=100000000;i++){
            arr[i-1]=i;
        }
    }
}
