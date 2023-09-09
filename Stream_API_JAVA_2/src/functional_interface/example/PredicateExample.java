package functional_interface.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "python","javaScript","c","go","ruby");

        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);

    }
}
