package functional_api;

import java.util.List;
import java.util.function.IntPredicate;

public class Student_Predicate {
    String name;
    int score;

    public Student_Predicate(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        List<Student_Predicate> list = List.of(
                new Student_Predicate("홍길동", 99),
                new Student_Predicate("임꺽정", 76),
                new Student_Predicate("고담덕", 36),
                new Student_Predicate("김좌진", 77)
        );

        IntPredicate scoring = t -> t >= 60;

        for (Student_Predicate p : list) {
            String name = p.name;
            int score = p.score;

            boolean pass = scoring.test(score);

            if(pass) {
                System.out.println(name + "님 " + score + "점은 국어 합격입니다.");
            } else {
                System.out.println(name + "님 " + score + "점은 국어 불합격입니다.");
            }
        }
    }
}
