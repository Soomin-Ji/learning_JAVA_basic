package week01;
public class Iteration {

    public static void main(String[] args) {
        // for-each
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day: days){
            System.out.println(day);
        }

        // //while
        // int i = 0;
        // int sum = 0;

        // while(i < 10){
        //     sum += (i+1);
        //     i++;
        // }
        // System.out.println(sum);

        // do-while
        int i = 0;
        int sum = 0;

        do{
            sum += (i+1);
            i++;
        }
        while(i<10);{
            System.out.println(sum);
        }

    }
}
