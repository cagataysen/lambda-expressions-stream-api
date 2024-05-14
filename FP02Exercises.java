import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Exercises
{
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        //coursesHasAtLeast4Letters(courses);
        //cubesOfOddNumbers(numbers);
        //numbersOfCharactersInCourseName(courses);
        //System.out.println(sumOfSquares(numbers));
        //System.out.println(SumOfCubes(numbers));
        //System.out.println(sumOfOddNumbers(numbers));
        //distinctNumbersInTheList(numbers);
        //sortNumbersInTheList(numbers);
        //reverseSortCoursesInTheList(courses);
        //increasingLengthOrder(courses);
        //List<Integer> evenNumbers = createEvenNumbersList(numbers);
        //System.out.println(evenNumbers);
        List<Integer> lengthsOfCourses = lengthOfCoursesList(courses);
        System.out.println(lengthsOfCourses);

    }

    /*Print Courses Whose Name has at least 4 letters*/
    private static void coursesHasAtLeast4Letters(List<String> courses){
        courses.stream().filter(x->x.length()>4).forEach(System.out::println);
    }

    /*Print the cubes of odd numbers*/
    private static void cubesOfOddNumbers(List<Integer> numbers){
        numbers.stream().filter(number->number%2==1).map(number -> number * number * number).forEach(System.out::println);
    }

    /*Print the number of characters in each course name*/
    private static void numbersOfCharactersInCourseName(List<String> courses){
        courses.stream().map(course->course.length()).forEach(System.out::println);
    }

    /*Square every number in a list and find the sum of squares*/
    private static int sumOfSquares(List<Integer> numbers){
        return numbers.stream().map(number->number*number).reduce(0, Integer::sum);
    }

    /*Cube every number in a list and find the sum of cubes*/

    private static int SumOfCubes(List<Integer> numbers){
        return numbers.stream().map(x ->  x * x * x).reduce(0, Integer::sum);
    }

    /*Find Sum of Odd numbers in a list*/
    private static int sumOfOddNumbers(List<Integer> numbers){
        return numbers.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
    }

    /*Write down the distinct numbers in the list*/
    private static void distinctNumbersInTheList(List<Integer> numbers){
        numbers.stream().distinct().forEach(System.out::println);
    }

    //sorting numbers
    private static void sortNumbersInTheList(List<Integer> numbers){
        numbers.stream().sorted().forEach(System.out::println);
    }

    //sorting alphabetically courses
    private static void sortCoursesInTheList(List<String> courses){
        courses.stream().sorted().forEach(System.out::println);
    }

    //reverse order
    private static void reverseSortCoursesInTheList(List<String> courses){
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    //compare with the increasing length order
    private static void increasingLengthOrder(List<String> courses){
        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
    }

    /*Create a List with Even Numbers Filtered from the Numbers List*/
    private static List<Integer> createEvenNumbersList(List<Integer> numbers){
        return numbers.stream().filter(number->number%2==0).collect(Collectors.toList());
    }

    /*Create a list of lengths of all courses title*/
    private static List<Integer> lengthOfCoursesList(List<String> courses){
        return courses.stream().map(str -> str.length()).collect(Collectors.toList());
    }

}
