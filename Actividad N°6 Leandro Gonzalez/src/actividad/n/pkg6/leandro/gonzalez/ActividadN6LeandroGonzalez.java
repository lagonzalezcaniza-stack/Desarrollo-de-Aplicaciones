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
    /**2do metodo 
     4b

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
        
        System.out.println("Ingresa numeros:");
        while (contador < 20) {
            System.out.print("Ingresa un numero: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares[contador] = new NumeroPar(num);
                contador++;
            }
        }
        Arrays.sort(pares, (n1, n2) -> Integer.compare(n2.getValor(), n1.getValor()));
        
        System.out.println("Numeros pares ingresados (ordenados de mayor a menor):");
        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }
    }
}
   */
/**2do metodo 
     5b
    static class RegistroNumero implements Comparable<RegistroNumero> {
        private int valor;

        public RegistroNumero(int valor) {
            this.valor = valor;
        }

        public int getValor() { return valor; }

        @Override
        public int compareTo(RegistroNumero otro) {
            return Integer.compare(this.valor, otro.valor);
        }

        @Override
        public String toString() {
            return String.valueOf(valor);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroNumero[] vector = new RegistroNumero[10];
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = new RegistroNumero(sc.nextInt());
        }
        
        
        Arrays.sort(vector);
        System.out.println("\nObjetos ordenados numéricamente: " + Arrays.toString(vector));
        
        for (int i = 0; i < vector.length; i++) {
            int v = vector[i].getValor();
            if (v > 0) {
                positivos++;
            } else if (v < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("RESULTADOS:");
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
*/
    
/**2do metodo 
     6b

    static class ItemNumerico {
        private int valor;

        public ItemNumerico(int valor) {
            this.valor = valor;
        }

        public int getValor() { return valor; }
    }

    public static void main(String[] args) {
        ItemNumerico[] vector = new ItemNumerico[10];
        Scanner teclado = new Scanner(System.in);
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;
        
        System.out.println("Introduce 10 numeros enteros:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = new ItemNumerico(teclado.nextInt());
        } 
        
        
        Arrays.sort(vector, (a, b) -> Integer.compare(a.getValor(), b.getValor()));
        
        for (int i = 0; i < vector.length; i++) {
            int v = vector[i].getValor();
            if (v > 0) {
                sumaPositivos += v;
                countPositivos++;
            } else if (v < 0) {
                sumaNegativos += v;
                countNegativos++;
            }
        }
        
        System.out.println("RESULTADOS:");
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

  /**2do metodo 
     9b
    static class Muestra implements Comparable<Muestra> {
        private int valor;

        public Muestra(int valor) {
            this.valor = valor;
        }

        public int getValor() { return valor; }

        @Override
        public int compareTo(Muestra otra) {
            return Integer.compare(this.valor, otra.getValor());
        }

        @Override
        public String toString() {
            return String.valueOf(valor);
        }
    }

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
            Muestra[] miArray = llenarArray(desde, hasta, tamano);

         
            Arrays.sort(miArray);

            System.out.println("\nArray de objetos generado sin repeticiones y ORDENADO:");
            for (int i = 0; i < miArray.length; i++) {
                System.out.print(miArray[i] + (i < miArray.length - 1 ? ", " : ""));
            }
            System.out.println();
        }
    }

    public static Muestra[] llenarArray(int desde, int hasta, int tamano) {
        Random rnd = new Random();
        Muestra[] resultado = new Muestra[tamano];
        int i = 0;

        while (i < tamano) {
            int numAleatorio = rnd.nextInt(hasta - desde + 1) + desde;

            if (!comprobarSiContiene(resultado, i, numAleatorio)) {
                resultado[i] = new Muestra(numAleatorio);
                i++;
            }
        }
        return resultado;
    }

    public static boolean comprobarSiContiene(Muestra[] array, int posicionActual, int num) {
        for (int i = 0; i < posicionActual; i++) {
            if (array[i].getValor() == num) {
                return true;
            }
        }
        return false;
    }
}
}
  */
   /**3er metodo 
     1c
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

       
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        System.out.println(" RESULTADOS (Vector ordenado: " + Arrays.toString(vector) + ")");
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
}
 */
/**3er metodo 
     2c
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
        
  
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
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
    
   /**3er metodo 
     3c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    double temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temp;
                }
            }
        }

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }

        double media = suma / n;
        System.out.println("La nota media es: " + media);

        System.out.println("Notas superiores a la media (en orden ascendente):");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("Nota: " + notas[i]);
            }
        }
    }
}
  */

