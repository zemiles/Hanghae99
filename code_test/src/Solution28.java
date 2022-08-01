import java.util.Arrays;

public class Solution28 {
    public int[] solution(int n, int m) {
        // 최대 공약수와 최소 공배수를 리턴해줄 배열
        int[] answer = new int[2];

        // n과 m을 담아줄 배열
        int[] arr = new int[2];
        arr[0] = n;
        arr[1] = m;

        // 작은 수가 앞에 오도록 오름차순 정렬
        Arrays.sort(arr);
        int min = arr[0];

        // 작은 수 만큼 for 문을 돌려줌
        for (int i = 1; i <= min; i++) {
            // 1부터 나누어 줄 때 두 수 모두 공통으로 나누어지는 수가 공약수, 마지막 i 값이 최대 공약수
            if (n%i == 0 && m%i == 0) {
                answer[0] = i;
            }
            // 최소 공배수 = 두 수의 곱 / 최대 공약수
            /*
            G [ A  B ]  G(최대 공약수) L(최소공배수) = G * a * b
              -------
               a   b    A * B = Ga * Gb = G(제곱) * a * b -> 나누기 G 하면 G * a * b
            */
            answer[1] = n * m / answer[0];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution28 sol = new Solution28();
        int n = 18;
        int m = 30;
        int[] answer = sol.solution(n, m);
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
