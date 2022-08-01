import java.util.Scanner;

public class Solution03 {
    /*
    길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

    제한 조건
    n은 길이 10,000이하인 자연수입니다.

    입출력 예
    n	return
    3	"수박수"
    4	"수박수박"
     */
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자 입력 ('0': 종료) >> ");
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            Solution03 sol = new Solution03();
            String answer = sol.solution(n);

            System.out.println(answer);
            System.out.println("-----------------------------------------------------------");
        }
    }
}
