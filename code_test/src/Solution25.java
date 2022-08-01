/*
두 정수 left와 right가 매개변수로 주어집니다.
left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
*/
public class Solution25 {
    public int solution(int left, int right) {
        int answer = 0;

        // 중첩 for문을 통해 약수를 구하는 식을 설계
        for (int i = left; i <= right; i++) {
            // 약수의 개수를 넣어줄 cnt 변수
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                // left 부터 시작하는 해당 수를 1부터 맞춰서 나누어 약수를 확인, 약수이면 cnt가 1씩 증가
                if (i%j == 0) {
                    cnt++;
                }
            }

            // 약수의 개수가 짝수이면
            if (cnt%2 == 0) {
                // left 부터 시작하는 해당 수를 answer 에 더해줌
                answer += i;
            } else {
                // 홀수라면 answer 에서 빼줌
                answer -= i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution25 sol = new Solution25();
        int left = 24;
        int rigth = 27;
        int answer = sol.solution(left, rigth);
        System.out.println(answer);
    }
}
