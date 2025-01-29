import java.util.Scanner;

class Product {
    String name;
    int code;

    public Product(){
        this.name = "";
        this.code = 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        p1.name = "codetree";
        p1.code = 50;

        String name = sc.next();
        int code = sc.nextInt();

        Product p2 = new Product();
        p2.name = name;
        p2.code = code;

        System.out.println("product "+p1.code+" is "+p1.name);
        System.out.println("product "+p2.code+" is "+p2.name);
    }
}