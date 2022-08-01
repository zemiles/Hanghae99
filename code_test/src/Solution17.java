package hanghae99code;

import java.util.*;

public class soluution01 {

    public int[] solution(int[] lottos, int[] win_nums) {
        //스플릿 함수로 하나씩 넣는다
        int lottos_count = 0;
        int win_count = 0;
        String nL = Arrays.toString(lottos);
        String nW = Arrays.toString(win_nums);
        String[] tempLottos = nL.split("");
        int relottos = 0;
        int rewin = 0;
        for(int i = 0; i < lottos.length; i++)
        {
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    win_count += 1;
                    System.out.println(win_count);
                }
            }
        }
        //0값이 있는지 여부
        lottos_count = Collections.frequency(Arrays.asList(tempLottos),"0");
        lottos_count += win_count;

        switch (lottos_count){
            case 0:
                rewin = 6;
                break;
            case 1:
                relottos = 6;
                break;
            case 2:
                relottos = 5;
                break;
            case 3:
                relottos = 4;
                break;
            case 4:
                relottos = 3;
                break;
            case 5:
                relottos = 2;
                break;
            case 6:
                relottos = 1;
                break;
        }
        switch (win_count){
            case 0:
                rewin = 6;
                break;
            case 1:
                rewin = 6;
                break;
            case 2:
                rewin = 5;
                break;
            case 3:
                rewin = 4;
                break;
            case 4:
                rewin = 3;
                break;
            case 5:
                rewin = 2;
                break;
            case 6:
                rewin = 1;
                break;
        }

        int[] answer = {relottos,rewin};
        return answer;
    }


    public static void main(String[] args) {

        soluution01 st = new soluution01();
        int[] lottos1 = new int[] {44, 1, 0, 0, 31, 25};
        int[] lottos2 = new int[] {0, 0, 0, 0, 0, 0};
        int[] lottos3 = new int[] {45, 4, 35, 20, 3, 9};

        int[] win_nums1 = new int[] {31, 10, 45, 1, 6, 19};
        int[] win_nums2 = new int[] {38, 19, 20, 40, 15, 25};
        int[] win_nums3 = new int[] {20, 9, 3, 45, 4, 35};

        int[] test = st.solution(lottos2,win_nums2);

        for(int i : test){
            System.out.print(i);
        }


    }
}
