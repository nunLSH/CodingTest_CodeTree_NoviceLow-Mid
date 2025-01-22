import java.util.Scanner;
class IntWrapper {
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}

public class Main {
    public static void modify(IntWrapper n, IntWrapper m){
        int num1 = n.value, num2 = m.value;

        if (num1 > num2) {
            n.value = n.value + 25;
            m.value = 2 * m.value;
        } else {
            m.value = m.value + 25;
            n.value = 2 * n.value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper n = new IntWrapper(a);
        IntWrapper m = new IntWrapper(b);

        modify(n, m);
        a = n.value;
        b = m.value;

        System.out.print(a+" "+b);
    }
}