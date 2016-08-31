/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Camilo
 */
public class Ejercicios {
    
    public static double Subtotal(double Precio, int Cantidad){
        return Precio * Cantidad;
    };
    
    public static int cnt(int cn, int cnt){
        return cnt += cn;
    };
    
    public static double subn(int cn, double subn, double Precio){
        return subn += Subtotal(Precio, cn);
    };
    
    public static double total(double sub1, double  sub2, double sub3, double sub4, double sub5){
        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        return total;
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        
        System.out.println("ISBN        "+" Titulo                     "+" Precio    ");
        System.out.println("123-876-653 "+" Algoritmica y Programacion "+" $57.000,00");
        System.out.println("345-980-343 "+" Programacion en Java       "+" $75.000,00");
        System.out.println("908-654-873 "+" El Lenguaje UML            "+" $43.500,00");
        System.out.println("243-865-443 "+" Usando JUnit               "+" $63.092,00");
        System.out.println("877-765-343 "+" Programacion en C#         "+" $65.432,00");
        System.out.println();
        System.out.println("¿Que libro desea comprar?");
        System.out.println();
        System.out.println("1 - Algoritmica y Programacion");
        System.out.println("2 - Programacion en Java");
        System.out.println("3 - El Lenguaje UML");
        System.out.println("4 - Usando JUnit");
        System.out.println("5 - Programacion en C#");
        System.out.println("0 - Ninguno");
        System.out.println();
        
        int libro;
        int c1 = 0;
        int c1t = 0;
        double sub1 = 0;
        int c2 = 0;
        int c2t = 0;
        double sub2 = 0;
        int c3 = 0;
        int c3t = 0;
        double sub3 = 0;
        int c4 = 0;
        int c4t = 0;
        double sub4 = 0;
        int c5 = 0;
        int c5t = 0;
        double sub5 = 0;
        double total;
        int a;
        do { System.out.print("Ingrese el número del libro: ");
             libro = lectura.nextInt();
             switch (libro){
                 case 1:
                     System.out.print("Ingrese la cantidad de ejemplares que desea: ");
                     c1 = lectura.nextInt();
                     c1t = cnt(c1, c1t);
                     sub1 = subn(c1, sub1, 57000.00);
                     System.out.println("Subtotal: $"+sub1);
                 break;
                 case 2:
                     System.out.print("Ingrese la cantidad de ejemplares que desea: ");
                     c2 = lectura.nextInt();
                     c2t = cnt(c2, c2t);
                     sub2 = subn(c2, sub2, 75000.00);
                     System.out.println("Subtotal: $"+sub2);
                 break;
                 case 3:
                     System.out.print("Ingrese la cantidad de ejemplares que desea: ");
                     c3 = lectura.nextInt();
                     c3t = cnt(c3, c3t);
                     sub3 = subn(c3, sub3, 43500.00);
                     System.out.println("Subtotal: $"+sub3);
                 break;
                 case 4:
                     System.out.print("Ingrese la cantidad de ejemplares que desea: ");
                     c4 = lectura.nextInt();
                     c4t = cnt(c4, c4t);
                     sub4 = subn(c4, sub4, 63092.00);
                     System.out.println("Subtotal: $"+sub4);
                 break;
                 case 5:
                     System.out.print("Ingrese la cantidad de ejemplares que desea: ");
                     c5 = lectura.nextInt();
                     c5t = cnt(c5, c5t);
                     sub5 = subn(c5, sub5, 65432.00);
                     System.out.println("Subtotal: $"+sub5);
                 break;
                 case 0:
                 break;
                 default:
                 break;
             };
             System.out.println();
             System.out.println("¿Desea seguir comprando?");
             System.out.println();
             System.out.println("1 - Si");
             System.out.println("2 - No");
             System.out.println();
             a = lectura.nextInt();
             System.out.println();
        } while(a == 1);
         total = total(sub1, sub2, sub3, sub4, sub5);
         System.out.println("Detalle del carrito de compras:");
         System.out.println();
         System.out.println("ISBN        "+" Titulo                     "+" Cantidad "+" Subtotal  ");
         System.out.println("123-876-653 "+" Algoritmica y Programacion  "+c1t+"         $"+sub1);
         System.out.println("345-980-343 "+" Programacion en Java        "+c2t+"         $"+sub2);
         System.out.println("908-654-873 "+" El Lenguaje UML             "+c3t+"         $"+sub3);
         System.out.println("243-865-443 "+" Usando JUnit                "+c4t+"         $"+sub4);
         System.out.println("877-765-343 "+" Programacion en C#          "+c5t+"         $"+sub5);
         System.out.println();
         System.out.println("Total:                                             $"+total);
         
                
    };
    
};