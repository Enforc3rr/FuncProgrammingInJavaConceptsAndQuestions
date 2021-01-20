package FuncProgQues;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Given a list of numbers, square them and filter the numbers which are greater 10 and then find average of them.( Java 8 APIs only)
public class Q1 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        IntStream.of(array).map(numb -> numb*numb)
                .filter(numb -> numb > 10)
                .average()
                .ifPresent(System.out::println);

    }
}
