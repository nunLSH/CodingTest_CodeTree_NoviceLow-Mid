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

        int cnt = 2, ans = 0;
        int x = 0, y = 0;

      
        for (int i = 1; i < r; i++){
            for (int j = 1; j < c; j++){
                for (int k = i + 1; k < r; k++){
                    for (int l = j + 1; l < c; l++){
                        for (int m = k + 1; m < r; m++){
                            for (int n = l + 1; n < c; n++){
                                if(arr[x][y] == 'W' && arr[i][j] == 'B' && arr[k][l] == 'W' && arr[m][n] == 'B'){
                                    if (m == r - 1 && n == c - 1)
                                        ans++;
                                } else if (arr[x][y] == 'B' && arr[i][j] == 'W' && arr[k][l] == 'B'  && arr[m][n] == 'W'){
                                    if (m == r - 1 && n == c - 1)
                                        ans++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);      
    }
}