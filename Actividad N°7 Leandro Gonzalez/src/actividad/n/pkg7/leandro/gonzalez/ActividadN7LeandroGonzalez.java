/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.n.pkg7.leandro.gonzalez;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class ActividadN7LeandroGonzalez {

    /**
     * @param args the command line arguments
     */
    /**Primer Ejercicio
     1a
    public static void main(String[] args) {
    
        int[][] matriz = new int[2][2];
       
        matriz[0][0] = 4;
        matriz[0][1] = 5;
        matriz[1][0] = 3;
        matriz[1][1] = 2;
        
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(); 
        }
    }
}
 */
/**Segundo Ejercicio
     2a
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
        matriz[0][0] = 1; matriz[0][1] = 5; matriz[0][2] = 4;
        matriz[1][0] = 2; matriz[1][1] = 4; matriz[1][2] = 5;
        matriz[2][0] = 1; matriz[2][1] = 2; matriz[2][2] = 3;
        
      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
*/

/**Tercer Ejercicio
     3a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de la matriz cuadrada : ");
        int n = scanner.nextInt();
        
 
        int[][] matriz = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
      
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
*/
  
/**Cuarto Ejercicio
     4a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
       
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
      
        System.out.println("Resultado de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
*/
    
/**Quinto Ejercicio
     5a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de registros en filas : ");
        int filas = scanner.nextInt();
        scanner.nextLine(); 
        
        String[][] matriz = new String[filas][2];
        
        for (int i = 0; i < filas; i++) {
            System.out.print("Ingrese el nombre para la fila " + (i + 1) + ": ");
            matriz[i][0] = scanner.nextLine();
            
            System.out.print("Ingrese el número para la fila " + (i + 1) + ": ");
            matriz[i][1] = scanner.nextLine();
        }
        
        System.out.println("\nNombre\t\tNúmero");
        for (int i = 0; i < filas; i++) {
            System.out.println(matriz[i][0] + "\t\t" + matriz[i][1]);
        }
    }
}
*/
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matriz = new String[3][3];
        
        matriz[0][0] = "Nicolas";
        matriz[0][2] = "Leandro";
        matriz[1][1] = "Brian";
        
        System.out.println("--- Carga de la Matriz 3x3 (Nombres y Números alternados) ---");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j] != null) {
                    continue;
                }
                
                if ((i + j) % 2 == 0) {
                    System.out.print("Fila " + i + ", Col " + j + " - Ingrese un NOMBRE adicional: ");
                    matriz[i][j] = scanner.nextLine();
                } else {
                    System.out.print("Fila " + i + ", Col " + j + " - Ingrese un NÚMERO: ");
                    matriz[i][j] = scanner.nextLine();
                }
            }
        }
        
        System.out.println("Datos Clasificados ");
        System.out.println("Nombres\t\tNúmeros");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(matriz[i][j] + "\t\t");
                } else {
                    System.out.println(matriz[i][j]);
                }
            }
        }
        System.out.println("\n(Nota: La matriz finaliza en una columna de Nombre por tener un tamaño total impar de 9 celdas)");
        scanner.close();
    }
}









































/**Septimo Ejercicio
     7a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos empleados desea registrar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 
        
        String[][] empleados = new String[cantidad][3];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Empleado " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            empleados[i][0] = scanner.nextLine();
            
            System.out.print("Edad: ");
            empleados[i][1] = scanner.nextLine();
            
            System.out.print("Sueldo: ");
            empleados[i][2] = scanner.nextLine();
        }
        
        System.out.println("\nNombre\tEdad\tSueldo");
        System.out.println("-----------------------");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(empleados[i][0] + "\t" + empleados[i][1] + "\t" + empleados[i][2]);
        }
        scanner.close();
    }
}
*/
    

/**Octavo Ejercicio
     8a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese número de columnas: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int suma = 0;
        int contador = 0;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i > 0 && i % 2 != 0 && j > 0 && j % 2 != 0) {
                    suma += matriz[i][j];
                    contador++;
                }
            }
        }
        
        System.out.println("Resultados");
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("La suma de los elementos analizados es: " + suma);
            System.out.println("El promedio de dichos elementos es: " + promedio);
        } else {
            System.out.println("No se encontraron posiciones con índices positivos e impares en el tamaño de matriz provisto.");
        }
        scanner.close();
    }
}
*/
    

