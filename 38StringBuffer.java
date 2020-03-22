import java.io.*; 
class Akhil
{ 
    public static void main(String[] args) 
    { 
        StringBuffer s = new StringBuffer("GaneshAkhil"); 
        int p = s.length(); 
        int q = s.capacity(); 
        System.out.println("Length of string GaneshAkhil=" + p); 
        System.out.println("Capacity of string GaneshAkhil=" + q); 
    } 
} 