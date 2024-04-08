// * * * * * * * * * * * * * * * 
//  * * * * * * * * * * * * * 
//    * * * * * * * * * * * 
//      * * * * * * * * * 
//        * * * * * * * 
//          * * * * * 
//            * * * 
//              * 

public class pattern6 {
   public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=(i+1);k<=9;k++){
                System.out.print("* ");
            }
            for(int l=i;l<=9;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
   } 
}