/**3er metodo 
     4c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[20];
        int contador = 0; 
        
        System.out.println("Ingresa numeros:");
        while (contador < 20) {
            System.out.print("Ingresa un numero: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                p[contador] = num;
                contador++;
            }
        }
        
    
        for (int i = 0; i < 20 - 1; i++) {
            for (int j = 0; j < 20 - 1 - i; j++) {
                if (p[j] < p[j + 1]) { 
                    int temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Numeros pares ingresados (ordenados de mayor a menor con burbuja):");
        for (int i = 0; i < 20; i++) {
            System.out.println(p[i]);
        }
    }
}

    */
    /**3er metodo 
     5c
    
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
        
       
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
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
        
        System.out.println("RESULTADOS:");
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
*/
    
   /**3er metodo 
     6c
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
        
       
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
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
        
        System.out.println("RESULTADOS:");
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

    /**3er metodo 
     9c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor minimo desde: ");
        int desde = sc.nextInt();
        System.out.print("Ingrese el valor maximo hasta: ");
        int hasta = sc.nextInt();
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = sc.nextInt();

        if ((hasta - desde + 1) < tamano) {
            System.out.println("El rango es muy pequeño para generar numeros sin repetir.");
        } else {
            int[] miArray = llenarArray(desde, hasta, tamano);

           
            for (int i = 0; i < miArray.length - 1; i++) {
                for (int j = 0; j < miArray.length - 1 - i; j++) {
                    if (miArray[j] > miArray[j + 1]) {
                        int temp = miArray[j];
                        miArray[j] = miArray[j + 1];
                        miArray[j + 1] = temp;
                    }
                }
            }

            System.out.println("Array generado sin repeticiones y ordenado wey:");
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
     /**4to metodo 
     1d
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int pos = 0, neg = 0;
        double sumaPos = 0, sumaNeg = 0;
        
        System.out.println("Introduce 10 numeros:");
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

        for (int i = 0; i < vector.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }
            int t = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = t;
        }

        System.out.println("\n  RESULTADOS (Vector ordenado por Selección: " + Arrays.toString(vector) + ")");
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
   /**4to metodo 
     2d
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
        
        for (int i = 0; i < 5 - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < 5; j++) {
                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }
            int t = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = t;
        }
        System.out.println("Vector con la primera mitad ordenada por selección: " + Arrays.toString(vector));

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
    
/**4to metodo 
     3d
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

       
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (notas[j] < notas[minimo]) {
                    minimo = j;
                }
            }
            double t = notas[i];
            notas[i] = notas[minimo];
            notas[minimo] = t;
        }

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }

        double media = suma / n;
        System.out.println("La nota media es: " + media);

        System.out.println("Notas superiores a la mediaen orden:");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("Nota: " + notas[i]);
            }
        }
    }
}
*/
    
/**4to metodo 
     4d
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[20];
        int contador = 0; 
        
        System.out.println("Ingresa numeros:");
        while (contador < 20) {
            System.out.print("Ingresa un numero: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                p[contador] = num;
                contador++;
            }
        }
        
       
        for (int i = 0; i < p.length - 1; i++) {
            int maximo = i;
            for (int j = i + 1; j < p.length; j++) {
                if (p[j] > p[maximo]) { 
                    maximo = j;
                }
            }
            int t = p[i];
            p[i] = p[maximo];
            p[maximo] = t;
        }
        
        System.out.println("Números pares ingresados ordenados de mayor a menor:");
        for (int i = 0; i < 20; i++) {
            System.out.println(p[i]);
        }
    }
}
*/
   /**4to metodo 
     5d
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
        
      
        for (int i = 0; i < vector.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }
            int t = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = t;
        }
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
        
        System.out.println("RESULTADOS:");
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
*/
    
/**4to metodo 
     6d
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
        
     
        for (int i = 0; i < vector.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }
            int t = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = t;
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
        
        System.out.println("RESULTADOS:");
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
    
/**4to metodo 
     8d
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

       
        for (int i = 0; i < sueldos.length - 1; i++) {
            int maximo = i;
            for (int j = i + 1; j < sueldos.length; j++) {
                if (sueldos[j] > sueldos[maximo]) {
                    maximo = j;
                }
            }
           
            double tSueldo = sueldos[i];
            sueldos[i] = sueldos[maximo];
            sueldos[maximo] = tSueldo;
            
            
            String tNombre = nombres[i];
            nombres[i] = nombres[maximo];
            nombres[maximo] = tNombre;
        }

        System.out.println("\n--- Empleado con mayor sueldo ---");
        System.out.println("Nombre: " + nombres[0] + " | Sueldo: $" + sueldos[0]);

        System.out.println("Lista completa de mayor a menor sueldo");
        for (int i = 0; i < 20; i++) {
            System.out.println("Nombre: " + nombres[i] + " | Sueldo: $" + sueldos[i]);
        }
    }
}
*/
    
