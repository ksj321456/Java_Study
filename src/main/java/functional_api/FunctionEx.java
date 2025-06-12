package functional_api;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionEx {

    public static void main(String[] args) {
        Function<Integer, String> intToStr = t -> String.valueOf(t);
        String str = intToStr.apply(100);
        System.out.println(str);

        ToIntFunction<String> strToInt = t -> Integer.parseInt(t);
        System.out.println(strToInt.applyAsInt("100"));

        IntToDoubleFunction intToDouble = t -> (double) t;
        System.out.println(intToDouble.applyAsDouble(100));
    }
}
