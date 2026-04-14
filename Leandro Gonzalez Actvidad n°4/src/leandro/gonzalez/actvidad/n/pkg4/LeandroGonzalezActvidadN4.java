/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leandro.gonzalez.actvidad.n.pkg4;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class LeandroGonzalezActvidadN4 {

    /**
     * @param args the command line arguments
     */
    /*Primer Ejercicios 1a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 1;
        while(n<=100){
            System.out.println(n);
            n++;
        }
              
                
    }
    
}
*/
    /*Primer Ejercicio 1b
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   for(int b = 1;b<=100;b++){
    System.out.println(b);
   }
    }
}
   */
    /*Primer Ejercicio 1c
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b = 1;
    do{
        System.out.println(b);
        b++;
    }while (b <=100);
        
    }
            
    }
      */  
    /*Segundo Ejercicio 2a
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int N = teclado.nextInt();
    int N1= 1;
        while(N1 <= N){
            System.out.println(N1);
            N1++;
        }
     }
        }
    */
    /*2b
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int N = teclado.nextInt();
    int N1= 1;
        do{
            System.out.println(N);
            N1++;
        } while (N1<= N);     
     }
     }
     */
  /*2c
 public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     int N = teclado.nextInt();
     for(int N1 = 1; N1<=N; N1++){
      System.out.println(N);
   }
    }
}
*/
   /*Tercer Ejericicio 3a
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     int N = teclado.nextInt();
     for(int N1 = 1; N1<=N; N--){
      System.out.println(N);
   }
    }
}
*/
    /*3b
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     int N1 = teclado.nextInt();
     int N= 1;
        while(N1 >= N){
            System.out.println(N1);
            N1--;
        }
     }
        }
    */
    /*3c
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int N = teclado.nextInt();
    int N1= 1;
        do{
            System.out.println(N);
            N--;
        } while (N1<= N);     
     }
     }
     */
    
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1;
    int num2;
        do{
    System.out.println("Ingrese el primer numero:");
     num1 = teclado.nextInt();
    System.out.println("Ingrese el segundo numero:");
     num2 = teclado.nextInt();
    if (num1 == num2){
        System.out.println("Porfavor ingrese otra vez ambos numeros deben ser distintos");  
    }
 } while (num1==num2);
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        for (int a  =min ;a  <=max ; a++) {
            System.out.println(a);
        }
    }
}
             
               
