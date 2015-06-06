//calculadora, con switch
package nota3;
import java.util.Scanner;


public class Nota3 {

   
    public static void main(String[] args) {
      
        int a; /*declaramos las variables*/
        int b;
        int c;
        double cantidadsubradical;
        double x1;
        double x2;
        double raiz;
      
        
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("bienvenido al calculador de ecuaciones de segundo grado del tipo ax+bx+c"); //entrada estandar
        
        System.out.println("ingrese el valor de a");//salidas estandar
        a = entrada.nextInt();//capturamos el valor de a
        System.out.println("ingrese el valor de b");//salida estandae
        b = entrada.nextInt();//capturamos el valor de b
        System.out.println("ingrese el valor de c");//salida estandar
        c= entrada.nextInt();//capturamos el valor de c
        
        
        cantidadsubradical=(b*b)-(4*a*c);//calculo de la cantidad subradical
      
        if(cantidadsubradical >= 0){
            
           raiz=Math.sqrt(cantidadsubradical);
           
           x1 = (-b+raiz)/(2*a);
           x2 = (-b-raiz)/(2*a);
           
           System.out.println("el resultado de la ecuacion es la siguiente : " + " x1 = "+x1 +"x2 = " +x2);
           
        }   
        
        else{
            System.out.println("la ecuacion no tiene solución");
                    }
                 
    }
    
}


