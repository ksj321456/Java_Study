package Enum;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double x = 2.5;
        double y = 5.0;

        Operation plus = Operation.PLUS;

        String name = plus.toString();
        System.out.println(name);

        double result = plus.apply(x, y);
        System.out.println(result);
    }
}
