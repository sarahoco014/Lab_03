import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list

        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list

        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"

        scottishIslands.add(2, "Islay");

//        4. Print out the index position of "Skye"

        System.out.println("The index position of Skye in ArrayList is: " + scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name

        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index

        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist

        int length = scottishIslands.size();
        System.out.println(length);

//        8. Sort the list alphabetically

        Collections.sort(scottishIslands);
        System.out.println("After sorting: " + scottishIslands);

//        9. Print out all the islands using a for loop

        for (String scottishIsland : scottishIslands) {
            System.out.println(scottishIsland);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers

        List<Integer> evenNumbers = new ArrayList<>(); // creates empty arraylist
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("even numbers: " + evenNumbers);

//        2. Print the difference between the largest and smallest value

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < min)
                min = number;
            if (number > max)
                max = number;
        }

        System.out.println("The difference between the largest and smallest value is " + (max - min));

//        int min = Collections.min(numbers);
//        int max = Collections.max(numbers);
//        int diff = maxNumber - minNumber;
//        System.out.println(diff); // alternative solution
//
//        3. Print True if the list contains a 1 next to a 1 somewhere.

        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.println("index: "+i);
            System.out.println("val at index: "+numbers.get(i));
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                System.out.println(String.valueOf(true));
            }
        }

//        4. Print the sum of the numbers,

        int sum = 0;

        for(int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i); // or sum += numbers.get(i);
        }

        System.out.println("Sum of all elements in the array: " + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

        System.out.println("The index position of 13 in ArrayList is: " + numbers.indexOf(13));

        int sum2 = 0;

        for(int i = 0; i < numbers.size(); i++) {

            if(i >= 8) {
                break;
            }
            sum2 = sum2 + numbers.get(i);
        }

        System.out.println("Sum of all elements in the array without >=13: " + sum2);

    }

}