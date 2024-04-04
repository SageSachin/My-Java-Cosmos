// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
import java.io.Console;
class fibonacci{
    public static void main(String []args){
        Console x=System.console();
        int n=Integer.parseInt(x.readLine("Enter any number: "));
        int a=0, b=1, c=1;
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=0;i<n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+ " ");
        }
    }
}