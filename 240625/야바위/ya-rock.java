import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력 개수 N
        
        // 교환 정보 배열
        int[][] swaps = new int[n][3];
        
        // 입력 받기
        for (int i = 0; i < n; i++) {
            swaps[i][0] = sc.nextInt();
            swaps[i][1] = sc.nextInt();
            swaps[i][2] = sc.nextInt();
        }
        
        // 가능한 모든 시작 위치 (1, 2, 3)에 대해 최대 점수 계산
        int maxScore = 0;
        
        for (int start = 1; start <= 3; start++) {
            int currentScore = simulateGame(start, swaps);
            maxScore = Math.max(maxScore, currentScore);
        }
        
        // 최대 점수 출력
        System.out.println(maxScore);
        
        sc.close();
    }
    
    // 시작 위치에서 시뮬레이션을 통해 최대 점수 계산
    private static int simulateGame(int initialCup, int[][] swaps) {
        int stonePosition = initialCup; // 초기 조약돌 위치
        int score = 0;
        
        for (int[] swap : swaps) {
            int a = swap[0];
            int b = swap[1];
            int c = swap[2];
            
            // Swap the positions if the stone is under either cup involved in the swap
            if (stonePosition == a) {
                stonePosition = b;
            } else if (stonePosition == b) {
                stonePosition = a;
            }
            
            // Check if the stone is now under the target cup
            if (stonePosition == c) {
                score++;
            }
        }
        
        return score;
    }
}