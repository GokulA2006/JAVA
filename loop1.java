public class loop1{
    public static void main(String args[]) {
        int evencount = 0;
       for( int i=1;i<=100;i=i+1)
    {
        if(i%2==0)
        {
            evencount = evencount+1;
        //System.out.println("even number is:" + i);
     }
     else{
        
        //oddcount = oddcount+1;
        //System.out.println("odd number is:" + i);
        //System.out.println(oddcount);
     }  
    }
    System.out.println(evencount);
    }
}