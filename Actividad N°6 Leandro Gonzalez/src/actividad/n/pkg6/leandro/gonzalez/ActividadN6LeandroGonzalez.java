/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.n.pkg6.leandro.gonzalez;
import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author Alumno
 */
public class ActividadN6LeandroGonzalez {

    /**1er metodo 
     1a
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

       
        Arrays.sort(vector);

        System.out.println("\n  RESULTADOS (Vector ordenado: " + Arrays.toString(vector) + ")");
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
    
/**1er metodo 
     2a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int suma = 0;
        int contador = 0;
        
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        
         
        Arrays.sort(vector, 0, 5);
        System.out.println("\nVector con la primera mitad ordenada: " + Arrays.toString(vector));

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
    

/**1er metodo 
     3a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Ordenamos las notas de menor a mayor
        Arrays.sort(notas);

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }

        double media = suma / n;
        System.out.println("\nLa nota media es: " + media);

        // Al estar ordenadas, los resultados saldrán de menor a mayor puntuación automáticamente
        System.out.println("Notas superiores a la media (en orden ascendente):");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("Nota: " + notas[i]);
            }
        }
    }
}
*/
 
/**1er metodo 
     4a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] pares = new Integer[20];
        int contador = 0; 
        
        System.out.println("Ingresa números:");
        while (contador < 20) {
            System.out.print("Ingresa un número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares[contador] = num;
                contador++;
            }
        }
        
        
        Arrays.sort(pares, Collections.reverseOrder());
        
        System.out.println("\nNúmeros pares ingresados (ordenados de mayor a menor):");
        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }
    }
}
*/

/**1er metodo 
     5a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        
        Arrays.sort(vector);
        System.out.println("Vector ordenado: " + Arrays.toString(vector));
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("Resultados:");
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
*/
    
    /**1er metodo 
     6a
    public static void main(String[] args) {
        int[] vector = new int[10];
        Scanner teclado = new Scanner(System.in);
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;
        
        System.out.println("Introduce 10 numeros enteros:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        } 
        
        Arrays.sort(vector);
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                sumaPositivos += vector[i];
                countPositivos++;
            } else if (vector[i] < 0) {
                sumaNegativos += vector[i];
                countNegativos++;
            }
        }
        
        System.out.println("Resultados:");
        if (countPositivos > 0) {
            double mediaPositivos = (double) sumaPositivos / countPositivos;
            System.out.println("Media de positivos: " + mediaPositivos);
        } else {
            System.out.println("No hay numeros positivos.");
        }
        
        if (countNegativos > 0) {
            double mediaNegativos = (double) sumaNegativos / countNegativos;
            System.out.println("Media de negativos: " + mediaNegativos);
        } else {
            System.out.println("No hay numeros negativos.");
        }
    }
}
*/
  

