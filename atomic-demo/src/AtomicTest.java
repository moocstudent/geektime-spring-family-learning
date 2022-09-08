import java.util.concurrent.atomic.AtomicLong;

public class AtomicTest {
    private final AtomicLong id = new AtomicLong(0);
    private final AtomicLong no = new AtomicLong(0);

    public static void main(String[] args) {
        AtomicTest test = new AtomicTest();
        System.out.println(test.id.incrementAndGet());
        System.out.println(test.no.incrementAndGet());
    }

}
