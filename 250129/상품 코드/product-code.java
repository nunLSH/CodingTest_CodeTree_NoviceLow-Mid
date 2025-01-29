import java.util.Scanner;

class Product {
    String name;
    int code;

    public Product(String name, int code){
        this.name = name;
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product("codetree", 50);

        String name = sc.next();
        int code = sc.nextInt();

        Product p2 = new Product(name, code);

        System.out.println("product "+p1.code+" is "+p1.name);
        System.out.println("product "+p2.code+" is "+p2.name);
    }
}