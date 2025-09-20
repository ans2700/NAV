package Strings.Basic;

public class ArrayToString {
    public static void main(String[] args) {
        String a[]={"a","b","c"};
        String s="";
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
        }
        System.out.println("Array To String:"+s);
    }
}
