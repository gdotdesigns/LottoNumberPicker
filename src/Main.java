import java.util.Random;

public class Main {




    public static void main(String[] args) {
        int intArray[] = new int[6];
        boolean gotone = false;
        Random randnumber = new Random();
        int index;


    for(index = 0; index <= 5; index++) {
        gotone = false;

            while (gotone == false){
                for (int num1 = 1; num1 <= 70; num1++){
                    int num2 = randnumber.nextInt(71);
                    System.out.println(num1 + " " + num2);
                    if(num1==num2){
                        System.out.println("SUCCESS!!!!!!!!!!!!!!!!");
                        gotone = true;
                        intArray[index] = num2;
                    }
                }

            }

        }
        System.out.println("Picking your lottery numbers now!!!");
        for(int a=0;a<=5;a++)
            System.out.println(intArray[a]);

    }
}
