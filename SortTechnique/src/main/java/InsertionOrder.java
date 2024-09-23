public class InsertionOrder {
    public static void main(String args[])
    {
        int arr[] = {12,34,56,78,23,23};
        for(int i=0;i<=arr.length-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp= arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
