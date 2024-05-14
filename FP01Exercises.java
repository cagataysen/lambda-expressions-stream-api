import java.util.List;

public class FP01Exercises {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //printOddNumbersInListStructured(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        //printCourses(courses);

        //printCoursesContainingSpring(courses);

        //printCoursesHavingAtLeast4Letters(courses);

        //printSquaresOfTheList(numbers);

        //printSquaresOfTheOddNumbers(numbers);
        printNumberOfTheCharacters(courses);
    }

    //Filter exercises
    private static void printOddNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()
                .filter(number->number%2==1)
                .forEach(System.out::println);
    }

    private static void printCourses(List<String> courses){
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printCoursesContainingSpring(List<String> courses){
        courses.stream()
                .filter(course->course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesHavingAtLeast4Letters(List<String> courses){
        courses.stream()
                .filter(course->course.length()>=4)
                .forEach(System.out::println);
    }


    //Mapping exercises
    private static void printSquaresOfTheList(List<Integer> numbers){
        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printSquaresOfTheOddNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    private static void printNumberOfTheCharacters(List<String> courses){
        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);
    }

}
