package Math;

public class Math {
    public static int calc(int a, int b){
        return a + b;
    }
    public static float calc(int a, float b){
        return a + b;
    }

   public static void main(String[] args){
       System.out.println(Math.calc(2,3));
       System.out.println(Math.calc(1, 1.2f));
   }
}
