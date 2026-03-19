/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg3.leandro.gonzalez;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Actividad3LeandroGonzalez {

    /**
     * @param args the command line argument
     */
    
    /**public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.print("Introduja su edad:");
       int num1 = teclado.nextInt();
     if (num1>=18) {
     System.out.println("si sos mayor de edad");
     }else{
     System.out.println("no sos mayor de edad");
        }
       teclado.close();
    }
    }
    */
/**
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String contrasenaGuardada = "contraseña";
        System.out.print("Ingrese la contraseña: ");
        String contrasenaUsuario = sc.nextLine();

        if (contrasenaGuardada.equalsIgnoreCase(contrasenaUsuario)) {
            System.out.println("La contraseña es correcta");
        } else {
            System.out.println("La contraseña es incorrecta");
        }
        */ 
 

/**
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: no se puede dividir por cero");
        } else {
            double resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        }
        */
    
    

/**
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        if (edad > 16 && ingresos >= 1000) {
            System.out.println("Debe tributar");
        } else {
         System.out.println("No debe tributar");
        }
        
     }
     */
    
 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su puntuación: ");
        double puntuacion = sc.nextDouble();

        double dinero = 2400 * puntuacion;
        String nivel;

        if (puntuacion == 0.0) {
            nivel = "Inaceptable";
        } else if (puntuacion == 0.4) {
            nivel = "Aceptable";
        } else if (puntuacion >= 0.6) {
            nivel = "Meritorio";
        } else {
            nivel = "Puntuación no válida";
        }

        System.out.println("Nivel: " + nivel);
        System.out.println("Dinero recibido: " + dinero + "€");
    }
    
    
    
}

    


    
     

