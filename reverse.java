//Reverse an Array
public class reverse {
    public static void main(String[] args) {
        
        int[] rev = { 2,4,5,6,8 };

        int n = rev.length;

        for ( int  i=n-1; i>=0; i-- ){
            System.out.print(rev[i]+ " ");
            
        }
    }
}
