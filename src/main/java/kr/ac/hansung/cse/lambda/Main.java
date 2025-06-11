package kr.ac.hansung.cse.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IAdd lambda = makeFunction();
        System.out.println(lambda.add(1, 2));

    }

    public static IAdd makeFunction() {
        return (x, y) -> x + y;
    }
}
