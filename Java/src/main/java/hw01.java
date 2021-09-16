//0906 - 단어 뒤집기
import java.util.StringTokenizer;

public class hw01 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        //문자 입력받기
        System.out.print("단어를 입력하세요 > ");
        String str = input.nextLine();

        //구분자 "," 지정
        StringTokenizer st = new StringTokenizer(str,",");

        //구분자를 통해 잘려진 문자열이 있는지 검증
        while (st.hasMoreTokens()){
        String s = st.nextToken();

        //문자열 뒤집기
        s = new StringBuilder(s).reverse().toString();

        //구분자를 통해 잘려진 문자열 반환
        System.out.println(s);
        }

        input.close();
    }
}
