
import java.io.Console;

public class prime {
    public void primeCheck() {
        Console x = System.console();
        int n = Integer.parseInt(x.readLine("Enter any number to check: "));
        int z = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                z++;
            }
        }
        if (z == 2) {
            System.out.println("it is Prime");
        } else {
            System.out.println("it is not Prime");
        }
    }

    public static void main(String[] args) {
        prime ob = new prime();
        ob.primeCheck();
    }
}
