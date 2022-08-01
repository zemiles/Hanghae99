import java.util.ArrayList;

public class Solution15 {
    /*
    문제 설명
        배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
        이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
        단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
        arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
        arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
        배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

    제한사항
        배열 arr의 크기 : 1,000,000 이하의 자연수
        배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

    입출력 예
        arr	                answer
        [1,1,3,3,0,1,1]	    [1,3,0,1]
        [4,4,4,3,3]	        [4,3]
        입출력 예 설명
        입출력 예 #1,2
        문제의 예시와 같습니다.
     */
    public int[] solution(int []arr) {
        //1. 크기를 모르는 배열이 들어오기 때문에 크기가 가변하는 ArrayList를 이용
        ArrayList<Integer> list = new ArrayList();

        //2. 베열에 들어오는 숫자는 0 ~ 9라는 제한 조건을 충족시키기 위한 상관없는 수 num 생성
        int num = -1;

        for(int i=0; i<arr.length; i++){
            //3. for문 첫 번째 실행 시 2번의 기능을 수행하고
            if(num != arr[i]){
                //4. 두번째부터 arr에서 꺼내온 값을 num에 저장하여 다음 for문 실행 시 중복여부 검사
                num = arr[i];
                //5. 중복되지 않은 수임으로 list에 저장
                list.add(arr[i]);
            }
        }
        //6. 답안을 저장할 answer배열 생성(list 사이즈만큼)
        int[] answer = new int[list.size()];
        //7. list에 저장된 값들을 차례대로 answer에 저장
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] resultArr = sol.solution(arr);
        for (int i=0; i<resultArr.length; i++) {
            System.out.print(resultArr[i]);
        }
    }
}
