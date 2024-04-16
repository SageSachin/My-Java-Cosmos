public class linear_search {
    public static int linear_searcher(int key, int x[]) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int x[] = { 2, 3, 5, 6, 8, 9, 1, 4 };
        int key = 9;
        System.out.println(key + " is present on index " + linear_searcher(key, x));
    }
}
