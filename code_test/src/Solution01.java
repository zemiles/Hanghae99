public class Solution01 {
    public String solution(int a, int b) {
        // 1월 1일 = 금요일
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        for (int i = 0; i < a - 1; i++) {
            sum += date[i];
        }
        sum += b - 1;

        String answer = day[sum % 7];

        return answer;
    }
    public static void main(String[] args) {
        Solution01 sol = new Solution01();

        int a = 5;
        int b = 24;

        String answer = sol.solution(a, b);
        
        System.out.println(answer);
    }
}
