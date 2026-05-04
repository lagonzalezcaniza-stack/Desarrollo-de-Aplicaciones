/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.n.pkg5.leandro.gonzalez;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class ActividadN5LeandroGonzalez {



    /**
     * @param args the command line arguments
     
/* 1er Ejercicio
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int pos = 0, neg = 0;
        double sumaPos = 0, sumaNeg = 0;
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt(); 
        }

      
        for (int i = 0; i < 10; i++) {
            if (vector[i] > 0) {
                sumaPos += vector[i];
                pos++;
            } else if (vector[i] < 0) {
                sumaNeg += vector[i];
                neg++;
            }
        }

   
        System.out.println("  RESULTADOS  ");
        
        if (pos > 0) {
            System.out.println("Media de positivos: " + (sumaPos / pos));
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        if (neg > 0) {
            System.out.println("Media de negativos: " + (sumaNeg / neg));
        } else {
            System.out.println("No se introdujeron números negativos.");
        }
    }
}
    */
    /* 2do Ejercicio
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int suma = 0;
         int contador = 0;
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                suma += vector[i];
                contador++;
            }
        }

        double media = (double) suma / contador;

        System.out.println("La media de las posiciones pares es: " + media);
    }
}
*/
/* 3er Ejercicio
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();

        double[] notas = new double[n];

      
        for (int i = 0; i < n; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

     
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }

        double media = suma / n;
        System.out.println("La nota media es: " + media);

        
        System.out.println("Alumnos con nota superior a la media:");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
            }
        }
    }
}
*/
    /*4to Ejercicio
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int[] pares = new int[20];
        int contador = 0; 
        while (contador < 20) {

            System.out.print("Ingresa un número: ");

            int num = teclado.nextInt();

            if (num % 2 == 0) {

                pares[contador] = num;

                contador++;
            }

        }
        System.out.println("números pares ingresados:");
        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);

        }
     }
}
    */
    /* 5to Ejercicio 
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[] vector = new int[10];
     
    int positivos = 0;
    int negativos = 0;
    int ceros = 0;
    
    System.out.println("Ingrese 10 numeros:");
    for (int i = 0; i < vector.length; i++) {
    vector[i] = sc.nextInt();
        }
     for (int i = 0; i < vector.length; i++) {
         if (vector[i] > 0) {
             positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
        System.out.println("Cantidad de positivos: " + positivos);

        System.out.println("Cantidad de negativos: " + negativos);

        System.out.println("Cantidad de ceros: " + ceros);

            }

        }
     }
}
    */
    


        
/* 6to Ejercicio 
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int[] vector;
        vector = new int[10];
        Scanner teclado = new Scanner(System.in);
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;
        System.out.println ("Introduce 10 números enteros:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        } 
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                sumaPositivos += vector[i];
                countPositivos++;
            } else if (vector[i] < 0) {
                sumaNegativos += vector[i];
                countNegativos++;
            }
        }
        
        if (countPositivos > 0) {
            double mediaPositivos = (double) sumaPositivos / countPositivos;
            System.out.println("Media de positivos: " + mediaPositivos);
        } else {
            System.out.println("No hay números positivos.");
        }
        if (countNegativos > 0) {
            double mediaNegativos = (double) sumaNegativos / countNegativos;
            System.out.println("Media de negativos: " + mediaNegativos);
        } else {
            System.out.println("No hay números negativos.");
        }
     }
}
 */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String[] nombres;
        nombres = new String[20];
        double[] sueldos;
        sueldos = new double[20];

        Scanner teclado = new Scanner(System.in);

        double mayorSueldo;
        int indiceMayor = 0;

        
        System.out.println("Empleado 1:");
        System.out.print("Nombre: ");
        nombres[0] =  teclado .nextLine();
        System.out.print("Sueldo: ");
        sueldos[0] =  teclado .nextDouble();

        mayorSueldo = sueldos[0];

         teclado .nextLine();

        
        for (int i = 1; i < 20; i++) {
            System.out.println("Empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            nombres[i] =  teclado .nextLine();

            System.out.print("Sueldo: ");
            sueldos[i] =  teclado .nextDouble();

             teclado .nextLine(); 

            
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                indiceMayor = i;
        
                
        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + nombres[indiceMayor]);
        System.out.println("Sueldo: " + mayorSueldo);
            }
        }
    }
}
 

     
        
       
      
        

      
 

    
    

