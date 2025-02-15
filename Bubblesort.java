
public class Bubblesort {
    public static void main(String[] args)
    {
        int arr[]={7,9,3,1,4};
        int n= arr.length;
        //bubble sort
         // time complexitiy=O(n^2)
         
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                

            }
        }
        for(int i=0;i<n;i++)
    {
        System.out.println( arr[i]);
    }

    }
    
}
