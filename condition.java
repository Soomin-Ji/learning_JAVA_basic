import java.util.Scanner;

public class dcondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score>90 && score<=100){
            System.out.println("A 등급");
        }
        else if (score>80 && score<=90) {
            System.out.println("B");
        }
        else if(score>70 && score<=80){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
    }
}