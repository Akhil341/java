public class StaticVar
  {

    static int MAX = 10; 
    int min = 5; 
   public static void main(String[] args)
    {
        CustomStaticVariable csv = new StaticVar();
        System.out.println("min+1 = " + (csv.min + 1));
        System.out.println("MAX+1 = " + (MAX + 1));
    }
}