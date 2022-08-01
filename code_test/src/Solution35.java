package hanghae99code;

public class Solution35 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {

            //toBinaryString
            //Integer 타입을 String 형태로 2진수로 반환
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            //%s는 문자열을 그대로 출력하고,
            //%s 앞에 숫자(N)를 설정할 경우, str.length()가 N보다 작을 경우 공백을 추가합니다. (ln 4~5)
            //- 를 붙일 경우, 왼쪽 정렬. (default는 오른쪽 정렬) (ln 5)
            //.숫자(N)를 설정할 경우, 최대 N길이 만큼만 출력 (ln 7~8)
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }

    public static void main(String[] args) {
        Solution35 st = new Solution35();
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};

        for(String i : st.solution(5,arr1,arr2))
        System.out.println(i);
    }
}
