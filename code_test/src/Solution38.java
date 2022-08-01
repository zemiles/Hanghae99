package hanghae99code;


import java.util.*;

public class Solution38 {

    public String solution(String s) {
        List<Integer> list = new ArrayList<Integer>();
        //StringTokenizer은 String type에서 특정한 구분자를 통해서 토큰 형태로 나눌때
        //사용하는 클래스입니다.
        //여기서는 띄어쓰기를 구분자로 사용
        StringTokenizer st = new StringTokenizer(s);
        //hasMoreTokens이 있는지 확인
        //return type이 boolean 이라서 true혹은 false로 반환
        while (st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        //StringBuilder는 String type으로
        //String객체와 String객체를 더하는 행위 같은거는
        //인스턴스 생성과 관련된 메모리 소모가 되는 부분이 있어서
        //조금더 연산에 빠르게 작업할수 있게 여러 메소드가 있다.
        StringBuilder sb = new StringBuilder();
        sb.append(Collections.min(list)).append(" ").append(Collections.max(list));

        return sb.toString();
    }


    public static void main(String[] args) {
        Solution38 st = new Solution38();
        System.out.println(st.solution("1 2 3 4"));
    }
}
