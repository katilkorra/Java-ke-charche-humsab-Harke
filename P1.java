import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        
        int[] arr = new int[args.length];

        if(args.length == 0)  // check if  arguments provided
      {
        System.out.println("Please provide Some array element ");
        return;
      }

        System.out.println("Original Value:");
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
             System.out.print(arr[i]+" ");
        }
         
        System.out.println("\nSorting Value:");
        Arrays.sort(arr);
        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nMinimum Value of arr="+arr[0]);
        System.out.println("Maximum Value of arr="+arr[arr.length-1]);
    }
}