import java.util.*;

class copyElements {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] newArray=new int[size];
        for(int i=0;i<size;i++){
            newArray[i]=arr[i];
        }
        for(int i=0;i<size;i++){
            System.out.print(newArray[i]+" ");
        }
    }

}