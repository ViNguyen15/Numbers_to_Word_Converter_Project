public class Main {
    public static void main(String[] args) {
        String[] numbers = {
                "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty", "Twenty-One",
                "Twenty-Two", "Twenty-Three", "Twenty-Four", "Twenty-Five"
        };

        new Main().toColumns(3,numbers);

    }

    public void toColumns(int columns, String[] numbers){
        int numToDivide = 0;

        if (numbers.length % columns > 0)
            numToDivide = (numbers.length/columns) + 1;
        else
            numToDivide = numbers.length/columns;

        String[] grid = new String[columns];
        for(int i = 0; i < grid.length; i++)
            grid[i] = "";

        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            grid[count] += numbers[i] + " ";

            if( (i+1) % numToDivide == 0)
                count++;
        }

        for(int i = 0; i < 9; i++)
            if (i > 6)
                System.out.println(grid[0].split(" ")[i] + " " + grid[1].split(" ")[i]);
            else
                System.out.println(grid[0].split(" ")[i] + " " + grid[1].split(" ")[i] + " " + grid[2].split(" ")[i]);
    }

}
