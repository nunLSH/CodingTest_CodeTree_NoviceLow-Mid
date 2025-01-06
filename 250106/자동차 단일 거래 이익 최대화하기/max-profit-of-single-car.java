import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] carPrice = new int[n];
        
        for (int i = 0; i < n; i++)
            carPrice[i] = sc.nextInt();

        int maxProfit = 0;

        for (int i = 0; i < n; i++){
            for (int j = 1; j < n; j++){
                if (j > i && (carPrice[j] - carPrice[i] > maxProfit)){
                    maxProfit = carPrice[j] - carPrice[i];
                }
            }
        }

        if (maxProfit <= 0)
            System.out.print(0);
        else
            System.out.print(maxProfit);
    }
}