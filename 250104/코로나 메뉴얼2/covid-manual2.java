import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] grade = new int[4];

        for (int i = 1; i <= 3; i++){
            char c = sc.next().charAt(0);
            int temp = sc.nextInt();

            if (c == 'Y' && temp >= 37)
                grade[0]++;
            else if (c == 'N' && temp >= 37)
                grade[1]++;
            else if (c == 'Y' && temp < 37)
                grade[2]++;
            else   
                grade[3]++;   
        }

        for (int i = 0; i < 4; i++){
            System.out.print(grade[i]+" ");
        }
        
        if (grade[0] >= 2)
                System.out.print("E");
    }
}