import java.util.Arrays;

 /*
 < 완주하지 못한 선수 >
 - 참가자 배열과 완주자 배열이 있음
 - 참가자 배열과 완주자 배열의 길이 차이는 1
 - 참가자 이름은 1개 이상 20개 이하의 알파벳 소문자
 - 동명이인 있을 수 있음
 */

public class Solution04 {
    public static void main(String[] args) {
        String[] participant = {"a", "b", "c", "d", "e"};
        String[] completion = {"b", "e", "a", "c"};

        // 완주하지 못한 선수가 들어갈 빈 문자열
        String answer = "";

        // 참가자 & 완주자 배열을 정렬해줌
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 완주자 수 만큼 배열을 for문을 통해 돌려줌
        for(int i = 0; i < completion.length; i++) {
            // 참가자와 완주자를 비교해서 같지 않은 문자열을 찾아줌
           if(!participant[i].equals(completion[i])) {
               // 빈 문자열에 같지 않은 문자열을 넣어줌
               answer = participant[i];
               System.out.println(answer);
           }
        }
    }
}
