//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
import java.util.Arrays;
import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of the array");
        int n = scan.nextInt();
      

        int arr [] = new int[n];
         //Arrays.sort(arr);
         // int max = arr[n-1];
         // int min = arr[0];

         System.out.println("Enter the element of an array:-");

        
        for ( int i=0 ; i<n; i++ ){
            arr[i] = scan.nextInt();      
          }

           Arrays.sort(arr);

          System.out.println("The max no  is = " + arr[n-1]);
          System.out.println("The min no is =  " + arr[0]  );

          scan.close();
    }
}
