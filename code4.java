import java.util.Scanner;
public class code4{
public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the salary");
    int salary = scan.nextInt();
    System.out.println("enter the age");
    int age = scan.nextInt();
    
    {
        if(salary>=20000 || age>25)
        {
            System.out.println("eligible for loan");
            System.out.println("enter the loan amount");
            int loan = scan.nextInt();
            
            if(loan<=50000)
            {
                System.out.println("you are eligible for loan");
            }
            else{
                System.out.println("not eligible");
            }
        }
        else{
            System.out.println("no loan");
        }
    }
}
}