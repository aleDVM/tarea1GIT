
package calculado;

public class Operaciones {
   public static int Sumar(int a, int b){
        return a + b;
   } 
   
   public static int Restar(int a, int b){
       return a - b;
   }
   
   public static int Multiplicar(int a, int b){
       return a * b;
   }
   
   public static float Dividir(int a, int b){
       if(b != 0){
           return a / b;
       }
       return 0;
   }
}
