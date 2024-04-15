public class reverse_array {
    public static void main(String[] args) {
        int arr[]={2,3,1,9,8,7};
        int first=0, last=arr.length-1,temp;
        while(first<last){
            temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
