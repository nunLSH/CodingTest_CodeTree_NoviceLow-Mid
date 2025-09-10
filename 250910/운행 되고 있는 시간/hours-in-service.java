import java.util.*;
public class Main {
    public static int n;
    public static int MAX = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] works = new int[MAX];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            
            for (int j = a[i]; j < b[i]; j++)
                works[j]++;
        }

        int maxWorkingTime = 0;
        for (int i = 0; i < n; i++){
            int workingTime = 0;

            // 해고한 사람의 근무시간 제외하기
            for (int k = a[i]; k < b[i]; k++)
                works[k]--;

            for (int j = 1; j < MAX; j++){
                if (works[j] != 0)
                    workingTime++;
            }

            // 제외했던 근무시간 되돌리기
            for (int k = a[i]; k < b[i]; k++)
                works[k]++; 

            maxWorkingTime = Math.max(maxWorkingTime, workingTime);
        }
        System.out.print(maxWorkingTime);
    }
}