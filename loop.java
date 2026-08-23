import java.util.Scanner;
public class loop{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("number1");
        int a = scan.nextInt();
        System.out.println("number2");
        int b = scan.nextInt();
       for( int i=a;i<=b;i=i+1)
    {
        System.out.println(i);
    }  
    }
}