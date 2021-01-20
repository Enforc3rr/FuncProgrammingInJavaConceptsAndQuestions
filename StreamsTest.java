import java.util.*;
import java.util.stream.IntStream;

public class StreamsTest {
    public static void main(String[] args) {
        int [] a = {100,22,13,4232,13};
        IntStream intStream = Arrays.stream(a)
                .distinct()
                .sorted();
        intStream.forEach(n -> System.out.println(n));

        List<Person> personList = List.of(
                new Person("Prateek"),
                new Person("Kumar"),
                new Person("Tiwari")
        );
        for(Person p: personList) {
            System.out.println(p.toString());
        }

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        for(int i : integers){
            System.out.println(i);
        }

        Integer [] array = new Integer[] {1,2,3,4,5};
        List<Integer> list = Arrays.asList(array);
        System.out.println(list);


    }
}
class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
