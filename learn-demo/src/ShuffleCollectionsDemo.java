import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleCollectionsDemo {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Collections.shuffle(integerList);
        System.out.println(integerList);
    }
}
