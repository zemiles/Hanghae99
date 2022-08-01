import java.util.ArrayList;

public class Solution34 {
    public int solution(int[] nums) {
        int answer = 0;
        // 가져갈 수 있는 폰켓몬의 개수
        int len = nums.length / 2;
        // 번호가 다른 폰켓몬을 모아둘 리스트
        ArrayList<Integer> difList = new ArrayList<>();

        // nums 배열에 있는 숫자(폰켓몬)들을 리스트에 넣어줌
        // 단, 리스트에 그 숫자가 없을 때만
        for (int i = 0; i < nums.length; i++) {
            if (!difList.contains(nums[i])) {
                difList.add(nums[i]);
            }
        }
        // nums 배열에서 서로 다른 숫자가 모여있는 리스트의 크기
        int difCount = difList.size();

        /*
        생각해보았을 때 가장 많은 종류의 폰켓몬을 선택하는 방법은
        가져갈 수 있는 폰켓몬 수와 배열 안에 있는 폰켓몬 종류의 수가 같을 때이다
        또한, 가져갈 수 있는 폰켓몬 수가 3일 때 배열 안에 있는 폰켓몬 종류가 2가지이면
        최대 종류의 수는 2이다
        따라서, 가져갈 수 있는 폰켓몬의 개수가 배열 안의 폰켓몬 종류의 개수보다 많거나 같을 때
        return 값은 배열 안의 폰켓몬 종류의 개수와 같고
        가져갈 수 있는 폰켓몬의 개수가 배열 안의 폰켓몬 종류의 개수보다 적을 때에는
        return 값이 가져갈 수 있는 폰켓몬의 개수와 같다
        */

        if (len >= difCount) {
            answer = difCount;
        } else if (len < difCount) {
            answer = len;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution34 sol = new Solution34();
        int[] nums = {3,1,2,3};
        int answer = sol.solution(nums);
        System.out.println(answer);
    }
}
