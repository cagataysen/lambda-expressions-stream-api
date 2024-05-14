import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, -15);

        //int sum = addListFunctional(numbers);
        //System.out.println(sum);

        //System.out.println(findMaxValueFromTheList(numbers));

        List<Integer> doubledNumbers = doubleList(numbers);

        System.out.println(doubledNumbers);
    }

    private static int sum(int aggregate, int nextNumber){
        return aggregate + nextNumber;
    }

    private static int addListFunctional(List<Integer> numbers) {

        //Stream of number -> One result value
        //Combine them into one result => One value
        // 0 and FP02Functional::sum

        return  numbers.stream()
                //.reduce(0, FP02Functional::sum);
                //.reduce(0, (a,b)-> a+b);
                .reduce(0, Integer::sum);   //you can check the details of the function from library
    }

    private static int findMaxValueFromTheList(List<Integer> numbers) {

        // numbers.stream().reduce(0, (x,y)-> x>y ? x:y)

        return numbers.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
    }


    private static List<Integer> doubleList(List<Integer> numbers){
        return numbers.stream().map(number -> number * number).collect(Collectors.toList());
    }
}
