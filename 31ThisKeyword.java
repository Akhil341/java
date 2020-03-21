public class MyClass 
{
  int x;
  public MyClass(int x)
 {
    this.x = x;
  }
  public static void main(String[] args)
 {
    MyClass myObj = new MyClass(5);
    System.out.println("Value of x = " + myObj.x);
  }
}