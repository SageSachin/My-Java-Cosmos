import java.io.Console;
public class Decimal_to_Binary {
    public static void main(String[] args) {
        Console x=System.console();
        int num=Integer.parseInt(x.readLine("Enter any decimal number: "));
        int a;
        int temp=0,power=0;
        while(num!=0){
            a=num%2;
            temp=temp+(a*(int)Math.pow(10,power));
            power++;
            num=num/2;
        }
        System.out.println(temp);
    }
}
