public class pairs_in_array {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 1, 3, 5 };
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + c + "," + arr[j] + ") ");
                num++;
            }
            System.out.println();
        }
        System.out.println("No. of pairs are: " + num);
    }
}
