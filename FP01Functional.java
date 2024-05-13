import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        //printEvenNumbersInListStructured(numbers);
        printOddNumbersInListStructured(numbers);
    }
/*
    private static void print(int number){
        System.out.println(number);
    } */

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().
                forEach(System.out::println); //Method reference
    }

    private static boolean isEven(int number){
        return number % 2 == 0;
    }

    /* Lambda Expression
    *
    * instead of isEven method we can use lambda expression:
    * parameter -> return statement
    *
    * number -> number%2 == 0
    *
    * */

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {

        numbers.stream()
                .filter(number -> number%2 == 0)  //Filter only even numbers with lambda expression
                .forEach(System.out::println);   //Method Reference

    }

    private static void printOddNumbersInListStructured(List<Integer> numbers) {

        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);

    }

}
