package kr.ac.hansung.cse.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IAdd func = makeFunction();
        int result = func.add(1, 2);
        System.out.println(result);
    }

    public static IAdd makeFunction() {

        return (x, y) -> x + y;
    }
}
