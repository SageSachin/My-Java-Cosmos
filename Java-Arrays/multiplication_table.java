import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.print("Enter any value: ");
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Output:");
        for(int i=0;i<9;i++){
            System.out.println(arr[i]*arr[i]);
        }
    }
}
