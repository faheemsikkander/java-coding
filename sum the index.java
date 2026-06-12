import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter your target number: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("\nSuccess! Match found:");
                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                    System.out.println("Located at index [" + i + "] and index [" + j + "]");
                    found = true;
                    break; 
                }
            }
            if (found) break; 
        }
        if (!found) {
            System.out.println("\nNo two numbers add up to " + target);
        }
        scanner.close();
    }
}
