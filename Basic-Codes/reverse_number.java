public class reverse_number {
    public static void main(String[] args) {
        int a = 1234;
        int n, rev = 0, num = a;
        while (num != 0) {
            n = num % 10;
            rev = (rev * 10) + n;
            num = num / 10;
        }
        System.out.println("Reverse of given number is: " + rev);
    }
}
