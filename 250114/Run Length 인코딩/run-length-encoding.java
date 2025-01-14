import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();
        char[] charArr = new char[1000];
        int[] num = new int[1000];
        int cnt = 1, start = 1;

        for (int i = 0; i < 1000; i++){
            if (len == 1){
                charArr[i] = str.charAt(0);
                num[i] = cnt;
                start += num[i];
                break;
            }
            if (start == len)
                break;
            else {
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

                        if (j == len-1 || j == len) {
                            charArr[i+1] = str.charAt(j);
                            num[i+1] = cnt;
                            start += num[i+1];
                        }
                        break;
                    }
                }
            }
        } 
    
        String result = "";
        for (int i = 0; i < 1000; i++){
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