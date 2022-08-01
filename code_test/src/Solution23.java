package hanghae99code;

public class soluution03 {
    public String solution(String s, int n) {
        String answer = "";


        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch)) { //소문자
                //아스키 코드를 보면 소문자 a는 97이란 숫자를 가지고 있다
                //ch에서 a값을 빼면 입력받은 ch의 숫자가 나오고
                //거기서 n만큼 이동을 한다
                //%26은 알파벳의 수를 뜻하고
                //거기서 a를 더하면 해당하는 숫자가 나온다.
                //그것을 char형으로 변환해서 저장하고 answer에 저장
                //for문이 끝날대까지 돌아간다.
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if(Character.isUpperCase(ch)) { //대문자
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }

            answer += ch;
        }


        return answer;
    }

    public static void main(String[] args) {
        soluution03 st = new soluution03();



        System.out.println(st.solution("AD", 1));
    }

}
