import java.util.Arrays;

public class Solution02 {
    public int[] divisible(int[] arr, int divisor) {
        //count변수 선언
        int count = 0;
        //처음에는 입력받은 배열의 길이만큼 for문을 돌려준뒤
        for (int i = 0; i < arr.length; i++) {
            //입력받은 배열과 나눌려는 숫자를 나눠서 몫 0이 될경우
            if(arr[i] % divisor == 0){
                //count값을 증가시킨다.
                count++;
            }
        }
        
        //여기서 리턴 받을 배열을 count값만큼 초기화 시켜준다.
        int[] answer = new int[count];
        //초기화가 됬을경우 0으로 다시 만들어준다.
        count = 0;
        //다시 for문을 돌려준다. 이유는 리턴받을 배열에 값을 넣기 위해서
        for (int i = 0; i < arr.length; i++) {
            //몫이 0이 될경우에만
            if(arr[i]%divisor == 0){
                //증가되는 값을 하나하나 배열에 넣어준다
                answer[count]=arr[i];
                //인덱스 값을 대조하기 위해 한개씩 담아준다.
                count++;
            }
        }
        //정렬 사용
        Arrays.sort(answer);

        //위 경우에 다 해당이 되지 않는다면
        if(answer.length == 0){
            //인덱스값을 1생성후
            answer = new int[1];
            //-1을 삽입한다.
            answer[0] = -1;
        }
        return answer;
    }

       // int[] an = solution();
       public static void main(String[] args) {
           Solution02 div = new Solution02();
           int[] array = {5, 9, 7, 10};
           int[] array2 = {2, 36, 1, 3};
           int[] array3 = {3,2,6};
           System.out.println( Arrays.toString( div.divisible(array, 5) ));
           System.out.println( Arrays.toString( div.divisible(array2, 1) ));
           System.out.println( Arrays.toString( div.divisible(array3, 10) ));

       }
}
