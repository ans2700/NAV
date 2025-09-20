package Strings;

public class Divisible {
   
        public static boolean div(int n)
        {
            while(n>0)
            {
                n=n-7;
                if(n==0)
                {
                    return true;
                }
            }
            return false;
        }
        public static void main(String args[])
        {
            System.out.println(div(6));
        }
    }

