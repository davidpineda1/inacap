

/**
 
 Integrantes:
 * David Pineda
 * Fransisco Gonzales
 * Leonardo Acuña
 * Cristobal Ladron De Guevara
 
 
Realice una aplicación que permita calcular los resultados de una ecuación
cuadrática del tipo ax2 + bx +c,los números deben ser enteros, pero el resultado puede tener valores decimales, debe entregar 
el resultado de x1 y x2, si la ecuación no tiene solución debe entregar un mensaje diciendo, que no tiene solucion. 
Tambien debe calcular si un numero es primo o no.
El usuario debe escojer si quiere calcular una ecuacion cuadrática o saber si un numero es primo o no.
El usuario debe ingresar su nombre y luego mostrarlo por pantalla dándole una bienvenida.
        */
package nota3;
import java.util.Scanner;


public class Nota3 {

   
    public static void main(String[] args) {
        
        int numero;
        String nombre; //declaramos una variable de tipo caracter, para guardar el nombre de l apersona que va a utilizar esta aplicacion
        
      
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("ingrese su nombre");
        nombre = entrada.nextLine();
        
        System.out.println("HOLA " +nombre);
                
        System.out.println("ingrese numero 1 para calcular una ecuación de segundo grado del tipo ax2+bx+c");
        System.out.println("ingrese numero 2 para saber si un numero es primo");
        numero=entrada.nextInt();
        
        
        
        
        
        
        switch(numero){// empisa el switch
                  
            
         case 1: // caso 1 del primer porgrama, clacula la ecuacion cuadrática
     
             //declaramos los identificadores que vamos a utilizar
        int a; //declaramos a de tipo entero
        int b;//declaramos b de tipo entero
        int c; //declaramos c de tipo entero
        double cantidadsubradical; //declaramos "cantidadsubradical" que es detipo decimal
        double x1;//declaramos x1 de tipo double decimal
        double x2;//declramos x2 de tipo double decimal
        double raiz; // declaramos raiz q es d etipo double, en donde vamos a guiardar la raiz
      
        
       
       
        System.out.println("bienvenido al calculador de ecuaciones de segundo grado del tipo ax2+bx+c"); //entrada estandar
        
        System.out.println("ingrese el valor de a");//salidas estandar
        a = entrada.nextInt();//capturamos el valor de a
        System.out.println("ingrese el valor de b");//salida estandae
        b = entrada.nextInt();//capturamos el valor de b
        System.out.println("ingrese el valor de c");//salida estandar
        c= entrada.nextInt();//capturamos el valor de c
        
        
        cantidadsubradical=(b*b)-(4*a*c);//calculo de la cantidad subradical
      
        if(cantidadsubradical >= 0){// si la cantidadsubradical es >=0 se pude calcular, o si no, no s epuede calcular, es un numero imaginario
            
           raiz=Math.sqrt(cantidadsubradical);// es lafuncion para calcular una raiz
           
           x1 = (-b+raiz)/(2*a);// calculos matemáticos
           x2 = (-b-raiz)/(2*a);
           
           System.out.println("el resultado de la ecuacion es la siguiente : " + " x1 = "+x1 +"  x2 = " +x2); //salida estandar donde mostramos el resultado del identificador x1 y x2
           
        }   
        
        else{
            System.out.println("la ecuacion no tiene solución");// salida estandar
                    }
           
                  break;// fin del caso 1
                      
                  case 2: //inicio del caso 2 , calculo para saber si un numero es primo
                      
                      int contador = 0;
                      System.out.println("ingrese un número para saber si es primo");
                      int primo = entrada.nextInt();
                      
                      for(int i=1;i<(primo+1);i++){  // recorre el número desde el uno hasta el numero mas uno
                      if(primo%i==0){  //utilizamos el mod , si el resultado es distinto a cero, el contador aumenta en uno
                      contador = contador + 1;  
                      }  
                      }  
                      if(contador!=2){  
                      System.out.println("el numero no es Primo");  // si el contador es distinto a 2 el numero es primo
                      }
                      else{  //o si no es primo
                System.out.println("el numero si es Primo");  //salida estandar
       
                      }  
         
                      
                      break;// fin del caso 2
                      
                      default: System.out.println("número inválido");// mensaje de error si es que ingresa otro numero
    
}


}}