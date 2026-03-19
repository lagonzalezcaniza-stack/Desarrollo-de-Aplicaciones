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
    
    public static void main(String[] args) {
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
    


