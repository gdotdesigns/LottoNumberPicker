import java.util.Random;

public class Main {




    public static void main(String[] args) {

        int intArray[] = new int[6];
        boolean gotone = false;
        Random randnumber = new Random();
        int index ;


    System.out.println("Picking your lottery numbers now!!!");
    for(index = 0; index <= 5; index++);
        {
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

        System.out.println(intArray);

    }
}
