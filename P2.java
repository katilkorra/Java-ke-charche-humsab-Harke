import java.util.Arrays;
public class P2{  
    public static void main(String args[])
    {
      if(args.length == 0)  // check if 5 arguments provided
      {
        System.out.println("Please provide Some array elements as string ");
        return;
      }
      // print Parameters as input 
      for(int i=0 ; i<args.length; i++)
      {
        System.out.print(args[i] + " ");
      }
      
      // use arrays method to find sorted array  
     System.out.println("\n----The sorted array is----");
      Arrays.sort(args); // find sort
      for(int i=0 ; i<args.length; i++)
      {
        System.out.print(args[i] + " ");
      }

      System.out.println("\nMinimumue :" + args[0]);
      System.out.println("Maximum value :" + args[args.length -1]);

    }
}