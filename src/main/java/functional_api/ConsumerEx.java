package functional_api;

import java.util.function.*;

public class ConsumerEx {

    public static void main(String[] args) {
        Consumer<String> c1 = t -> System.out.println("입력값: " + t);
        c1.accept("홍길동");

        BiConsumer<String, Integer> c2 = (a, b) ->
                System.out.println("입력값1: " + a + ", 입력값2: " + b);
        c2.accept("홍길동", 100);

        IntConsumer c3 = a -> System.out.println("입력값: " + a);
        c3.accept(100);

        DoubleConsumer c4 = a -> System.out.println("입력값: " + a);
        c4.accept(100.01);

        LongConsumer c5 = a -> System.out.println("입력값: " + a);
        c5.accept(100L);
    }
}
