//method overloading

public class methodoverloading{


    void sum(int a,int b)
    {
        System.out.println(a+b);
    }

    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    void display(int a,int b)
    {
        System.out.println("two");
    }



    public static void main(String[] args) 
    {
        methodoverloading obj = new methodoverloading();
        obj.display(2,5);
        obj.sum(3,6);
        obj.sum(3,6,7);
    }


}