import java.util.Scanner;
import java.util.Arrays;

class User {
    String name, address, city;

    public User() {
        this.name = "";
        this.address = "";
        this.city = "";
    }

    public User(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] names = new String[n];
        User[] arr = new User[n];
        for (int i = 0; i < n; i++){
            String name = sc.next();
            String address = sc.next();
            String city = sc.next();

            names[i] = name;    
            arr[i] = new User(name, address, city);
        }

        Arrays.sort(names, 0, n);

        User user = new User();

        int index = 0;
        user.name = names[n-1];
        for (int i = 0; i < n; i++){
            if (user.name.equals(arr[i].name))
                index = i;
        }
        
        System.out.println("name "+user.name);
        System.out.println("addr "+arr[index].address);
        System.out.println("city "+arr[index].city);
    }
}