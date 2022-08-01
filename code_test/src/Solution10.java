import java.util.Arrays;

public class Solution10 {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1일 때는 -1을 return 해줌
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        // 정수 arr 배열을 오름차순으로 정렬해줌
        Arrays.sort(arr);

        // answer 배열은 arr 배열보다 길이가 -1인 배열로 선언함
        int[] answer = new int[arr.length-1];

        // answer 배열에 사용할 인덱스 번호를 arr 배열의 길이보다 -2인 크기로 설정해줌
        // - (배열 인덱스의 길이 = 배열의 길이 - 1) 이고
        // answer의 길이는 arr보다 1작기 때문에 answer 배열의 인덱스는 arr 배열의 길이에서 총 -2 해줌
        int idx = arr.length-2;

        // for문을 통해 answer 배열에 arr 배열의 첫번째 인덱스를 제외하고 넣어줌
        for(int i = 0; i < arr.length; i++) {
            // continue를 통해 i가 0인 경우 건너뛰기 해줌
            if(i == 0) {
                continue;
            }
            // answer는 내림차순으로 저장해야 하기 때문에 arr과 반대로 넣어준다
            answer[idx--] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution10 sol = new Solution10();

        int[] arr = {10, 4, 7, 3, 5, 9};
        int[] answer = sol.solution(arr);

        for(int i : answer) {
            System.out.println(i);
        }
    }
}
