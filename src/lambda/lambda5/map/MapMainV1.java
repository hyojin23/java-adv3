package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;

public class MapMainV1 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        //문자열을 숫자로 변환
        List<Integer> numbers = mpaStringToInteger(list);
        System.out.println("numbers = " + numbers);

        //문자열을 길이로 변환
        List<Integer> lengths = mpaStringToLength(list);
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> mpaStringToInteger(List<String> list) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            Integer value = Integer.valueOf(s);
            numbers.add(value);
        }
        return numbers;
    }

    private static List<Integer> mpaStringToLength(List<String> list) {
        List<Integer> lengths = new ArrayList<>();
        for (String s : list) {
            Integer value = s.length();
            lengths.add(value);
        }
        return lengths;
    }
}
