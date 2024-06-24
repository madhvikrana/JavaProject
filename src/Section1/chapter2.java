package Section1;
import java.util.*;

public class chapter2

//keyboard

{
    public static void main(String[] args) 
    {
        //program for adding two numbers
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 2 numbers");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("sum is" + c);

    }
}