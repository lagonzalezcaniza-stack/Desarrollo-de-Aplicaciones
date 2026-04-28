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
            System.out.println(N1);
            N1++;
        } while (N1<= N);     
     }
     }
     */
  /*
 public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     int N = teclado.nextInt();
     for(int N1 = 1; N1<=N; N1++){
      System.out.println(N1);
   }
    }
}*/

   /*Tercer Ejericicio 3a
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     int N = teclado.nextInt();
     for(int N1 = 1; N1<=N; N--){
      System.out.println(N);
   }
    }
}

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
    /*Cuarto Ejercicio 4a 
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
  */
    
  /*4b
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2;

    System.out.println("Ingrese el primer numero:");
    num1 = teclado.nextInt();

    System.out.println("Ingrese el segundo numero:");
    num2 = teclado.nextInt();

    while(num1 == num2){
        System.out.println("Porfavor ingrese otra vez ambos numeros deben ser distintos");

        System.out.println("Ingrese el primer numero:");
        num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero:");
        num2 = teclado.nextInt();
    }

    int min = Math.min(num1, num2);
    int max = Math.max(num1, num2);

    int i = min;
    while(i <= max){
        System.out.println(i);
        i++;
    }
}
}             
*/
    /* 4c
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2;

    do{
        System.out.println("Ingrese el primer numero:");
        num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero:");
        num2 = teclado.nextInt();

        if(num1 == num2){
            System.out.println("Porfavor ingrese otra vez ambos numeros deben ser distintos");
        }

    } while(num1 == num2);

    int min = Math.min(num1, num2);
    int max = Math.max(num1, num2);

    int i = min;
    do{
        System.out.println(i);
        i++;
    }while(i <= max);
}
}
*/
    /*Quinto Ejercicio 5a
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int A, B;

    System.out.println("Ingrese A:");
    A = teclado.nextInt();

    System.out.println("Ingrese B:");
    B = teclado.nextInt();

    while(A >= B){
        System.out.println("A debe ser menor que B");

        System.out.println("Ingrese A:");
        A = teclado.nextInt();

        System.out.println("Ingrese B:");
        B = teclado.nextInt();
    }

    int i = A;
    while(i <= B){
        if(i % 2 == 0){
            System.out.println(i);
        }
        i++;
    }
}
}
*/
    /*5b
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int A, B;

    do{
        System.out.println("Ingrese A:");
        A = teclado.nextInt();

        System.out.println("Ingrese B:");
        B = teclado.nextInt();

        if(A >= B){
            System.out.println("A debe ser menor que B");
        }

    }while(A >= B);

    int i = A;
    do{
        if(i % 2 == 0){
            System.out.println(i);
        }
        i++;
    }while(i <= B);
}
}
*/
    /* 5c
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int A, B;

    do{
        System.out.println("Ingrese A:");
        A = teclado.nextInt();

        System.out.println("Ingrese B:");
        B = teclado.nextInt();

        if(A >= B){
            System.out.println("A debe ser menor que B");
        }

    }while(A >= B);

    for(int i = A; i <= B; i++){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }
}
}
*/
    /*Sexto Ejercicio 6a
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int N, M;

    System.out.println("Ingrese N:");
    N = teclado.nextInt();

    System.out.println("Ingrese M:");
    M = teclado.nextInt();

    while(N <= 0 || M <= 0 || N >= M){
        System.out.println("Valores incorrectos");

        System.out.println("Ingrese N:");
        N = teclado.nextInt();

        System.out.println("Ingrese M:");
        M = teclado.nextInt();
    }

    int i = 1;
    while(i <= M){
        if(i % N == 0){
            System.out.println(i);
        }
        i++;
    }
}
}
*/
    /*6b
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int N, M;

    do{
        System.out.println("Ingrese N:");
        N = teclado.nextInt();

        System.out.println("Ingrese M:");
        M = teclado.nextInt();

        if(N <= 0 || M <= 0 || N >= M){
            System.out.println("Valores incorrectos");
        }

    }while(N <= 0 || M <= 0 || N >= M);

    int i = 1;
    do{
        if(i % N == 0){
            System.out.println(i);
        }
        i++;
    }while(i <= M);
}
}
*/
   /*6c
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int N, M;

    do{
        System.out.println("Ingrese N:");
        N = teclado.nextInt();

        System.out.println("Ingrese M:");
        M = teclado.nextInt();

        if(N <= 0 || M <= 0 || N >= M){
            System.out.println("Valores incorrectos");
        }

    }while(N <= 0 || M <= 0 || N >= M);

    for(int i = 1; i <= M; i++){
        if(i % N == 0){
            System.out.println(i);
        }
    }
}
} 
*/
    /*Septimo Ejercicio 7a
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double millas;

    System.out.println("Ingrese millas (0 para salir):");
    millas = teclado.nextDouble();

    while(millas != 0){
        double km = millas * 1.6093;
        System.out.printf("Kilometros: %.2f\n", km);

        System.out.println("Ingrese millas (0 para salir):");
        millas = teclado.nextDouble();
    }
}
}
*/
    /*7b
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double millas;

    do{
        System.out.println("Ingrese millas (0 para salir):");
        millas = teclado.nextDouble();

        if(millas != 0){
            double km = millas * 1.6093;
            System.out.printf("Kilometros: %.2f\n", km);
        }

    }while(millas != 0);
}
}
*/
/*7c
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    for(double millas = teclado.nextDouble(); millas != 0; millas = teclado.nextDouble()){
        double km = millas * 1.6093;
        System.out.printf("Kilometros: %.2f\n", km);
    }
}
}
*/