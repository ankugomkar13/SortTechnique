public class SelcetionSort {
    public static void main(String args[])
    {
        int[] arr ={12,45,6,7,9,23,5};
        int min= arr[0];
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                if(arr[j]<min)
                {
                    min = arr[j];
                }
            }
        }
        System.out.println(min);
    }
}
