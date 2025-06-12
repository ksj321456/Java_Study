package functional_api;

import java.util.function.IntBinaryOperator;

public class Operation {
    static int calculate(int[] arr, IntBinaryOperator o) {
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = o.applyAsInt(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {3,1,7,6,5};

        int sum = Operation.calculate(numbers, (x, y) -> x + y);
        System.out.println(sum);

        int mul = Operation.calculate(numbers, (x, y) -> x * y);
        System.out.println(mul);

        int max = Operation.calculate(numbers, (x, y) -> {
            int tmp;
            if (x > y) tmp = x;
            else tmp = y;
            return tmp;
        });
        System.out.println(max);

        int min = Operation.calculate(numbers, (x, y) -> {
            int tmp;

            if(x < y)
                tmp = x;
            else
                tmp = y;

            return tmp;
        });
        System.out.println(min);


    }
}
