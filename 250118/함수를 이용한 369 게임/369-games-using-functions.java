import java.util.Scanner;
public class Main {
    public static boolean is369In(int n){
        boolean b = false;

        char[] arr = Integer.toString(n).toCharArray();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == '3' || arr[i] == '6' || arr[i] == '9')
                b = true;
        }
        
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