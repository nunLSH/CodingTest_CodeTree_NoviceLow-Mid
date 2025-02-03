import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();
        char[] nums = number.toCharArray();
        int[] digits = new int[number.length()];

        for (int i = 0; i < number.length(); i++){
            digits[i] = nums[i] - '0';
        }

        int num = 0;
        for (int i = 0; i < number.length(); i++)
            num = num * 2 + digits[i];
            
        System.out.print(num);
    }
}