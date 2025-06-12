package functional_api;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

class Student {
    private String name;

    int korean_score;
    int english_score;
    int math_score;

    Student(String name, int korean_score, int english_score, int math_score) {
        this.name = name;
        this.korean_score = korean_score;
        this.english_score = english_score;
        this.math_score = math_score;
    }

    String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", 99, 12, 45),
                new Student("임꺽정", 76, 20, 8),
                new Student("고담덕", 36, 50, 33),
                new Student("김좌진", 77, 89, 91)
        );

        Function<Student, String> getNameFunc = s -> s.getName();

        ToDoubleFunction<Student> getScoreFunc = s -> {
            int sum = s.korean_score + s.english_score + s.math_score;
            double avg = sum / 3.0;
            return avg;
        };

        for (Student student : list) {
            String name = getNameFunc.apply(student);
            double avg = getScoreFunc.applyAsDouble(student);
            System.out.printf("%s 평균 점수 : %f\n", name, avg);
        }
    }
}
