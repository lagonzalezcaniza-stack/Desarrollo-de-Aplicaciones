/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.n.pkg3.leandro.gonzalez;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class ActividadN3LeandroGonzalez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
     Scanner teclado = new Scanner(System.in);
        System.out.println("cual es tu edad");
        int num1= teclado.nextInt();
        if (num1<=18) {
             System.out.println("Sos mayor de edad");
                     } else{
            System.out.println("no sos mayor de edad");
        }
        teclado.close();
        }
            
    }
    


