/**
* 내장 함수를 사용하지 않은 풀이 
**/

import java.util.Scanner;
public class Main {
    static String s, str;

    public static int isContain() {
        int startIndex = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == str.charAt(0)){
                startIndex = i;
                int cnt = 0;

                for (int j = 0; j < str.length(); j++){
                    if (s.charAt(j+startIndex) != str.charAt(j))
                        break;
                    else 
                        cnt++;
                }
                
                if (cnt == str.length())
                    return startIndex;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.next();
        str = sc.next();

        System.out.print(isContain());
    }
}