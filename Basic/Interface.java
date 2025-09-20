

public class Interface {
    interface animal
    {
        void sound();
    }
    public static class dog implements animal{
        public void sound()
        {
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        animal g=new dog();
        g.sound();
    }
}
