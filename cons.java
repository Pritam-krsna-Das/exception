import java.util.Random;
public class td {
    public static void main(String[] args )
    {
        int a=0,b=0,c=0;
        Random r=new Random();

        for(int i=0;i<10;i++){
            try {
                b=r.nextInt();
                c=r.nextInt();
                a = 12345 / (b/c);
            }catch (ArithmeticException e)
            {
                System.out.println("Exception"+e);
                a=0;
            }
            System.out.println(" value of a is  -> "+a);
        }
    }
}
main method
    public static void main(String args[])
    {
        new cons();
    }
}    
