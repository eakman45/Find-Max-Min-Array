import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];

        for(int i=0;i<list.length;i++){
            int x = rand.nextInt(-256,256);
            list[i]=x;
        }
        Arrays.sort(list);
        for(int i : list){
            System.out.print(i+ " ");
        }
        System.out.print("\nEntered number : ");
        int number= input.nextInt();

        for (int i = 0; i<list.length; i++){
            if (number<list[i]){
                System.out.println("The nearest number smaller than the entered number: " + list[i-1]);
                System.out.println("The nearest number bigger than the entered number: " + list[i]);
                break;
            }
        }









    }
}
