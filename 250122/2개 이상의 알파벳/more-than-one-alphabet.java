import java.util.Scanner;
public class Main {
    public static String hasUniqueAlphabets(String a){
        int cnt = 0;

        for (int i = 0; i < a.length(); i++){
            for (int j = 0; j < a.length(); j++){
                if (i != j){
                    if (a.charAt(i) != a.charAt(j))
                        return "Yes";
                }
            }
        }

        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
    
        System.out.print(hasUniqueAlphabets(a));
    }
}