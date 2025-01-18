import java.util.Scanner;
public class Main {
    public static boolean is369In(int i){
        boolean b = false;

        if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
            b = true;
        if (i >= 30 && i < 40 || i >= 60 && i < 70 || i >= 90 && i < 100)
            b = true;
        
        return b;
    }

    public static int count369(int a, int b){
        int count = 0;
        for (int i = a; i <= b; i++){
            if (i % 3 == 0 || is369In(i))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(count369(a, b));
    }
}