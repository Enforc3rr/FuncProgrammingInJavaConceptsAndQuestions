package FuncProgQues;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q2 {
    public static void main(String[] args) {
        Stream.of(new Employees("Prateek",19),
                new Employees("Kumar",20),
                new Employees("Tiwari",21),
                new Employees("Enforcer",22),
                new Employees("EnfyB",18))
                .filter(age -> age.getAge() >= 20 )
                .collect(Collectors.toList())
                .forEach(employees -> System.out.println(employees.getName()));

    }
}

class Employees{
    private String name;
    private int age;

    public Employees(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
