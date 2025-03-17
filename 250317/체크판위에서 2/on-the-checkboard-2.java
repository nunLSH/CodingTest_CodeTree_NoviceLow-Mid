import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.next().charAt(0);

        int cnt = 0;
        for (int i = 1; i < r; i++){
            for (int j = 1; j < c; j++){
                for (int k = i + 1; k < r - 1; k++){
                    for (int l = j + 1; l < c - 1; l++){
                        if(arr[0][0] != arr[i][j] && arr[i][j] != arr[k][l] && arr[k][l] != arr[r-1][c-1])
                            cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);      
    }
}