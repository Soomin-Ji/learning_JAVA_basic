package week01;
public class Quiz_type {
    public static void main(String[] args) {
        char c = 'S';
        int num = 10;

        System.out.println(c);
        System.out.println(num);

        System.out.println(c + num); // 93이 나옴; "S"의 아스키코드 값 83 + 10으로 연산을 해버림
        System.out.println(c + "" + num); // S10
        System.out.println(c + "\n" + num); // S \n 10 (개행)

        int[] intArray = new int[] { 10, 20, 30 };
        System.out.println(intArray[intArray.length - 1]);
        System.out.println(intArray[2]);
    }
}
