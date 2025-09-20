package Strings;
public class AlphabeticOrder {
    public static void main(String[] args) {
        
    String fruits[]={"apple","mango","mangoa","banana"};
    String largest=fruits[0];
    String secondlargest="";
    for(int i=1;i<fruits.length;i++)
    {
        if(largest.compareTo(fruits[i])<0)
        {
            secondlargest=largest;
            largest=fruits[i];
        }
        else if((largest.compareTo(fruits[i])<0)&&secondlargest.compareTo(fruits[i])>0)
        {

            secondlargest=fruits[i];
        }
    }
    System.out.println(largest);
    System.out.println(secondlargest);
}
}
