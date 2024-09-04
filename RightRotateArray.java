import java.util.*;
public class RightRotateArray {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;

        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
