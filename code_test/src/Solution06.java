import java.util.*;

public class Solution06 {
    /*
    문제 설명
    자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    제한사항
    N의 범위 : 100,000,000 이하의 자연수

    입출력 예
    N	answer
    123	6
    987	24

    입출력 예 설명
    입출력 예 #1
    문제의 예시와 같습니다.
    입출력 예 #2
    9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
     */
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n); //int n을 String으로 변환

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.substring(i, i+1)); //String substring(int a, int b) a부터 b직전까지의 문자열

        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("정수 입력: ");
            int n = sc.nextInt();

            Solution06 sol = new Solution06();
            int answer = sol.solution(n);

            System.out.println("결과: " + answer);
            System.out.println("------------------------");
        }
    }
}