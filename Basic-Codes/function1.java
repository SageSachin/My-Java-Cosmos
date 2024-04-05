import java.io.Console;
public class function1 {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Console x = System.console();
        int n = Integer.parseInt(x.readLine("Enter 1st number: "));
        int n2 = Integer.parseInt(x.readLine("Enter 2nd number: "));
        System.out.println("Sum of given numbers is: "+(n+n2));
    }
}
