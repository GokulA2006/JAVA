public class nestedif{
    public static void main(String[] args) {

        boolean kfc = true;
        boolean chicken = true;
         boolean pepsi = false;
        if(kfc){

        System.out.println("enter the kfc");
       

        if(chicken)
        {
            System.out.println("eating chicken");

            if(pepsi)
            {   
                 System.out.println("drinking pepsi");
            }
        }
        }
    }
}