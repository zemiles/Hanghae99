public class Solution31 {
    public int solution(int n) {
        int answer = 0;
        /*
        [ 에라토스테네스의 체 ]
        - 2부터 n까지 나열
        - 2는 소수이고 2의 배수들은 소수가 아니므로 0으로 처리
        - 3은 소수이고 지워지지 않음 3의 배수들은 소수가 아니므로 0으로 처리
        - 5도 소수이고 지워지지 않음 5의 배수들도 0으로 처리
        */

        // n보다 1이 큰 길이의 배열 생성
        int[] arr = new int[n+1];

        // 2부터 n까지 배열에 넣어줌 (i 값과 들어가는 값이 같다)
        // 1인 소수가 아님
        for (int i = 2; i <= n; i++) {
            arr[i] += i;
        }

        // 배열의 값이 0이면 넘어가고 아니면 그 배수들을 0으로 만듦
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) continue;

            // 2, 3, 5는 소수이기 때문제 i=2, 3, 5일 때 j 값은 i의 배수부터 시작해야함
            // ex) i=2이면 i=4, i=6, i=8, i=10 모두 0이 됨
            // ex) i=3이면 i=6은 이미 0이고 i=9 가 0이 됨
            // ex) i=5이면 i=10은 이미 0
            // 이런 식으로 진행
            for (int j = i*2; j <= n; j+=i) {
                arr[j] = 0;
            }
        }

        // arr 배열에 남은 수 중에 0이 아닌 수를 카운트해줌 (소수의 개수)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution31 sol = new Solution31();
        int n = 10;
        int answer = sol.solution(n);
        System.out.println(answer);
    }
}
