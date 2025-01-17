import java.util.Scanner;
public class Main {
    public static void printSquare(int n){
        int num = 1;
        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++){
                if (num == 10){
                    num = 1;
                }
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printSquare(n);
    }
}