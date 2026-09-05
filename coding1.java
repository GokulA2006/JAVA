import java.util.Scanner;

public class coding1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i=0;i<=4;i=i+1)
        {
           numbers[i] = scan.nextInt(); 
        }
        /*System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);*/

        for(int i=0;i<=4;i=i+1)
        {
            System.out.println(numbers[i]);
        }
    }
}
