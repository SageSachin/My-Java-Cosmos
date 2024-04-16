public class MAX {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int arr[] = { 2, 4, 3, 1, 5, 10, 6 };
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number in the array is: " + smallest);
    }
}
