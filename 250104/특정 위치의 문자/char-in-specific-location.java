import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] array = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char c = sc.next().charAt(0);
        int index = -1;

        for (int i = 0; i < array.length; i++){
            if (array[i] == c)
                index = i;
                break;
        }

        if (index == -1)
            System.out.print("None");
        else
            System.out.print(index);
    }
}