import java.io.Console;

class calculator {
    public static void main(String[] args) {
        Console x = System.console();
        int ask = Integer.parseInt(x.readLine("Enter 1 for Arithmetic OR 2 for Area Calculator: "));

        if (ask == 1) {
            int a = Integer.parseInt(x.readLine("Enter first number: "));
            int b = Integer.parseInt(x.readLine("Enter second number: "));
            char ch = x.readLine("Enter +, -, *, / to continue: ").charAt(0);

            if (ch == '+') {
                System.out.println("Sum is: " + (a + b));
            }
            if (ch == '-') {
                System.out.println("Sum is: " + (a - b));
            }
            if (ch == '*') {
                System.out.println("Sum is: " + (a * b));
            }
            if (ch == '/') {
                System.out.println("Sum is: " + (a / b));
            }

        } else if (ask == 2) {
            int ask2 = Integer.parseInt(x.readLine(
                    "\n1. To find Area of Circle. \n2. To find Area of Rectangle.\n3. To find Area of Square. \nEnter your Choice: "));

            if (ask2 == 1) {
                int rad = Integer.parseInt(x.readLine("Enter radius of circle:"));
                float area_circle = 3.1428f * rad * rad;
                System.out.println("Area of Circle: " + area_circle);
            }
            if (ask2 == 2) {
                int l = Integer.parseInt(x.readLine("Enter length of Rectancle:"));
                int b = Integer.parseInt(x.readLine("Enter breadth of Rectangle:"));
                float area_rect = l * b;
                System.out.println("Area of Rectangle: " + area_rect);
            }
            if (ask2 == 3) {
                int side = Integer.parseInt(x.readLine("Enter side of Square:"));
                float area_sqr = side * side;
                System.out.println("Area of Square: " + area_sqr);
            }
        }

        else {
            System.out.println("Invalid Input");
        }
    }
}