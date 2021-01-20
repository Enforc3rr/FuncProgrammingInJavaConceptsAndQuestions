import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPrac {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        Arrays.stream(array).sorted().forEach(System.out::println);

        for (int e : array) {
            System.out.println(e);
        }

        System.out.println("sum is ");
        IntStream.range(1, 4).reduce((n1, n2) -> {
            System.out.println("n1 is " + n1);
            System.out.println("n2 is " + n2);
            return n1 + n2;
        }).ifPresent(System.out::println);

        //Basically returned value is getting stored in n1 .
        System.out.println("sum is  --> ");
        System.out.println(IntStream.range(1, 4).reduce(2, (n1, n2) -> {
            System.out.println("n1 is " + n1);
            System.out.println("n2 is " + n2);
            return n1 + n2;
        }));


        Stream.of("Ab","A","CD","CDE","ABCD").reduce((word1 , word2)-> word1.length() > word2.length() ? word1 : word2)
                .ifPresent(System.out::println);
    }
}
