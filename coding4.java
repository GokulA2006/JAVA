import java.util.Scanner;
public class coding4{
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];

        for (int i=0;i<=size-1;i=i+1)
        {
            marks[i] = scan.nextInt();
    }
    int middle = size/2;
    System.out.println(marks[middle]);
}
}