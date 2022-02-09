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


        new Main().toColumns(numbers, 3);

    }

    //
    public void toColumns(String[] list, int columns){
        int perColumn = list.length%columns==0 ? list.length/columns : (list.length/columns) + 1;

        IntStream.range(0, perColumn)
                .mapToObj(n -> {
                    boolean inBounds = (n >= 0) && (n + perColumn * (columns - 1) < list.length);
                    String row = "";

                    // inbound checks the column to see if there are any null
                    if (inBounds)
                        for (int i = 0; i < columns; i++) {
                            row += String.format("%-15s",list[n + (i * perColumn)]);
                        }
                    else
                        for (int i = 0; i < columns - 1; i++) {
                            row += String.format("%-15s",list[n + (i * perColumn)]);
                        }

                    return row;
                })
                .forEach(e -> System.out.println(e) );
    }



}
