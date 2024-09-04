import java.util.*;
public class FrequencyOfEachElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean[] visited=new boolean[size];
        for(int i=0;i<a.length;i++){
            if(!visited[i])
            {
                int count=0;
            
            for(int j=0;j<a.length;j++)
            {

                if(a[i]==a[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(a[i]+"frequency is"+count);
            
        }
        }

    }
    
}
