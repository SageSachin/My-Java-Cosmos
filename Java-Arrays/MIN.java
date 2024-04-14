public class MIN {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int arr[]={2,4,3,7,5,10,6};
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("Largest number in the array is: "+largest);
    }
}
