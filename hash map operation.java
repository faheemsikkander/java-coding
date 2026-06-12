import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        System.out.print("Enter number of entries: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter key: ");
            int key=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter value: ");
            String value=sc.nextLine();
            map.put(key,value);
        }
        System.out.println("HashMap: "+map);
        System.out.print("Enter key to search: ");
        int key=sc.nextInt();
        if(map.containsKey(key))
            System.out.println("Value: "+map.get(key));
        else
            System.out.println("Key not found");
        System.out.print("Enter key to remove: ");
        key=sc.nextInt();
        map.remove(key);
        System.out.println("After removal: "+map);
        System.out.println("Size: "+map.size());
        sc.close();
    }
}
