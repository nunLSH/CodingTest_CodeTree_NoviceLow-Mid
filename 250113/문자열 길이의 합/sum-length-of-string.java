import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] array = new String[n];
        int lenSum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++){
            array[i] = sc.next();
            lenSum += array[i].length();
            
            if (array[i].charAt(0) == 'a')
                cnt++;
        }
        System.out.printf("%d %d", lenSum, cnt);
    }
}