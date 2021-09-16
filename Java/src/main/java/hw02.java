//0906 - 숫자 정렬 후 배열 만들기
import java.util.Arrays;
import java.util.stream.Stream;

public class hw02 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        //숫자 입력받기
        System.out.print("숫자를 입력하세요 > ");
        int a = input.nextInt();

        input.close();

        int[] array = Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();

        //배열 오름차순으로 정렬
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}


