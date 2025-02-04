import java.util.Scanner;
public class Main {
    // public static final int OFFSET = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[2000];
        int cur = 1000;
        for (int i = 0; i < n; i++){
            int size = sc.nextInt();
            char direction = sc.next().charAt(0);
            
            if (direction == 'R'){
                for (int k = cur; k < cur + size; k++){
                    num[k]++;
                }
                cur += size; 
            } else {
                for (int k = cur - 1; k >= cur - size; k--){
                    num[k]++;
                }
                cur -= size;
            }
        }
        int cnt = 0;
        for (int i = 0; i < 2000; i++){
            if (num[i] >= 2)
                cnt++;
        }
        System.out.print(cnt);
    }
}