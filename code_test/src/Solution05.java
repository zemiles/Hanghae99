import java.util.Arrays;
import java.util.Locale;


//문제
//문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
// 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
// 각 단어의 짝수번째 알파벳은 대문자로,
// 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

public class Solution05 {
// 접근 방식
//

        public String sol(String s) {
            String answer = "";
            //띄어쓰기없애는 split함수를 써서 string배열에 담는다.
            String[] temp = s.split("");

            //짝수 자리인지 홀수 자리인지 체크
            int ind = 0;
            //for문으로 입력값의 길이만큼 돌려준다.
            for(int i = 0; i < s.length(); i++){
                //처음 입력값이 없다면 0값을 대입해서 강제로 대문자 타게 만든다.
                if(temp[i].equals("")){
                    ind = 0;
                    //ind가 짝수라면 (첫값은 0이기에 이곳부터 타서 첫글자는 대문자)
                }else if(ind % 2 == 0){
                    //toUpperCase() 함수는 글자를 전부 대문자로 바꾼다.
                    //인덱스 값에 들어가있는 글자를 대문자로 바꾼다.
                    temp[i] = temp[i].toUpperCase();
                    ind++;
                    //ind가 홀수라면 소문자로 변환
                }else if(ind % 2 != 0){
                    //toLowerCase() 함수는 글자를 전부 소문자로 바꾼다.
                    //인덱스 값에 들어가있는 글자를 소문자로 바꾼다.
                    temp[i] = temp[i].toLowerCase();
                    ind++;
                }
                //값을 넣는다.
                answer += temp[i];
            }

            return answer;
        }

    public static void main(String[] args) {
        Solution05 code = new Solution05();
        String test = "Hello world";
        System.out.println(code.sol(test));
    }

}
