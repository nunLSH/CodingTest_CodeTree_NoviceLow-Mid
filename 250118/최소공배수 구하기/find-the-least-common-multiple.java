import java.util.Scanner;
public class Main {

    public static void findLcm(int n, int m){
        int lcm = 0;
        for (int i = 1; i < 100; i++){
            if ((n * i) % m == 0){
                lcm = n * i;
                break;
            }
        }
        System.out.print(lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        findLcm(n, m);
    }
}