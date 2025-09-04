import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[5];
        for (int i = 0; i < 5; i++) {
            ability[i] = sc.nextInt();
            total += ability[i];
        }

        int diffMin = Integer.MAX_VALUE;
        boolean isPossible = false;

        // 1명
        for (int i = 0; i < 5; i++) {
            int groupA = ability[i];

            // 나머지 4명 중 2명 선택
            for (int j = 0; j < 5; j++) {
                if (j == i) continue;
                for (int k = j + 1; k < 5; k++) {
                    if (k == i) continue;

                    int groupB = ability[j] + ability[k];

                    // 나머지 2명 
                    int groupC = total - groupA - groupB;
                
                    int max = Math.max(groupA, Math.max(groupB, groupC));
                    int min = Math.min(groupA, Math.min(groupB, groupC));

                    diffMin = Math.min(diffMin, max - min);
                    isPossible = true;
                }
            }
        }

        if (!isPossible) {
            System.out.println(-1);
        } else {
            System.out.println(diffMin);
        }
    }
}
