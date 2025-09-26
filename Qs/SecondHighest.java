package Qs;

public class SecondHighest {
    public static void main(String args[])
    {
        int[] arr={2,3,4,3,5};
        int n=arr.length;
        int largest=0;
        int second=0;
        int third=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                third=second;
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]>second && arr[i]!=largest)
            {
                third=second;
                second=arr[i];
            }
            else if(arr[i] > third && arr[i] != second && arr[i] != largest) {
        third = arr[i];
    }
        }
        System.out.println("Largest:"+largest);
        System.out.println("Second:"+second);
        System.out.println("Third:"+third);
    }
}