 /**1er metodo 
     8a
        public static void main(String[] args) {
        String[] nombres = new String[20];
        double[] sueldos = new double[20];
        Scanner teclado = new Scanner(System.in);

        double mayorSueldo;
        int indiceMayor = 0;

        System.out.println("Empleado 1:");
        System.out.print("Nombre: ");
        nombres[0] = teclado.nextLine();
        System.out.print("Sueldo: ");
        sueldos[0] = teclado.nextDouble();
        mayorSueldo = sueldos[0];
        teclado.nextLine(); 

        for (int i = 1; i < 20; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();

            System.out.print("Sueldo: ");
            sueldos[i] = teclado.nextDouble();
            teclado.nextLine(); 

            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                indiceMayor = i;
            }
        }
        
        System.out.println("Empleado con mayor sueldo");
        System.out.println("Nombre: " + nombres[indiceMayor]);
        System.out.println("Sueldo: " + mayorSueldo);
        
    
        Arrays.sort(sueldos);
        System.out.println("Lista de todos los sueldos de la empresa ordenados de menor a mayor:");
        System.out.println(Arrays.toString(sueldos));
    }
}
*/



/**1er metodo 
     9a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor minimo (desde): ");
        int desde = sc.nextInt();
        System.out.print("Ingrese el valor maximo (hasta): ");
        int hasta = sc.nextInt();
        System.out.print("Ingrese el tamano del array: ");
        int tamano = sc.nextInt();

        if ((hasta - desde + 1) < tamano) {
            System.out.println("El rango es muy pequeño para generar numeros sin repetir.");
        } else {
            int[] miArray = llenarArray(desde, hasta, tamano);

            // Aplicamos el método para ordenar los números aleatorios generados
            Arrays.sort(miArray);

            System.out.println("\nArray generado sin repeticiones y ordenado:");
            for (int i = 0; i < miArray.length; i++) {
                System.out.print(miArray[i] + (i < miArray.length - 1 ? ", " : ""));
            }
            System.out.println();
        }
    }

    public static int[] llenarArray(int desde, int hasta, int tamano) {
        Random rnd = new Random();
        int[] resultado = new int[tamano];
        int i = 0;

        while (i < tamano) {
            int numAleatorio = rnd.nextInt(hasta - desde + 1) + desde;

            if (!comprobarSiContiene(resultado, i, numAleatorio)) {
                resultado[i] = numAleatorio;
                i++;
            }
        }
        return resultado;
    }

    public static boolean comprobarSiContiene(int[] array, int posicionActual, int num) {
        for (int i = 0; i < posicionActual; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
}
*/
/**2do metodo 
     1b
   static class Numero implements Comparable<Numero> {
        private int valor;

        public Numero(int valor) {
            this.valor = valor;
        }

        public int getValor() { return valor; }


        @Override
        public int compareTo(Numero otro) {
            return Integer.compare(this.valor, otro.valor);
        }

        @Override
        public String toString() {
            return String.valueOf(valor);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numero[] vector = new Numero[10];
        int pos = 0, neg = 0;
        double sumaPos = 0, sumaNeg = 0;
        
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vector[i] = new Numero(sc.nextInt()); 
        }

        for (int i = 0; i < 10; i++) {
            int v = vector[i].getValor();
            if (v > 0) {
                sumaPos += v;
                pos++;
            } else if (v < 0) {
                sumaNeg += v;
                neg++;
            }
        }

        
        Arrays.sort(vector);

        System.out.println(" RESULTADOS (Vector ordenado de menor a mayor: " + Arrays.toString(vector) + ")");
        if (pos > 0) {
            System.out.println("Media de positivos: " + (sumaPos / pos));
        } else {
            System.out.println("No se introdujeron numeros positivos.");
        }

        if (neg > 0) {
            System.out.println("Media de negativos: " + (sumaNeg / neg));
        } else {
            System.out.println("No se introdujeron numeros negativos.");
        }
    }
} 
*/
    
/**2do metodo 
     2b
    static class Elemento {
        private int valor;

        public Elemento(int valor) {
            this.valor = valor;
        }

        public int getValor() { return valor; }

        @Override
        public String toString() {
            return String.valueOf(valor);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elemento[] vector = new Elemento[10];
        int suma = 0;
        int contador = 0;
        
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = new Elemento(sc.nextInt());
        }
        
        // Ordenamos un rango del array de objetos usando Comparator (Lambda)
        Arrays.sort(vector, 0, 5, (a, b) -> Integer.compare(a.getValor(), b.getValor()));
        System.out.println("\nVector con la primera mitad ordenada: " + Arrays.toString(vector));

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                suma += vector[i].getValor();
                contador++;
            }
        }

        double media = (double) suma / contador;
        System.out.println("La media de las posiciones pares es: " + media);
    }
*/
    

    
/**2do metodo 
     3b
class Alumno implements Comparable<Alumno> {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() { return nombre; }
    public double getNota() { return nota; }

   
    @Override
    public int compareTo(Alumno otro) {
        return Double.compare(this.nota, otro.nota); 
      
    }

    @Override
    public String toString() {
        return nombre + " (Nota: " + nota + ")";
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();
        sc.nextLine(); 

     
        Alumno[] alumnos = new Alumno[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Datos del alumno " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Nota: ");
            double nota = sc.nextDouble();
            sc.nextLine(); // Limpiar buffer
            
            alumnos[i] = new Alumno(nombre, nota);
        }

  
        double suma = 0;
        for (Alumno a : alumnos) {
            suma += a.getNota();
        }
        double media = suma / n;
        System.out.println("\nLa nota media es: " + media);

        
        Arrays.sort(alumnos);

        System.out.println("\nAlumnos con nota superior a la media (Ordenados de menor a mayor nota):");
        for (Alumno a : alumnos) {
            if (a.getNota() > media) {
                System.out.println(a);
            }
        }
    }
}

*/
    
