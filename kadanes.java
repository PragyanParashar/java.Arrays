
public class kadanes{
    public static void main(String[] args) {
        
        int[] a = {4,6,-2,7,4,-6};
        System.out.println("the sum of subarray is " + sum(a));
    }

        static int sum (int[] a )
         {
            int max = Integer.MIN_VALUE;
            int curr = 0 ;

            for (int i=0 ; i<a.length; i++){
                curr = curr + a[i];
                if (curr > max){
                    max = curr;
                }
                if (curr < 0 ){
                    curr = 0;
                }
            }
            return max ;
        

       
    


    }
}
