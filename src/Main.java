import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int intArray[] = new int[6];
        boolean gotone;
        Random randnumber = new Random();
        int index;


    for(index = 0; index <= 5; index++) {
        gotone = false;
        if (index < 5) {
            while (gotone == false) {
                for (int num1 = 1; num1 <= 70; num1++) {
                    int num2 = randnumber.nextInt(71);
                    //System.out.println(num1 + " " + num2);
                    if (num1 == num2 && IntStream.of(intArray).noneMatch(n -> n == num2)) {
                        System.out.println("SUCCESS!!!!!!!!!!!!!!!!");
                        System.out.println(num1 + " " + num2);
                        gotone = true;
                        intArray[index] = num2;
                        break;
                }else if (num1 == num2) System.out.println("Duplicate: " + num1 + " " + num2);
            }

        }
    }

        }
        System.out.println("Picking your lottery numbers now!!!");
        for(int a=0;a<=5;a++)
            System.out.println(intArray[a]);

    }
}
