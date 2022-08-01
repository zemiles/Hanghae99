/*
네오와 프로도가 숫자놀이를 하고 있습니다.
네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
1478 → "one4seveneight"
234567 → "23four5six7"
10203 → "1zerotwozero3"
이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
*/
public class Solution22 {
    public int solution(String s) {
        int answer = 0;
        // 숫자가 문자열로 바뀐 경우의 문자열 배열과 숫자를 문자열 배열로 만들어준 배열 두 가지를 만들어줌 (같은 인덱스에 같은 내용이 들어가도록)
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // 처음에 매개변수로 주어진 String s 에서 영어 문자열 배열 str과 일치하는 부분을 숫자 문자열 배열 num에서 찾아 대체해줌
        for (int i = 0; i < 10; i++) {
            s = s.replace(str[i], num[i]);
        }

        // 정수값으로 변환
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Solution22 sol = new Solution22();
        String s = "23four5six7";
        int answer = sol.solution(s);
        System.out.println(answer);
    }
}
