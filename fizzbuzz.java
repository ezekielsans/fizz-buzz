import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
    /*
    *
    * The rules of the FizzBuzz game are very simple.

    Say Fizz if the number is divisible by 3.
    Say Buzz if the number is divisible by 5.
    Say FizzBuzz if the number is divisible by both 3 and 5.
    Return the number itself, if the number is not divisible by 3 and 5.

    *
    *
    * */
ArrayList<Integer> storedNumbersFizzBuzz = new ArrayList<>();
        ArrayList<Integer> storedNumbersFizz = new ArrayList<>();
        ArrayList<Integer> storedNumbersBuzz = new ArrayList<>();

        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Input a Number:");

            int inputNum = scan.nextInt();

            if (inputNum % 3 == 0 || 5 == 0) {
                System.out.println("FizzBuzz");
                storedNumbersFizzBuzz.add(inputNum);
            } else if (inputNum % 3 == 0) {
                System.out.println("Fizz");
                storedNumbersFizz.add(inputNum);

            } else {
                System.out.println("Buzz");
                storedNumbersBuzz.add(inputNum);
            }


            System.out.println("here is your fizzbuzz numbers " + storedNumbersFizzBuzz );
        }


    }
}
