/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agustinmaidanahilosjajaj;

/**
 *
 * @author Alumno
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BufferCompartido {
    private int dato;
    private boolean disponible = false;

    public synchronized void producir(int valor) throws InterruptedException {
        while (disponible) { wait(); }
        dato = valor;
        System.out.println("Productor genero: " + dato);
        disponible = true;
        notify();
    }

    public synchronized void consumir() throws InterruptedException {
        while (!disponible) { wait(); }
        System.out.println("Consumidor consumio: " + dato);
        disponible = false;
        notify();
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        BufferCompartido buffer = new BufferCompartido();

        Thread productor = new Thread(() -> {
            try {
                for(int i=1; i<=5; i++) buffer.producir(i);
            } catch (InterruptedException e) {}
        });

        Thread consumidor = new Thread(() -> {
            try {
                for(int i=1; i<=5; i++) buffer.consumir();
            } catch (InterruptedException e) {}
        });

        productor.start();
        consumidor.start();
    }
}