    static class NumeroPar {
        private int valor;

        public NumeroPar(int valor) {
            this.valor = valor;
        }

        public int getValor() { return valor; }

        @Override
        public String toString() {
            return String.valueOf(valor);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumeroPar[] pares = new NumeroPar[20];
        int contador = 0; 
        
        System.out.println("Ingresa números:");
        while (contador < 20) {
            System.out.print("Ingresa un número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares[contador] = new NumeroPar(num);
                contador++;
            }
        }
        Arrays.sort(pares, (n1, n2) -> Integer.compare(n2.getValor(), n1.getValor()));
        
        System.out.println("\nNúmeros pares ingresados (ordenados de mayor a menor):");
        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }
    }
}
   



    /**2do metodo 
     8b
    static class DatosEmpleado {
        private String nombre;
        private double sueldo;

        public DatosEmpleado(String nombre, double sueldo) {
            this.nombre = nombre;
            this.sueldo = sueldo;
        }

        public String getNombre() { return nombre; }
        public double getSueldo() { return sueldo; }

        @Override
        public String toString() {
            return "Nombre: " + nombre + " | Sueldo: $" + sueldo;
        }
    }

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        DatosEmpleado[] empleados = new DatosEmpleado[20];

     
        for (int i = 0; i < 20; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();
            System.out.print("Sueldo: ");
            double sueldo = teclado.nextDouble();
            teclado.nextLine(); 
            
          
            empleados[i] = new DatosEmpleado(nombre, sueldo);
        }

       
        Arrays.sort(empleados, (e1, e2) -> Double.compare(e2.getSueldo(), e1.getSueldo()));

        System.out.println(" Empleado con mayor sueldo ");
        System.out.println(empleados[0]);

        System.out.println(" Lista completa (de mayor a menor sueldo) ");
        for (int i = 0; i < 20; i++) {
            System.out.println(empleados[i]);
        }
    }
}
*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     /**3er metodo 
     8c
     
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    String[] nombres = new String[20];
    double[] sueldos = new double[20];

    for (int i = 0; i < 20; i++) {
        System.out.println("Empleado " + (i + 1) + ":");
        System.out.print("Nombre: ");
        nombres[i] = teclado.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = teclado.nextDouble();
        teclado.nextLine();
    }

    // Ordenar de mayor a menor sueldo (burbuja)
    for (int i = 0; i < 20 - 1; i++) {
        for (int j = 0; j < 20 - 1 - i; j++) {
            if (sueldos[j] < sueldos[j + 1]) {
                // Intercambiar sueldos
                double tempSueldo = sueldos[j];
                sueldos[j] = sueldos[j + 1];
                sueldos[j + 1] = tempSueldo;
                // Intercambiar nombres también
                String tempNombre = nombres[j];
                nombres[j] = nombres[j + 1];
                nombres[j + 1] = tempNombre;
            }
        }
    }

    System.out.println("\n--- Empleado con mayor sueldo ---");
    System.out.println("Nombre: " + nombres[0] + " | Sueldo: $" + sueldos[0]);

    System.out.println("\n--- Lista completa (de mayor a menor sueldo) ---");
    for (int i = 0; i < 20; i++) {
        System.out.println("Nombre: " + nombres[i] + " | Sueldo: $" + sueldos[i]);
    }
}
}
*/