/**4to metodo 
     9d
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor minimo desde: ");
        int desde = sc.nextInt();
        System.out.print("Ingrese el valor maximo hasta: ");
        int hasta = sc.nextInt();
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = sc.nextInt();

        if ((hasta - desde + 1) < tamano) {
            System.out.println("El rango es muy pequeño para generar numeros sin repetir.");
        } else {
            int[] miArray = llenarArray(desde, hasta, tamano);

           
            for (int i = 0; i < miArray.length - 1; i++) {
                int minimo = i;
                for (int j = i + 1; j < miArray.length; j++) {
                    if (miArray[j] < miArray[minimo]) {
                        minimo = j;
                    }
                }
                int t = miArray[i];
                miArray[i] = miArray[minimo];
                miArray[minimo] = t;
            }

            System.out.println("Array generado sin repeticiones y ordenado:");
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
    
/**5to metodo 
     1e
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int pos = 0, neg = 0;
        double sumaPos = 0, sumaNeg = 0;
        
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
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

      
        int p, j;
        int aux;
        for (p = 1; p < vector.length; p++) { 
            aux = vector[p]; 
            j = p - 1; 
            while ((j >= 0) && (vector[j] > aux)) { 
                vector[j + 1] = vector[j]; 
                j--; 
            }
            vector[j + 1] = aux; 
        }

        System.out.println(" RESULTADOS : " + Arrays.toString(vector) + ")");
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
 /**5to metodo 
     2e
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int suma = 0;
        int contador = 0;
        
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        
       
        int p, j;
        int aux;
        for (p = 1; p < 5; p++) { 
            aux = vector[p]; 
            j = p - 1; 
            while ((j >= 0) && (vector[j] > aux)) { 
                vector[j + 1] = vector[j]; 
                j--; 
            }
            vector[j + 1] = aux; 
        }
        System.out.println("Vector: " + Arrays.toString(vector));

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
     /**5to metodo 
     3e
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

     
        int p, j;
        double aux;
        for (p = 1; p < n; p++) { 
            aux = notas[p]; 
            j = p - 1; 
            while ((j >= 0) && (notas[j] > aux)) { 
                notas[j + 1] = notas[j]; 
                j--; 
            }
            notas[j + 1] = aux; 
        }

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }

        double media = suma / n;
        System.out.println("La nota media es: " + media);

        System.out.println("Notas superiores a la media:");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("Nota: " + notas[i]);
            }
        }
    }
}
 */
  /**5to metodo 
     4e
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[20];
        int contador = 0; 
        
        System.out.println("Ingresa numeros:");
        while (contador < 20) {
            System.out.print("Ingresa un numero: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                p[contador] = num;
                contador++;
            }
        }
        
       
        int pos, j;
        int aux;
        for (pos = 1; pos < p.length; pos++) { 
            aux = p[pos]; 
            j = pos - 1; 
           
            while ((j >= 0) && (p[j] < aux)) { 
                p[j + 1] = p[j]; 
                j--; 
            }
            p[j + 1] = aux; 
        }
        
        System.out.println("Numeros pares ingresados ordenado de mayor a menor:");
        for (int i = 0; i < 20; i++) {
            System.out.println(p[i]);
        }
    }
}
*/
   /**5to metodo 
     5e
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
        
        
        int p, j;
        int aux;
        for (p = 1; p < vector.length; p++) { 
            aux = vector[p]; 
            j = p - 1; 
            while ((j >= 0) && (vector[j] > aux)) { 
                vector[j + 1] = vector[j]; 
                j--; 
            }
            vector[j + 1] = aux; 
        }
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
        
        System.out.println("RESULTADOS:");
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
 */
