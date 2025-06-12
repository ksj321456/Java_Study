package functional_api;

import java.util.Objects;
import java.util.function.*;

public class SupplierEx {

    public static void main(String[] args) {
        Supplier<Object> supplier = () -> new Object();
        System.out.println(supplier.get());

        BooleanSupplier booleanSup = () -> true;
        System.out.println(booleanSup.getAsBoolean());

        IntSupplier intSup = () -> {
            int num = (int) (Math.random() * 6) + 1;
            return num;
        };
        System.out.println("주사위 랜덤 숫자: " + intSup.getAsInt());

        DoubleSupplier doubleSup = () -> 1.0;
        System.out.println(doubleSup.getAsDouble());

        LongSupplier longSup = () -> 1L;
        System.out.println(longSup.getAsLong());
    }
}
