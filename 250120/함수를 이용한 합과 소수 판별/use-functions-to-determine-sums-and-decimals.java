import java.util.Scanner;
public class Main {
    public static boolean cal(int i){

        for (int j = 2; j <= i-1; j++){
            if (i % j == 0)
                return false;
        }

        int sum = 0;
        while (i % 10 > 0){
            sum += (i % 10);

            if (i < 10)
                break;

            i /= 10;
        }

        if (sum % 2 != 0)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = a; i <= b; i++){
            if (cal(i) == true) 
                cnt++;
        } 

        System.out.print(cnt);  
    }
}