/**5to metodo 
     6e
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
        

        int p, j;
        int aux;
        for (p = 1; p < vector.length; p++) { 
            aux = vector[p]; 
            j = p - 1; 
            while ((j >= 0) && (vector[j] > aux)) { 
                vector[j + 1] = vector[j]; 
                j--; 
            }
            vector[j + 1] = aux; 
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
        
        System.out.println("RESULTADOS:");
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
 /**5to metodo 
     8e
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

    
        int pos, j;
        double auxSueldo;
        String auxNombre;
        
        for (pos = 1; pos < sueldos.length; pos++) { 
            auxSueldo = sueldos[pos]; 
            auxNombre = nombres[pos];
            j = pos - 1; 
            
          
            while ((j >= 0) && (sueldos[j] < auxSueldo)) { 
                sueldos[j + 1] = sueldos[j]; 
                nombres[j + 1] = nombres[j];
                j--; 
            }
            sueldos[j + 1] = auxSueldo; 
            nombres[j + 1] = auxNombre;
        }

        System.out.println("Empleado con mayor sueldo");
        System.out.println("Nombre: " + nombres[0] + " | Sueldo: $" + sueldos[0]);

        System.out.println("Lista completa de mayor a menor sueldo");
        for (int i = 0; i < 20; i++) {
            System.out.println("Nombre: " + nombres[i] + " | Sueldo: $" + sueldos[i]);
        }
    }
}
 */

    /**5to metodo 
     9e
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

        
            int p, j;
            int aux;
            for (p = 1; p < miArray.length; p++) { 
                aux = miArray[p]; 
                j = p - 1; 
                while ((j >= 0) && (miArray[j] > aux)) { 
                    miArray[j + 1] = miArray[j]; 
                    j--; 
                }
                miArray[j + 1] = aux; 
            }

            System.out.println("Array generado sin repeticiones y ordenado:");
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

   /**6to metodo 
     1f
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


        quicksort(vector, 0, vector.length - 1);

        System.out.println("\n  RESULTADOS (Vector ordenado por QuickSort: " + Arrays.toString(vector) + ")");
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

   
    public static void quicksort(int A[], int izq, int der) {
        int pivote = A[(izq + der) / 2]; 
        int i = izq; 
        int j = der; 
        int aux;

        while (i <= j) { 
            while (A[i] < pivote) i++; 
            while (A[j] > pivote) j--; 
            if (i <= j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
                i++;
                j--;
            }
        }
        if (izq < j) quicksort(A, izq, j); 
        if (i < der) quicksort(A, i, der); 
    }
}
*/
    /**6to metodo 
     2f
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
        
       
        quicksort(vector, 0, 4);
        
        System.out.println("\nVector con la primera mitad ordenada por QuickSort: " + Arrays.toString(vector));

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                suma += vector[i];
                contador++;
            }
        }

        double media = (double) suma / contador;
        System.out.println("La media de las posiciones pares es: " + media);
    }

    public static void quicksort(int A[], int izq, int der) {
        int pivote = A[(izq + der) / 2]; 
        int i = izq; int j = der; int aux;
        while (i <= j) { 
            while (A[i] < pivote) i++; 
            while (A[j] > pivote) j--; 
            if (i <= j) {
                aux = A[i]; A[i] = A[j]; A[j] = aux;
                i++; j--;
            }
        }
        if (izq < j) quicksort(A, izq, j); 
        if (i < der) quicksort(A, i, der); 
    }
}
*/
    
  /**6to metodo 
     3f
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }


        quicksort(notas, 0, n - 1);

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }

        double media = suma / n;
        System.out.println("\nLa nota media es: " + media);

        System.out.println("Notas superiores a la media (en orden ascendente por QuickSort):");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("Nota: " + notas[i]);
            }
        }
    }


    public static void quicksort(double A[], int izq, int der) {
        double pivote = A[(izq + der) / 2]; 
        int i = izq; int j = der; 
        double aux;
        while (i <= j) { 
            while (A[i] < pivote) i++; 
            while (A[j] > pivote) j--; 
            if (i <= j) {
                aux = A[i]; A[i] = A[j]; A[j] = aux;
                i++; j--;
            }
        }
        if (izq < j) quicksort(A, izq, j); 
        if (i < der) quicksort(A, i, der); 
    }
}
*/
  /**6to metodo 
     4f
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[20];
        int contador = 0; 
        
        System.out.println("Ingresa números:");
        while (contador < 20) {
            System.out.print("Ingresa un número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                p[contador] = num;
                contador++;
            }
        }
        
        // --- LLAMADA A QUICKSORT ---
        quicksortDescendente(p, 0, p.length - 1);
        
        System.out.println("\nNúmeros pares ingresados (ordenados de mayor a menor por QuickSort):");
        for (int i = 0; i < 20; i++) {
            System.out.println(p[i]);
        }
    }

    // Variación invertida del algoritmo para ordenar de Mayor a Menor
    public static void quicksortDescendente(int A[], int izq, int der) {
        int pivote = A[(izq + der) / 2]; 
        int i = izq; int j = der; int aux;
        while (i <= j) { 
            // Invertimos los signos '>' y '<' para cambiar la dirección del ordenamiento
            while (A[i] > pivote) i++; 
            while (A[j] < pivote) j--; 
            if (i <= j) {
                aux = A[i]; A[i] = A[j]; A[j] = aux;
                i++; j--;
            }
        }
        if (izq < j) quicksortDescendente(A, izq, j); 
        if (i < der) quicksortDescendente(A, i, der); 
    }
}
 */
   /**6to metodo 
     5f
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        
        // --- LLAMADA A QUICKSORT ---
        quicksort(vector, 0, vector.length - 1);
        
        System.out.println("\nVector ordenado por QuickSort: " + Arrays.toString(vector));
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("RESULTADOS:");
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }

    public static void quicksort(int A[], int izq, int der) {
        int pivote = A[(izq + der) / 2]; 
        int i = izq; int j = der; int aux;
        while (i <= j) { 
            while (A[i] < pivote) i++; 
            while (A[j] > pivote) j--; 
            if (i <= j) {
                aux = A[i]; A[i] = A[j]; A[j] = aux;
                i++; j--;
            }
        }
        if (izq < j) quicksort(A, izq, j); 
        if (i < der) quicksort(A, i, der); 
    }
} 
 */
    
  /**6to metodo 
     6f
    public static void main(String[] args) {
        int[] vector = new int[10];
        Scanner teclado = new Scanner(System.in);
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;
        
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        } 
        
      
        quicksort(vector, 0, vector.length - 1);
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                sumaPositivos += vector[i];
                countPositivos++;
            } else if (vector[i] < 0) {
                sumaNegativos += vector[i];
                countNegativos++;
            }
        }
        
        System.out.println("RESULTADOS:");
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

    public static void quicksort(int A[], int izq, int der) {
        int pivote = A[(izq + der) / 2]; 
        int i = izq; int j = der; int aux;
        while (i <= j) { 
            while (A[i] < pivote) i++; 
            while (A[j] > pivote) j--; 
            if (i <= j) {
                aux = A[i]; A[i] = A[j]; A[j] = aux;
                i++; j--;
            }
        }
        if (izq < j) quicksort(A, izq, j); 
        if (i < der) quicksort(A, i, der); 
    }
}
*/
     /**6to metodo 
     8f
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

        // --- LLAMADA A QUICKSORT SINCRONIZADO ---
        quicksortEmpleados(sueldos, nombres, 0, sueldos.length - 1);

        System.out.println("\n--- Empleado con mayor sueldo ---");
        System.out.println("Nombre: " + nombres[0] + " | Sueldo: $" + sueldos[0]);

        System.out.println("\n--- Lista completa (de mayor a menor sueldo por QuickSort) ---");
        for (int i = 0; i < 20; i++) {
            System.out.println("Nombre: " + nombres[i] + " | Sueldo: $" + sueldos[i]);
        }
    }

    // Algoritmo QuickSort Sincronizado Paralelo (Descendente)
    public static void quicksortEmpleados(double S[], String N[], int izq, int der) {
        double pivote = S[(izq + der) / 2]; 
        int i = izq; 
        int j = der; 
        
        double auxSueldo;
        String auxNombre;

        while (i <= j) { 
            while (S[i] > pivote) i++; 
            while (S[j] < pivote) j--; 
            if (i <= j) {
                // Intercambio en el array de sueldos
                auxSueldo = S[i]; S[i] = S[j]; S[j] = auxSueldo;
                
                // Intercambio idéntico en el array paralelo de nombres
                auxNombre = N[i]; N[i] = N[j]; N[j] = auxNombre;
                
                i++; 
                j--;
            }
        }
        if (izq < j) quicksortEmpleados(S, N, izq, j); 
        if (i < der) quicksortEmpleados(S, N, i, der); 
    }
}
*/
    
      /**6to metodo 
     9f
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

            // --- LLAMADA A QUICKSORT ---
            quicksort(miArray, 0, miArray.length - 1);

            System.out.println("\nArray generado sin repeticiones y ORDENADO por QuickSort:");
            for (int i = 0; i < miArray.length; i++) {
                System.out.print(miArray[i] + (i < miArray.length - 1 ? ", " : ""));
            }
            System.out.println();
        }
    }

    public static void quicksort(int A[], int izq, int der) {
        int pivote = A[(izq + der) / 2]; 
        int i = izq; int j = der; int aux;
        while (i <= j) { 
            while (A[i] < pivote) i++; 
            while (A[j] > pivote) j--; 
            if (i <= j) {
                aux = A[i]; A[i] = A[j]; A[j] = aux;
                i++; j--;
            }
        }
        if (izq < j) quicksort(A, izq, j); 
        if (i < der) quicksort(A, i, der); 
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
    /**7to metodo 
     1g
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

        // --- MÉTODO DE ORDENACIÓN SHELL (Copiado de tu link) ---
        int salto, aux, i;
        boolean cambios;

        for (salto = vector.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) { // Mientras se intercambien elementos
                cambios = false;
                for (i = salto; i < vector.length; i++) {
                    if (vector[i - salto] > vector[i]) { // Si están desordenados
                        aux = vector[i];
                        vector[i] = vector[i - salto];
                        vector[i - salto] = aux;
                        cambios = true; // Se marca que hubo un cambio
                    }
                }
            }
        }

        System.out.println("\n  RESULTADOS (Vector ordenado por Shell: " + Arrays.toString(vector) + ")");
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
     /**7to metodo 
     2g
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
        
        // --- MÉTODO DE ORDENACIÓN SHELL PARCIAL (Solo primeros 5 elementos) ---
        int salto, aux, i;
        boolean cambios;

        for (salto = 5 / 2; salto != 0; salto /= 2) { // El tamaño base para el salto ahora es 5
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < 5; i++) { // Límite fijado en 5
                    if (vector[i - salto] > vector[i]) {
                        aux = vector[i];
                        vector[i] = vector[i - salto];
                        vector[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        System.out.println("\nVector con la primera mitad ordenada por Shell: " + Arrays.toString(vector));

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
      /**7to metodo 
     3g
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // --- MÉTODO DE ORDENACIÓN SHELL (Ascendente) ---
        int salto, i;
        double aux; // Tipo double para coincidir con el array de notas
        boolean cambios;

        for (salto = notas.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < notas.length; i++) {
                    if (notas[i - salto] > notas[i]) {
                        aux = notas[i];
                        notas[i] = notas[i - salto];
                        notas[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }

        double suma = 0;
        for (i = 0; i < n; i++) {
            suma += notas[i];
        }

        double media = suma / n;
        System.out.println("\nLa nota media es: " + media);

        System.out.println("Notas superiores a la media (en orden ascendente por Shell):");
        for (i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("Nota: " + notas[i]);
            }
        }
    }
}
*/
    /**7to metodo 
     4g
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[20];
        int contador = 0; 
        
        System.out.println("Ingresa números:");
        while (contador < 20) {
            System.out.print("Ingresa un número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                p[contador] = num;
                contador++;
            }
        }
        
        // --- MÉTODO DE ORDENACIÓN SHELL (Descendente) ---
        int salto, aux, i;
        boolean cambios;

        for (salto = p.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < p.length; i++) {
                    // El signo '<' hace que los números más grandes viajen hacia adelante
                    if (p[i - salto] < p[i]) { 
                        aux = p[i];
                        p[i] = p[i - salto];
                        p[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        
        System.out.println("\nNúmeros pares ingresados (ordenados de mayor a menor por Shell):");
        for (i = 0; i < 20; i++) {
            System.out.println(p[i]);
        }
    }
}
*/ 
  /**7to metodo 
     5g
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        
        // --- MÉTODO DE ORDENACIÓN SHELL (Ascendente) ---
        int salto, aux, i;
        boolean cambios;

        for (salto = vector.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < vector.length; i++) {
                    if (vector[i - salto] > vector[i]) {
                        aux = vector[i];
                        vector[i] = vector[i - salto];
                        vector[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        System.out.println("\nVector ordenado por Shell: " + Arrays.toString(vector));
        
        for (i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("\nRESULTADOS:");
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
*/
      /**7to metodo 
     6g
    public static void main(String[] args) {
        int[] vector = new int[10];
        Scanner teclado = new Scanner(System.in);
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;
        
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        } 
        
        // --- MÉTODO DE ORDENACIÓN SHELL (Ascendente) ---
        int salto, aux, i;
        boolean cambios;

        for (salto = vector.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < vector.length; i++) {
                    if (vector[i - salto] > vector[i]) {
                        aux = vector[i];
                        vector[i] = vector[i - salto];
                        vector[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        
        for (i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                sumaPositivos += vector[i];
                countPositivos++;
            } else if (vector[i] < 0) {
                sumaNegativos += vector[i];
                countNegativos++;
            }
        }
        
        System.out.println("\nRESULTADOS:");
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
    
  /**7to metodo 
     8g
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

        // --- MÉTODO DE ORDENACIÓN SHELL SINCRONIZADA (Descendente) ---
        int salto, i;
        double auxSueldo;
        String auxNombre;
        boolean cambios;

        for (salto = sueldos.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < sueldos.length; i++) {
                    if (sueldos[i - salto] < sueldos[i]) { // Criterio descendente
                        // Sincronización del intercambio de sueldos
                        auxSueldo = sueldos[i];
                        sueldos[i] = sueldos[i - salto];
                        sueldos[i - salto] = auxSueldo;
                        
                        // Sincronización idéntica en el array de nombres
                        auxNombre = nombres[i];
                        nombres[i] = nombres[i - salto];
                        nombres[i - salto] = auxNombre;
                        
                        cambios = true;
                    }
                }
            }
        }

        System.out.println("\n--- Empleado con mayor sueldo ---");
        System.out.println("Nombre: " + nombres[0] + " | Sueldo: $" + sueldos[0]);

        System.out.println("\n--- Lista completa (de mayor a menor sueldo por Shell) ---");
        for (i = 0; i < 20; i++) {
            System.out.println("Nombre: " + nombres[i] + " | Sueldo: $" + sueldos[i]);
        }
    }
}
*/
    
