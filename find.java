import java.util.Scanner;
public class find{

   int evenorodd(int num)
    {
      if(num%2==0)
      {
      System.out.println("even number");
      }
      else{
        System.out.println("odd number");
      }
      return 0;
    }
    public static void main(String[] args) 
    {
         Scanner scan = new Scanner(System.in);
        int number =scan.nextInt();
        find obj1 = new find();
        obj1.evenorodd(number);
    }
    
    }