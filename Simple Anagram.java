import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class SimpleAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        String[] letters = word.split("");
        List<String> list = Arrays.asList(letters);
        Collections.shuffle(list);
        String anagram = String.join("", list);
        System.out.println("Anagram: " + anagram);
        scanner.close();
    }
}
