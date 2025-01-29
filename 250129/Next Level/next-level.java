import java.util.Scanner;
class User {
    String id;
    int level;

    public User () {
        this.id = "";
        this.level = 0;
    }

    public User(String id, int level){
        this.id = id;
        this.level = level;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        User user1 = new User();
        user1.id = "codetree";
        user1.level = 10;
        User user2 = new User(id, level);
        
        System.out.print("user "+ user1.id+ " lv "+user1.level);
        System.out.println();
        System.out.print("user "+ user2.id+ " lv "+user2.level);

    }
}