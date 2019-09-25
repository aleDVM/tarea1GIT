package calculado;

import java.util.Scanner;


public class Calculado {

    public static void main(String[] args) { 
        int opcion;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Menu");
            System.out.println("Ingrese un numero");
            int a = scan.nextInt();
            System.out.println("Ingrese otro numero");
            int b = scan.nextInt();
            System.out.println("Ingrese su opcion");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: salir");
            opcion = scan.nextInt();
            switch(opcion){
                case 1: 
                    System.out.println(Operaciones.Sumar(a, b));
                    break;
                case 2:
                    System.out.println(Operaciones.Restar(a, b));
                    break;
                case 3:
                    System.out.println(Operaciones.Multiplicar(a, b));
                    break;
                case 4: 
                    System.out.println(Operaciones.Dividir(a, b));
                    break;
                default:
                    break;
            }
        }while(opcion < 0 || opcion > 5);
    }
    
}
