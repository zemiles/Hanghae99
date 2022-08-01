package hanghae99code;

import java.util.*;

public class Solution32 {

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        double[] fail = new double[N+1];
        for(int i : stages){ // fail[]에 스테이지에 있는 사람 수 넣음. 0부터 N까지 있음
            if(i >= N+1)
                fail[N]++;
            else
                fail[i-1]++;
        }

        for(int i = 0; i < N+1; i++){ // 실패율 구하기
            int add = 0;
            for(int j = i; j < N+1; j++){
                add += fail[j];
            }
            if(fail[i] != 0)
                fail[i] = fail[i] / add;
            else {
                fail[i] = 0; // 이거 꼭 해줘야한다...
            }
        }

        for(int j = 0; j < N; j++){ // 뒤에서부터 훑어서 answer[] 배열에 넣기
            int index = -1;
            double big = -1;
            for(int i = N-1; i > -1; i--){
                if(fail[i] >= big) {
                    big = fail[i];
                    index = i;
                }
            }
            if(index != -1){
                fail[index] = -2;
                answer[j] = index+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution32 st = new Solution32();
        int[] list = new int[] {2, 1, 2, 6, 2, 4, 3, 3};
        for(int i : st.solution(5,list)){
            System.out.print(i);
        }
    }
}
