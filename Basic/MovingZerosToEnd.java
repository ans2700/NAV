package Basic;

public class MovingZerosToEnd {
    public static void main(String[] args) {
      int arr[]={12,0,0,-13,0};
      int j=0;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]!=0)
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