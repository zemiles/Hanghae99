import java.util.Scanner;

public class Solution12 {
    /*
    문제 설명
        양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
        예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
        자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    제한 조건
        x는 1 이상, 10000 이하인 정수입니다.

    입출력 예
        arr	return
        10	true
        12	true
        11	false
        13	false

    입출력 예 설명
        입출력 예 #1
        10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.

        입출력 예 #2
        12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.

        입출력 예 #3
        11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.

        입출력 예 #4
        13의 모든 자릿수의 합은 4입니다. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아닙니다.
     */
    public boolean solution(int x) {
        boolean answer= true;

        //1. 입력받은 x를 문자열로 변환
        String str = String.valueOf(x);

        //2. 문자열의 길이만큼 정수 배열을 생성
        int[] arr = new int[str.length()];

        //3. 각 자릿수의 합을 저장하는 sum 변수 생성
        int sum = 0;

        for (int i=0; i<str.length(); i++) {
            //4. 문자열의 각 자리를 int 타입으로 변환해서 정수 배열에 저장
            arr[i] = Integer.parseInt(str.substring(i, i+1)); //substring(a, b) a부터 b직전까지

            //5. 정수 배열에 저장된 각 자릿수의 합을 저장
            sum += arr[i];
        }

        System.out.println("각 자릿수의 합: " + sum);

        if (x % sum == 0) {
            //6. x를 sum으로 나누어 떨어지면 하샤드 수임으로 answer에 true를 저장
            answer = true;
        } else {
            //7. 아니라면
            answer = false;
        }

        return  answer;
    }

    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("입력: ");
            int x = sc.nextInt();
            System.out.println("결과: " + sol.solution(x));
            System.out.println("-----------------------");
        }
    }
}
