import java.util.Arrays;

public class bReference_type {
    public static void main(String[] args) {
       /* // write your code here
        String sparta = "Hello World";
        System.out.println(sparta);

        int[] intArray = new int[] {1, 2, 3, 4, 5};    // int[](int배열:int를 여려개 담을 수 있는 곳)는 int기본자료형이 아니라 참조자료형임
        System.out.println(Arrays.toString(intArray)); // intArray에서 option(Alt)+Enter
        */
        
        //-----------------------------------------------

        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));

        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        System.out.println(season[season.length -1]); // length: 해당 배열이 가지고 있는 길이를 리턴해주는 변수, 모든 배열에 내장되어 있음. but, 배열은 0부터 시작하기 때문에 -1을 해줘야 마지막 index에 저장해둔 값(겨울)이 나오는 것임
    }
}