
public class LeftRotate {
    public static void main(String args[]){
        int n=3;
        int[] arr={1,2,3,4,5};
        for(int i=1;i<=n;i++){
            int first=arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
