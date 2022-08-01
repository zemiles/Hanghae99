public class Solution07 {
    public int[] solution(long n) {
        // arr에 n을 문자열로 변환하고 한글자 씩 쪼갠 배열을 생성해줌
        String[] arr = Long.toString(n).split("");

        // answer 배열은 arr과 길이가 같기 때문에 같은 길이의 배열을 생성해줌
        int[] answer = new int[arr.length];

        // for문을 거꾸로 돌려 answer 배열에 arr의 숫자들을 거꾸로 넣어줌
        // 넣어주는 동시에 문자열로 변환했던 arr 배열을 다시 정수로 변환함
        for(int i = arr.length-1; i >= 0; i--) {
            answer[arr.length - i - 1] = Integer.parseInt(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution07 sol = new Solution07();

        long n = 345101;
        int[] answer = sol.solution(n);

        /*for(int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }*/

        // 향상된 for문
        for(int i : answer) {
            System.out.println(i);
        }

    }

}
