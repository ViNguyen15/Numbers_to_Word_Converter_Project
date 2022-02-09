import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String[] numbers = {
                "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty", "Twenty-One",
                "Twenty-Two", "Twenty-Three", "Twenty-Four", "Twenty-Five"
        };

        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));

        IntStream.range(0, 9)
                .mapToObj(n -> {
                    boolean inBounds = (n >= 0) && (n+9+9 < numbers.length);
                    String row = "";
                    if(inBounds)
                        row = numbers[n] + " " + numbers[n+9] + " " + numbers[n+9+9];
                    else
                        row = numbers[n] + " " + numbers[n+9];

                    return row;
        })
                .forEach(System.out::println);

    }



}
