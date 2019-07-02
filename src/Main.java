import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int intArray[] = new int[6];
        boolean matchFound;
        Random randomnumber = new Random();
        int index;
        int loops = 0;
        int count = 100_000_000;
        int mainBallRange = 52;
        int numbersToPick = 6; //Not including Power Ball/Mega Ball//
        int powerBallRange=26;
        boolean pickPowerBall = false;


        while (loops <= count) {

            for (index = 0; index <= 5; index++) {
                matchFound = false;
                if (index < numbersToPick) {
                    while (!matchFound) {
                        for (int num1 = 1; num1 <= mainBallRange; num1++) {
                            int num2 = randomnumber.nextInt(mainBallRange  + 1);
                            if (num1 == num2 && IntStream.of(intArray).noneMatch(n -> n == num2)) {
                                matchFound = true;
                                intArray[index] = num2;
                                break;
                            } //else if (num1 == num2) System.out.println("Duplicate: " + num1 + " " + num2);
                        }

                    }
                } else {
                    while (!matchFound && pickPowerBall) {
                        for (int num1 = 1; num1 <= powerBallRange; num1++) {
                            int num2 = randomnumber.
                                    nextInt(powerBallRange +1);
                            if (num1 == num2) {
                                intArray[index] = num2;
                                matchFound = true;
                            }
                        }
                    }
                }

            }
            System.out.println(loops);
            if(loops < count) {
                Arrays.fill(intArray,0);
            }
            loops++;

        }

        System.out.println("Picking your lottery numbers now!!!");
        for(int a=0;a<=5;a++)
            System.out.println(intArray[a]);
    }
}
