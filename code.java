import java.util.Scanner;
public class code{
public static void main(String args[]){

Scanner scan = new Scanner(System.in);
    int score = scan.nextInt();

    if(score<50){
        System.out.println("you need to improve");
    }
    else if(score>=50 && score<=70)//71<70
    {
        System.out.println("good job!");
    }
    //71>70
    else
    {
        System.out.println("excellent performance!");
    }
}
}
