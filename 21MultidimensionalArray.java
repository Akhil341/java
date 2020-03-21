class MultidimArray 
{
   public static void main(String[] args) 
  {

      int[][] a = {{31, 22, 13},{45, 35, 69, 19}, {70}};
      
     for (int i = 0; i < a.length; ++i)
     {
        for(int j = 0; j < a[i].length; ++j) 
         {
           System.out.println(a[i][j]);
        }
     }
   }
}