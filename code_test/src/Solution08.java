import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution08 {

    //문제 정수 내림차순으로 배치하기
    //함수 solution은 정수 n을 매개변수로 입력받습니다. 
    // n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
    // 예를들어 n이 118372면 873211을 리턴하면 됩니다.
    //n은 1이상 8000000000 이하인 자연수입니다.

    //배열에 담아서 배열끼리 비교하고
    //넘겨주면서 자동 소팅 하게 만들고 출력
    
    public long solution(long n){

        String str = Long.toString(n);

        String[] strList = new String[str.length()];
        for(int i = 0; i < strList.length; i++){
            //substring은 글자를 쪼깨는 함수
            strList[i] = str.substring(i,i+1);
        }
        
        //오름차순
        //Arrays.sort(strList);
        //내림차순
        Arrays.sort(strList, Collections.reverseOrder());

        String result = "";

        for(String i : strList ){
            result += i;
        }

        long answer = Long.parseLong(result);

        return answer;
    }
    public static void main(String[] args) {
        Solution08 t = new Solution08();
        System.out.println(t.solution(45411841));
    }
}
