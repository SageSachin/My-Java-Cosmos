// added java code to reverse string
import java.io.Console;
public class reverse_string {
    public static void main(String []args){
        Console c=System.console();
        String str=c.readLine("Enter your String to reverse: ");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
