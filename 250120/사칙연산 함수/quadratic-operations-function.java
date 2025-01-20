import java.util.Scanner;
public class Main {

    public static int calculate(int a, char o, int c){
        if (o == '+')
            return a +c;
        else if (o == '-')
            return a - c;
        else if (o == '*')
            return a * c;
        else if (o == '/')
            return a / c;
        else
            return 20000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        if (calculate(a, o, c) == 20000)
            System.out.print("False");
        else
            System.out.print(Integer.toString(a) + " " + o + " " + Integer.toString(c) + " = " + calculate(a, o, c));
    }
}