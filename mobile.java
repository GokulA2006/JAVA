public class mobile{
    String name = "";
    String model ="";
    int ram =0;
    int rate =0;


    public static void main(String args[]){
mobile mob1 = new mobile();
mob1.name="vivo";
mob1.model="i4";
mob1.ram=6;
mob1.rate=20000;

mobile mob2 = new mobile();
mob2.name="oppo";
mob2.model="i5";
mob2.ram=5;
mob2.rate=30000;

System.out.println(mob2.rate);

mobile mob3 = new mobile();

System.out.println(mob3.rate);
    } 
}