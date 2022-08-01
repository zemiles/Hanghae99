package hanghae99code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution29 {
    //배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
    //
    //예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
    //
    //array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
    //1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
    //2에서 나온 배열의 3번째 숫자는 5입니다.
    //배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
    // commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            List<Integer> arr = new ArrayList<Integer>();
            //2, 5, 3 4, 4, 1 1, 7, 3

            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                arr.add(array[j]);
            }
            Collections.sort(arr);
            answer[i] = arr.get(commands[i][2]-1);
        }


//        for(int i = 0; i < commands.length; i++){
//            //Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 인덱스는 0부터 시작하는것 기준
//            //값에 의한 복사이므로 복사된 배열에서 값을 바꿔도 원본 배열의 값이 바뀌지 않음!
            //이 메소드는 첫 번째 매개변수로 복사할 원본 배열을 받고, 두 번째 매개변수로 시작 인덱스,
            // 세 번째 매개변수로 마지막 복사될 배열 인덱스+1을 받아서 원본 배열과 같은 타입의 복사된 새로운 배열을 반환해준다.
//            int[] temp = Arrays.copyOfRange(array,commands[i][0] - 1,commands[i][1]);
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }

        return answer;
    }



    public static void main(String[] args) {
        Solution29 st = new Solution29();

        int[] ar = new int[] {1, 5, 2, 6, 3, 7, 4};

        int[][] com = new int[][] {{2, 5, 3},{4, 4, 1},{1, 7, 3}};

        for(int i : st.solution(ar,com)){
            System.out.println(i);
        }

    }
}
