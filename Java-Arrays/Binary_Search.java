public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9 }; // sorted array
        int start = 0, end = arr.length - 1;
        int key = 4;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == arr[mid]) {
                System.out.println("Starting from zero, " + key + " is on index " + mid);
            }

            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
