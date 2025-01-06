import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++)
            array[i] = sc.nextInt();
        
        int min = array[0], max = array[0];

        // 배열의 최소, 최대
        for (int i = 0; i < 10; i++){
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }

        // 배열의 최소값은 500미만 중 가장 큰 수에 할당
        // 배열의 최대값은 500초과 중 가장 작은 수에 할당
        int s_max = min, l_min = max;

        for (int i = 0; i < 10; i++){
            if (array[i] < 500 && array[i] > s_max)
                s_max = array[i];
            if (array[i] > 500 && array[i] < l_min)
                l_min = array[i];
            
        }
        System.out.printf("%d %d", s_max, l_min);
    }
}