import java.util.Scanner;

public class Solution09 {
    /*
    문제 설명
    임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

    제한 사항
    n은 1이상, 50000000000000 이하인 양의 정수입니다.
    입출력 예
    n	return
    121	144
    3	-1
    입출력 예 설명
    입출력 예#1
    121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.

    입출력 예#2
    3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
     */
    public long solution(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) { //sqrt(a) : a의 제곱근을 반환
            return (long) Math.pow(Math.sqrt(n) + 1, 2); //pow(a, b) : 전달된 두 개의 double형 값을 가지고 제곱 연산을 수행 (a의 b승)
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution09 sol = new Solution09();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("정수 입력: ");
            long n = sc.nextLong();
            System.out.println("결과: " + sol.solution(n));
            System.out.println("-------------------------");
        }
    }
}
