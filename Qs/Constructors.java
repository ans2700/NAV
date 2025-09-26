package Qs;

public class Constructors {
    static class A 
        {
            int var1;
            A()
            {
                System.out.println("A");
            }
            A(int a)
            {
                this.var1=a;
                System.out.println(a);
            }
            A(A b)
            {
                this.var1=b.var1;
                System.out.println(var1);
            }
        }
    public static void main(String[] args) {
        A o=new A();
        A o1=new A(10);
        A o2=new A(o1);
    }
}
