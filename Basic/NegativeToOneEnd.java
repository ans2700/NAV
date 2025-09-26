package Basic;

public class NegativeToOneEnd {
    public static void main(String[] args) {
      int arr[]={-12,11,-13,5};
      int j=0;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]<0)
        {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          j++;
        } 
      }
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
  }
}