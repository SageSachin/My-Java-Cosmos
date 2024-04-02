// code to print sum
import java.io.Console;
public class sum {  
    public static void main(String []args){
        Console c=System.console();
        int n1=Integer.parseInt(c.readLine("Enter first number: "));
        int n2=Integer.parseInt(c.readLine("Enter second number: "));
        int sum=n1+n2;
        System.out.println("Sum is: "+sum);
    }
}
