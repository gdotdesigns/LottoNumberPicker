import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int intArray[] = new int[6];
        boolean matchFound;
        Random randomnumber = new Random();
        int index;
        int totalBalls = 45;
        int loops = 0;
        int count = 1000000;


        while (loops <= count) {

            for (index = 0; index <= 5; index++) {
                matchFound = false;
                if (index < 5) {
                    while (!matchFound) {
                        for (int num1 = 1; num1 <= totalBalls; num1++) {
                            int num2 = randomnumber.nextInt(totalBalls + 1);
                            if (num1 == num2 && IntStream.of(intArray).noneMatch(n -> n == num2)) {
                                matchFound = true;
                                intArray[index] = num2;
                                break;
                            } //else if (num1 == num2) System.out.println("Duplicate: " + num1 + " " + num2);
                        }

                    }
                } else {
                    while (!matchFound) {
                        for (int num1 = 1; num1 <= 25; num1++) {
                            int num2 = randomnumber.
                                    nextInt(26);
                            if (num1 == num2) {
                                //intArray[index] = num2;
                                matchFound = true;
                            }
                        }
                    }
                }

            }
            System.out.println(loops);
            if(loops < count - 1) {
                Arrays.fill(intArray,0);
            }
            loops++;

        }

        System.out.println("Picking your lottery numbers now!!!");
        for(int a=0;a<=5;a++)
            System.out.println(intArray[a]);
    }
}
