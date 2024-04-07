// Binomial Coefficient = (n!)/(k!( n-k)!)

import java.io.Console;
public class Binomial_coefficient {
    public static int coeff(int x)
    {
        int n=1;
        for(int i=1;i<=x;i++){
            n=n*i;
        }
        return n;
    }
    
    public static void main(String[] args) {
        Console x=System.console();
        int n=Integer.parseInt(x.readLine("Enter value of n: "));
        int k=Integer.parseInt(x.readLine("Enter value of k: "));
        int n1=(coeff(k)*(coeff(n-k)));
        double n2=coeff(n)/n1;
        System.out.println("Binomial Coefficient for value "+n+" and "+k+" is: "+n2);
    }
}
