import java.util.Stack;

public class Solution40 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        /*
        Stack은 쌓는 개념 - LIFO(Last In First Out)
        */
        Stack<Integer> bucket = new Stack<>();
        // Stack 은 비어있는 상태로 시작하면 에러
        bucket.push(0);

         /*
         중첩 for 문으로 돌려줌
         - (바깥은 크레인을 움직인 수인 moves / 안에는 이차원 배열인 board)
         - 크레인의 첫번째 움직임은 moves[0] = 1이다
         - 하지만 주어진 이차원 배열의 모습과 인형이 담겨있는 칸의 인덱스 수가 다르다
         - moves[0]은 1이지만 실제 크레인이 가는 곳은
         - 이차원 배열의 모습을 한 인형뽑기 기계 안의 인덱스가
         - board[i][0] 인 곳이다 만약 moves[1] = 5 일 때는 board[i][4]인 곳이기 때문에
         - for 문에서 board 인덱스 값은 board[i][moves[i]-1]로 해줘야한다
         - 인형뽑기 기계 칸의 번호가 moves 안의 배열 요소 값보다 1이 작기 때문
         */
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                // 크레인이 향한 이차원 배열의 값이 0이 아닐 때
                if (board[j][moves[i]-1] != 0) {
                    // Stack 의 제일 위에 있는 값과 크레인이 가져간 값이 같으면
                    if (bucket.peek() == board[j][moves[i]-1]) {
                        // 그 값을 지워주고
                        bucket.pop();
                        // 인형 두개가 터지는 것을 카운트
                        answer += 2;
                    } else {
                        // 그렇지 않으면 Stack 에 넣어줌
                        bucket.push(board[j][moves[i]-1]);
                    }
                    // 크레인이 가져간 값은 이제 인형이 없는 자리이므로 0으로 바꿔줌
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution40 sol = new Solution40();
        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int answer = sol.solution(board, moves);
        System.out.println(answer);
    }
}
