public class SwapNumbers
    {

    public static void main(String[] args) {
     int first = 45, second = 12;

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}