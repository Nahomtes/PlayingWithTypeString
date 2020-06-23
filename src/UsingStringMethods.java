import java.util.Scanner;

public class UsingStringMethods {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = keyboard.next();

        System.out.println("Enter a number as an index: ");
        int index = keyboard.nextInt();

        int wordLength = word.length();


        if (index > wordLength){
            System.out.println("Index is larger than length.");
        } else {
            String subStringWord =  word.substring(0, index);
            System.out.println("The length of " + word + " is: " + wordLength);
            System.out.println("The substring from 0 to " + index + " is: " + subStringWord);
        }

    }
}
