package FuncProgQues;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {2,1,3};
        BiFunction<IntStream,Integer,Boolean> find = (intStream,key) -> intStream.anyMatch(numb -> numb==key);



        if(find.apply(IntStream.of(array),4)){
            System.out.println("Value is Present");
        }else {
            System.out.println("Value is Absent");
        }

    }
}
