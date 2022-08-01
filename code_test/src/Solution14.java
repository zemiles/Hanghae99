import java.util.Arrays;


/*
명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서,
 작아서 들고 다니기 편한 지갑을 만들어야 합니다. 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.

아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.

명함 번호	가로 길이	세로 길이
1	60	50
2	30	70
3	60	30
4	80	40
가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로)
크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로)
 크기의 지갑으로 모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.

모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
*/
public class Solution14 {

    //1. 가로 세로 길이를 비교 후 가로가 세로보다 길다면 두 인덱스 변경👍
    //
    //2. 가로 길이가 가장 긴 것을 max_width 에 저장
    //
    //3. 세로 길이가 가장 긴 것을 max_height 에 저장
    //4. 가로 세로를 곱하여 크기를 구하고 return
    public int sol(int[][] sizes) {

        //가로길이 세로길이 지갑의 사이즈 선언
        int max_width, max_height, wallet_size;
        //변수 초기화
        max_width = 0;
        max_height = 0;

        //입력 인자 만큼 for문 돌린다.
        for (int i = 0; i < sizes.length; i++) {
            //소팅할 변수 선언
            int temp;
            //만약 [i]의[0]번째 인덱스 값이 [i]의[1]인자보다 작다면 서로의 위치를 변환
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            //최대 가로값이 해당하는 인덱스보다 작다면 데이터 저장
            if (max_width < sizes[i][0]) {
                max_width = sizes[i][0];
            }
            //최대 세로값이 해당하는 인덱스보다 작다면 데이터 저장
            if (max_height < sizes[i][1]) {
                max_height = sizes[i][1];
            }
        }

        //for문이 다 돌아갔다면 지갑에 두 값의 곱을 저장후 return
        wallet_size = max_width * max_height;
        return wallet_size;

    }



    public static void main(String[] args){
        Solution14 t = new Solution14();
        int[][] n1 = {
                {60, 50}, {30, 70}, {60, 30}, {80, 40}
        };
        int[][] n2 = {
                {10, 7}, {12, 3}, {8, 15}, {14, 7},{5, 15}
        };
        int[][] n3 = {
                {14, 4}, {19, 6}, {6, 16}, {18, 7},{7, 11}
        };
        System.out.println(t.sol(n1));
        System.out.println(t.sol(n2));
        System.out.println(t.sol(n3));



    }
}
