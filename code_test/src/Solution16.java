import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/*
정수 배열 numbers 주어집니다.
numbers 에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에
오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
*/
public class Solution16 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        // numbers 배열에서 다른 인덱스에 있는 두 개의 수를 뽑아 더한 값을 임시로 넣어줄 변수
        int value = 0;

        // numbers[i] + numbers[i+1] 을 해줄 중첩 for문 설계
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                value = numbers[i]+numbers[j];      // value 값에 두 값을 더한 수를 넣어주고
                if (!answerList.contains(value)) {  // 그걸 모아줄 answerList에 contains로 포함 여부를 확인해서 없다면
                    answerList.add(value);          // answerList 에 추가해줌
                }
            }
        }

        Collections.sort(answerList);                                   // answerList를 오름차순 정렬해줌
        int[] answer = answerList.stream().mapToInt(i->i).toArray();    // ArrayList<Integer> -> int[]로 변환
        return answer;
    }

    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        int[] numbers = {5,0,2,7};
        int[] answer = sol.solution(numbers);

        for (int i : answer) {
            System.out.println(i);
        }
    }

}
