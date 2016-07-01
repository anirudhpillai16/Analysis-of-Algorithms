//Java--> Standard matrix multiplication

import java.util.Scanner;
import java.util.*;
 
class ani
{
   public static void main(String args[])
   {
	   
	   
	  Random pol=new Random();
      int m, q, sum = 0, c, d, k;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the dimension of first matrix=");
      m = in.nextInt();
 
      int first[][] = new int[m][m];
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < m ; d++ )
            first[c][d] = pol.nextInt(9)+1;
 
      System.out.println("Enter the dimension of second matrix=");
      q = in.nextInt();
 
      if ( m != q )
         System.out.println("Enter square matrix only");
      else
      {
		  final long start_time=System.nanoTime();
         int second[][] = new int[q][q];
         int multiply[][] = new int[m][q];
 
         for ( c = 0 ; c < q ; c++ )
            for ( d = 0 ; d < q ; d++ )
               second[c][d] = pol.nextInt(9)+1;
 
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < q ; d++ )
            {   
               for ( k = 0 ; k < q ; k++ )
               {
                  sum = sum + first[c][k]*second[k][d];
               }
 
               multiply[c][d] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Product of entered matrices:-");
 
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < q ; d++ )
               System.out.print(multiply[c][d]+"\t");
 
            System.out.print("\n");
         }
      System.out.println("\n Time in ns \n");
      final long time_taken=System.nanoTime()-start_time;
	   System.out.println(time_taken);
      }
   }
}
