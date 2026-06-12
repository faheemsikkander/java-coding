import java.util.HashSet;
import java.util.Scanner;
public class SimplePangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        HashSet<Character> uniqueLetters = new HashSet<>();
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                uniqueLetters.add(ch);
            }
        }
        if (uniqueLetters.size() == 26) {
            System.out.println("Result: It is a Pangram!");
        } else {
            System.out.println("Result: Not a Pangram.");
        }
        scanner.close();
    }
}
