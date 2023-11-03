import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfPeople = 0;
        System.out.println("Kişi sayısı giriniz :");
        numOfPeople = input.nextInt();
        String[] names = new String[numOfPeople];
        String EmptyOne = input.nextLine();
        int[] arr  = new int[numOfPeople];
        String[] team1 = new String[numOfPeople /2];
        String[] team2 = new String[numOfPeople /2];

        for (int i = 0; i < numOfPeople; i++)
        {
            System.out.println((i+1) + " numaralı kişinin adını giriniz :");
            names[i] = input.nextLine();
        }
        for (int i = 0; i<numOfPeople; i++){
            if (i < (numOfPeople/2))
            {
                arr[i] = 1;
            }
            else {
                arr[i] = 2;
            }
        }
        shuffleArray(arr);

        for (int i =0 ; i<numOfPeople ; i++)
        {
            if (arr[i] == 1){
                System.out.print(names[i] + " : ");
                System.out.print(arr[i] + "\n");
            }
        }
        for (int i =0 ; i<numOfPeople ; i++)
        {
            if (arr[i] == 2){
                System.out.print(names[i] + " : ");
                System.out.print(arr[i] + "\n");
            }
        }
    }
    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
