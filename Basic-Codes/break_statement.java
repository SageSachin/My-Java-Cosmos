import java.io.Console;
public class break_statement {
    public static void main(String[] args) {
        Console x=System.console();
        do{
            int n=Integer.parseInt(x.readLine("Enter any number: "));
            if(n%10==0){
                System.out.println("out from loop..");
                break;
            }
            System.out.println(n);
        }
        while(true);
    }
}
