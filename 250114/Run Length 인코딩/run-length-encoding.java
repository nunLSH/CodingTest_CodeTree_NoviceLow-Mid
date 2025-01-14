import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();
        char[] charArr = new char[len];
        int[] num = new int[len];
        int cnt = 1, start = 1;

        for (int i = 0; i < len; i++){
            if (start == len)
                break;
            for (int j = start; j < len; j++){
                if (str.charAt(j-1) == str.charAt(j)){
                    if (j == len-1) {
                        cnt++;
                        charArr[i] = str.charAt(j-1);
                        num[i] = cnt;
                        start += num[i];
                        break;
                    } else {
                        cnt++;
                    }
                } else {
                    charArr[i] = str.charAt(j-1);
                    num[i] = cnt;
                    start += num[i];
                    cnt = 1;
                    break;
                }
            }
        }
        
        String result = "";
        for (int i = 0; i < len; i++){
            if (num[i] != 0) {
                result += charArr[i];
                result += num[i];
            } else 
                break;
        }

        System.out.println(result.length());
        System.out.println(result);
    }
}