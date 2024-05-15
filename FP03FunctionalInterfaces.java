import java.util.List;

public class FP03FunctionalInterfaces {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        numbers.stream().filter(x -> x % 2 == 0).map(x -> x * x).forEach(System.out::println);
    }

}
