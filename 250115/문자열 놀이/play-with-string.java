import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();
        char[] arr = str.toCharArray();

        for (int i = 0; i < q; i++){
            int q_num = sc.nextInt();

            if (q_num == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();

                char temp = str.charAt(a-1);

                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
                
                System.out.println(String.valueOf(arr));
            } else {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                for (int j = 0; j < arr.length; j++){
                    if (arr[j] == a)
                        arr[j] = b;
                }
                
                System.out.println(String.valueOf(arr));
            }
        }
    }
}