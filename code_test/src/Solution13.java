public class Solution13 {
    public int solution(int n) {
        int answer = 0;
        // n을 3진법 상에서 뒤집은 내용을 String 형태로 담아줌
        String ans = "";

        // while문으로 ans에 n을 3으로 나눈 값의 나머지를 담아줌
        // ans에 담기는 값 = n을 3진법 상에서 앞뒤로 뒤집은 값
        while(n != 0) {
            ans += n % 3;   // 3으로 나눈 나머지 값
            n /= 3;         // 3으로 나눈 몫을 다시 n 값으로
        }

        // Integer.parseInt(String, n)
        // String을 n진법으로 표현한 int값 리턴
        answer = Integer.parseInt(ans, 3);
        return answer;
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        int n = 225;
        int answer = sol.solution(n);
        System.out.println(answer);
    }
}
