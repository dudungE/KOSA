package quiz;

import java.util.function.BiFunction;

public class CalculatorLambda {
	public static void main(String[] args) {
        int a = 3;
        int b = 5;

        // BiFunction Interface는 Java에서 함수형 프로그래밍을 구현하기 위해 Java 버전 1.8부터 도입된 함수형 인터페이스
//        BiFunction<T, U, R> plus = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> plus = (x, y) -> x + y;
        // 빼기 함수 (람다식)
        BiFunction<Integer, Integer, Integer> sub = (x, y) -> x - y;

        int resultPlus = plus.apply(a, b);
        System.out.println("덧셈 결과: " + resultPlus);

        int resultSub = sub.apply(a, b);
        System.out.println("뺄셈 결과: " + resultSub);
    }
}
