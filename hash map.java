import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> users=new HashMap<>();
        users.put("admin","admin@123");
        System.out.print("Enter username: ");
        String username=sc.nextLine();
        System.out.print("Enter password: ");
        String password=sc.nextLine();
        if(users.containsKey(username) && users.get(username).equals(password))
            System.out.println("Welcome to Homepage");
        else
            System.out.println("Invalid Details");
        sc.close();
    }
}
