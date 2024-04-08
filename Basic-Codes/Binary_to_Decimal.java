public class Binary_to_Decimal {
    public static void main(String[] args) {
        int num=10101111;
        double a,temp=0,i=0;
        while(num!=0){
            a=num%10;
            temp=temp+(a*Math.pow(2,i));
            num=num/10;
            i++;
        }
        System.out.println(temp);
    }
}
