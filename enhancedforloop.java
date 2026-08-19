//enchanced for loop
//for each loop

public class enhancedforloop {


    public static void main(String[] args) {
        int num[] = {12,23,34,45};
        String[] dum ={"one","two"};
        /*for (int i=0;i<4;i++)
        {
            System.out.println(num[i]);
        }*/

        for(int var:num)
        {
        System.out.println(var);
        }
         for(String var:dum)
        {
        System.out.println(var);
        }
    }

}