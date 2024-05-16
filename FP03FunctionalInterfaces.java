import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        //printing even numbers' squares = what i learned
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        Function<Integer, Integer> squareFunction = x -> x * x;

        Consumer<Integer> sysoutConsumer = System.out::println;

        //one input one output
        Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };


        Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {

            @Override
            public void accept(Integer x) {
                System.out.println(x);
            }
        };


        numbers.stream().filter(isEvenPredicate).map(squareFunction2).forEach(sysoutConsumer2);


        /**
         * PREDICATE :
         *Predicate, bir giriş değerini alır ve bu değere dayanarak bir önermeyi değerlendirir.
         * Yani, doğru veya yanlış olarak sonuçlanan bir koşulu kontrol eder.
         * Örneğin, bir sayının pozitif olup olmadığını kontrol etmek için bir Predicate kullanabiliriz.
         *
         * */

        //Predicate<Integer> pozitifMi = num -> num > 0;
        //System.out.println(pozitifMi.test(5)); // true
        //System.out.println(pozitifMi.test(-3)); // false

        /**
         *CONSUMER :
         *Consumer, bir giriş değeri alır ve bu değeri kullanır, ancak herhangi bir çıktı üretmez.
         * Yani, giriş değerini kullanarak bir tür işlem yapar.
         * Örneğin, bir listenin her bir öğesini yazdırmak için bir Consumer kullanabiliriz.
         *
         * */

        //Consumer<String> yazdir = str -> System.out.println(str);
        //yazdir.accept("Merhaba"); // "Merhaba" yazdırır


        /**
         *FUNCTION
         *Function, bir giriş değeri alır, bu değeri işler ve bir çıkış değeri üretir.
         * Yani, bir girişten bir çıkışa dönüşüm yapar.
         * Örneğin, bir sayının karesini hesaplamak için bir Function kullanabiliriz.
         *
         * */

        //Function<Integer, Integer> kare = num -> num * num;
        //System.out.println(kare.apply(5)); // 25


        /** Predicate, belirli koşulları kontrol etmek için,
         * Consumer değerleri kullanarak bir tür işlem yapmak için ve
         * Function bir girişten bir çıkış üretmek için kullanılır. */






    }

}
