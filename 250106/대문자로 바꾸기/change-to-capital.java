import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] array = new char[5][3];

        for (int i = 0; i < 5; i++){
            for (int k = 0; k < 3; k++){
                array[i][k] = sc.next().toUpperCase().charAt(0);
                System.out.print(array[i][k]+" ");
            }
            System.out.println();
        }

    }
}