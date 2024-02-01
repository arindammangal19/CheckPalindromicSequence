
    import java.util.*;

    public class Test
    {
       static public void main(String...arindam)
       {
            int N, sum=0, temp;

           Scanner sc = new Scanner(System.in);
 
               N = sc.nextInt();
      
             temp = N;

             while(N != 0)
             {
                int r = N % 10;

                sum = (sum*10) + r;

                  N = N/10;
             }
        
             if(temp == sum)
             {
                System.out.println("Palindrome Number");
             }

             else
             {
                System.out.println("Not Palindrome Number");
             }


       }

    }