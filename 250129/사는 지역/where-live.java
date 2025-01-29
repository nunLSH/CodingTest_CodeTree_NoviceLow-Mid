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

        User[] arr = new User[n];
        for (int i = 0; i < n; i++){
            String name = sc.next();
            String address = sc.next();
            String city = sc.next();

            arr[i] = new User(name, address, city);
        }

        int index = 0;
        for (int i = 1; i < n; i++){
            if (arr[i].name.compareTo(arr[index].name) > 0)
                index = i;
        }

        System.out.println("name "+arr[index].name);
        System.out.println("addr "+arr[index].address);
        System.out.println("city "+arr[index].city);
    }
}