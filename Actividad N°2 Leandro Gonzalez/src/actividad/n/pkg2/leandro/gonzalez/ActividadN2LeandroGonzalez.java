/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.n.pkg2.leandro.gonzalez;

import java.util.Scanner;

/**
onic
 * @author Alumno
 */
public class ActividadN2LeandroGonzalez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      // 1. Creamos un objeto Scanner para leer lo que escribes en el teclado
        Scanner teclado = new Scanner(System.in);

        // 2. Pedimos los dos números
        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();

        // 3. Estructura if-el3se para comparar
        if (num1 == num2) {
            System.out.println("Los números " + num1 + " y " + num2 + " son IGUALES.");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " son DIFERENTES.");
        }

        // Cerramos el scannerj
        teclado.close();
    }

}

    

    


   

