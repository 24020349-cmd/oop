import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args){
        int a = 1;
        int b = 7;
        Random r = new Random();
        int firstRoll = r.nextInt(b-a) + a;
        int secondRoll = r.nextInt(b-a) + a;
        int result = firstRoll + secondRoll;
        System.out.println(result);
    }
}
