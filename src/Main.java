import java.util.Random;

public class Main {




    public static void main(String[] args) {
        System.out.println("Picking your lottery numbers now!!!");
        int intArray[] = new int[6];
        boolean gotone = false;
        Random randnumber = new Random();
        int index;


    for(index = 0; index <= 5; index++) {

            while (gotone == false){
                for (int num1 = 1; num1 <= 70; num1++){
                    int num2 = randnumber.nextInt(71);
                    if(num1==num2){
                        gotone = true;
                        intArray[index] = num2;
                    }
                }

            }

        }

        for(int a=0;a<=5;a++)
            System.out.println(intArray[a]);

    }
}
