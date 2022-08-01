import java.util.ArrayList;
import java.util.Collections;
/*
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면
각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
*/
public class Solution19 {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> answerList = new ArrayList<>();

        // answerList 에 strings 배열에 있는 글자 하나씩에 n번째 인덱스에 있는 문자를 맨 앞에 붙여서 넣어줌
        for (int i = 0; i < strings.length; i++) {
            answerList.add(strings[i].charAt(n) + strings[i]);
        }

        // 맨 앞글자(각 문자열의 인덱스 n번째 글자)를 기준으로 오름차순 정렬
        Collections.sort(answerList);

        // answer 배열의 길이 설정
        String[] answer = new String[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            // answer 배열에 answerList 에 있는 요소들의 1번째 인덱스부터 시작하는 문자열을 넣어줌
            answer[i] = answerList.get(i).substring(1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] answer = sol.solution(strings, n);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }
}
