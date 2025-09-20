package Numbers;

public class CompareNum {
    public static void main(String args[])
    {
        int arr[]={5,3,1,8,2,6};
        int largest,secondlargest;
        largest=arr[0];
        secondlargest=0;
        int thirdlargest=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondlargest = largest;
                thirdlargest=largest;
                largest=arr[i];
                System.out.println("largest:"+largest);
            }
            else if (arr[i]>secondlargest&&arr[i]<largest) 
            {
                
                secondlargest = arr[i];
                System.out.println("secondlargest:"+secondlargest);
            } 
            else if (arr[i]>thirdlargest&&arr[i]<secondlargest) 
            {
                
                secondlargest = arr[i];
                System.out.println("secondlargest:"+secondlargest);
            }       
        }        
        System.out.println("Final Largest: " + largest);
        System.out.println("Final Second Largest: " + secondlargest);
        System.out.println("Final Third Largest: " + thirdlargest);
    }
}
