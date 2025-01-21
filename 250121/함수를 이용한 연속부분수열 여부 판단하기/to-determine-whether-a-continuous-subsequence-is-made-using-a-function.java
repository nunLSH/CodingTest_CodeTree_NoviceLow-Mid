import java.util.Scanner;
public class Main {
    public static String isSubsequence(String s1, String s2){
        if (s1.contains(s2))
            return "Yes";
        
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String s1 = "";
        String s2 = "";

        for (int i = 0; i < n1; i++){
            int a = sc.nextInt();
            s1 += Integer.toString(a)+" ";
        }

        for (int i = 0; i < n2; i++){
            int b = sc.nextInt();
            s2 += Integer.toString(b)+" ";
        }

        System.out.print(isSubsequence(s1, s2));
    }
}