/**7to metodo 
     9g
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

            // --- MÉTODO DE ORDENACIÓN SHELL (Ascendente) ---
            int salto, aux, i;
            boolean cambios;

            for (salto = miArray.length / 2; salto != 0; salto /= 2) {
                cambios = true;
                while (cambios) {
                    cambios = false;
                    for (i = salto; i < miArray.length; i++) {
                        if (miArray[i - salto] > miArray[i]) {
                            aux = miArray[i];
                            miArray[i] = miArray[i - salto];
                            miArray[i - salto] = aux;
                            cambios = true;
                        }
                    }
                }
            }

            System.out.println("\nArray generado sin repeticiones y ORDENADO por Shell:");
            for (i = 0; i < miArray.length; i++) {
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
    
/**8vo metodo 
     1h
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

        // --- LLAMADA AL MÉTODO MERGESORT ---
        mergesort(vector, 0, vector.length - 1);

        System.out.println("\n  RESULTADOS (Vector ordenado por MergeSort: " + Arrays.toString(vector) + ")");
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

    // --- LÓGICA ESTRUCTURAL DE MERGESORT (Copiada de tu link) ---
    public static void mergesort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length]; // Array auxiliar
        for (i = izq; i <= der; i++) { // Copia ambas mitades en el array auxiliar
            B[i] = A[i];
        }

        i = izq; j = m + 1; k = izq;
        
        while (i <= m && j <= der) { // Copia el elemento menor de cada mitad
            if (B[i] <= B[j]) {
                A[k++] = B[i++];
            } else {
                A[k++] = B[j++];
            }
        }
        while (i <= m) { // Copia los elementos restantes de la primera mitad
            A[k++] = B[i++];
        }
    }
}
*/
/**8vo metodo 
     2h
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
        
        // --- MERGESORT LIMITADO (Solo desde índice 0 hasta 4) ---
        mergesort(vector, 0, 4);
        
        System.out.println("\nVector con la primera mitad ordenada por MergeSort: " + Arrays.toString(vector));

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                suma += vector[i];
                contador++;
            }
        }

        double media = (double) suma / contador;
        System.out.println("La media de las posiciones pares es: " + media);
    }

    public static void mergesort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length];
        for (i = izq; i <= der; i++) B[i] = A[i];
        i = izq; j = m + 1; k = izq;
        while (i <= m && j <= der) {
            if (B[i] <= B[j]) A[k++] = B[i++];
            else A[k++] = B[j++];
        }
        while (i <= m) A[k++] = B[i++];
    }
}
*/
/**8vo metodo 
     3h
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // --- LLAMADA A MERGESORT PARA DECIMALES ---
        mergesort(notas, 0, n - 1);

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }

        double media = suma / n;
        System.out.println("\nLa nota media es: " + media);

        System.out.println("Notas superiores a la media (en orden ascendente por MergeSort):");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("Nota: " + notas[i]);
            }
        }
    }

    // Adaptación del algoritmo usando tipo double
    public static void mergesort(double A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(double A[], int izq, int m, int der) {
        int i, j, k;
        double[] B = new double[A.length];
        for (i = izq; i <= der; i++) B[i] = A[i];
        i = izq; j = m + 1; k = izq;
        while (i <= m && j <= der) {
            if (B[i] <= B[j]) A[k++] = B[i++];
            else A[k++] = B[j++];
        }
        while (i <= m) A[k++] = B[i++];
    }
}
*/
    
