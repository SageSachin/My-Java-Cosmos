// example code to explain call by value in java which is mostly used

public class call_by_value {
    public static int calc(int a){
        a=10;
        return a;
    }
    
    public static void main(String[] args) {
        int a=5;
        int z=calc(a);
        System.out.println(z);
    }
}
