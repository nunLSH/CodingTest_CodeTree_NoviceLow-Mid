import java.util.Scanner;
import java.util.Arrays;

class Num implements Comparable<Num>{
    int num, order;

    public Num (int num, int order){
        this.num = num;
        this.order = order;
    }

    @Override
    public int compareTo(Num num){
        return this.num - num.num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Num[] numbers = new Num[n+1];

        for (int i = 1; i <= n; i++){
            int num = sc.nextInt();
            
            numbers[i] = new Num(num, i);
        }

        Arrays.sort(numbers, 1, n+1);

        int[] nums = new int[n+1];
        for (int i = 1; i <= n; i++){
            nums[numbers[i].order] = i;
        }

        for (int i = 1; i <= n; i++)
            System.out.print(nums[i]+" ");
    }
}