/**8vo metodo 
     4h
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[20];
        int contador = 0; 
        
        System.out.println("Ingresa números:");
        while (contador < 20) {
            System.out.print("Ingresa un número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                p[contador] = num;
                contador++;
            }
        }
        
        // --- LLAMADA A MERGESORT ---
        mergesortDescendente(p, 0, p.length - 1);
        
        System.out.println("\nNúmeros pares ingresados (ordenados de mayor a menor por MergeSort):");
        for (int i = 0; i < 20; i++) {
            System.out.println(p[i]);
        }
    }

    public static void mergesortDescendente(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesortDescendente(A, izq, m);
            mergesortDescendente(A, m + 1, der);
            mergeDescendente(A, izq, m, der);
        }
    }

    public static void mergeDescendente(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length];
        for (i = izq; i <= der; i++) B[i] = A[i];
        i = izq; j = m + 1; k = izq;
        while (i <= m && j <= der) {
            // El signo '>=' invierte la prioridad dando paso al valor más alto primero
            if (B[i] >= B[j]) { 
                A[k++] = B[i++];
            } else {
                A[k++] = B[j++];
            }
        }
        while (i <= m) A[k++] = B[i++];
    }
}
*/
/**8vo metodo 
     5h
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        
        // --- LLAMADA A MERGESORT ---
        mergesort(vector, 0, vector.length - 1);
        
        System.out.println("\nVector ordenado por MergeSort: " + Arrays.toString(vector));
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("\nRESULTADOS:");
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }

    public static void mergesort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length];
        for (i = izq; i <= der; i++) B[i] = A[i];
        i = izq; j = m + 1; k = izq;
        while (i <= m && j <= der) {
            if (B[i] <= B[j]) A[k++] = B[i++];
            else A[k++] = B[j++];
        }
        while (i <= m) A[k++] = B[i++];
    }
}
*/
 /**8vo metodo 
     6h
    public static void main(String[] args) {
        int[] vector = new int[10];
        Scanner teclado = new Scanner(System.in);
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;
        
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        } 
        
        // --- LLAMADA A MERGESORT ---
        mergesort(vector, 0, vector.length - 1);
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                sumaPositivos += vector[i];
                countPositivos++;
            } else if (vector[i] < 0) {
                sumaNegativos += vector[i];
                countNegativos++;
            }
        }
        
        System.out.println("\nRESULTADOS:");
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

    public static void mergesort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length];
        for (i = izq; i <= der; i++) B[i] = A[i];
        i = izq; j = m + 1; k = izq;
        while (i <= m && j <= der) {
            if (B[i] <= B[j]) A[k++] = B[i++];
            else A[k++] = B[j++];
        }
        while (i <= m) A[k++] = B[i++];
    }
}
*/
     /**8vo metodo 
     8h
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

        // --- LLAMADA A MERGESORT SINCRONIZADO ---
        mergesortEmpleados(sueldos, nombres, 0, sueldos.length - 1);

        System.out.println("\n--- Empleado con mayor sueldo ---");
        System.out.println("Nombre: " + nombres[0] + " | Sueldo: $" + sueldos[0]);

        System.out.println("\n--- Lista completa (de mayor a menor sueldo por MergeSort) ---");
        for (int i = 0; i < 20; i++) {
            System.out.println("Nombre: " + nombres[i] + " | Sueldo: $" + sueldos[i]);
        }
    }

    public static void mergesortEmpleados(double S[], String N[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesortEmpleados(S, N, izq, m);
            mergesortEmpleados(S, N, m + 1, der);
            mergeEmpleados(S, N, izq, m, der);
        }
    }

    public static void mergeEmpleados(double S[], String N[], int izq, int m, int der) {
        int i, j, k;
        double[] auxSueldos = new double[S.length];
        String[] auxNombres = new String[N.length];
        
        for (i = izq; i <= der; i++) {
            auxSueldos[i] = S[i];
            auxNombres[i] = N[i];
        }

        i = izq; j = m + 1; k = izq;
        while (i <= m && j <= der) {
            if (auxSueldos[i] >= auxSueldos[j]) { // Descendente
                S[k] = auxSuelledos[i];
                N[k] = auxNombres[i];
                i++;
            } else {
                S[k] = auxSueldos[j];
                N[k] = auxNombres[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            S[k] = auxSueldos[i];
            N[k] = auxNombres[i];
            i++; k++;
        }
    }
}
*/

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

            // --- LLAMADA A MERGESORT ---
            mergesort(miArray, 0, miArray.length - 1);

            System.out.println("\nArray generado sin repeticiones y ORDENADO por MergeSort:");
            for (int i = 0; i < miArray.length; i++) {
                System.out.print(miArray[i] + (i < miArray.length - 1 ? ", " : ""));
            }
            System.out.println();
        }
    }

    public static void mergesort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length];
        for (i = izq; i <= der; i++) B[i] = A[i];
        i = izq; j = m + 1; k = izq;
        while (i <= m && j <= der) {
            if (B[i] <= B[j]) A[k++] = B[i++];
            else A[k++] = B[j++];
        }
        while (i <= m) A[k++] = B[i++];
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