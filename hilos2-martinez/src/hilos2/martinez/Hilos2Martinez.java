/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos2.martinez;

/**
 *
 * @author Alumno
 */import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.LinkedList;
import java.util.Queue;

public class Hilos2Martinez {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== EJERCICIO 14: Sistema de pedidos ===\n");
        ejercicio14();
    }
    
    public static void pausa() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {}
    }
    
    public static void pausaCorta() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {}
    }
    
    public static void ejercicio14() throws InterruptedException {
        
        Cocina cocina = new Cocina(3);  
        
        System.out.println("SISTEMA DE PEDIDOS RESTAURANTE");
        System.out.println("Capacidad de la cocina: 3 pedidos en espera");
        System.out.println();
        pausa();
        

        Thread cliente1 = new Thread(() -> {
            String[] pedidos = {"Pizza", "Hamburguesa", "Ensalada", "Pasta", "Helado"};
            for (String pedido : pedidos) {
                cocina.hacerPedido(pedido, "Cliente 1");
                try { Thread.sleep(800); } catch (InterruptedException e) {}
            }
        });
        

        Thread cliente2 = new Thread(() -> {
            String[] pedidos = {"Sopa", "Milanesa", "Ravioles", "Flan"};
            for (String pedido : pedidos) {
                cocina.hacerPedido(pedido, "Cliente 2");
                try { Thread.sleep(1200); } catch (InterruptedException e) {}
            }
        });
        

        Thread cliente3 = new Thread(() -> {
            String[] pedidos = {"Bebida", "Cafe", "Postre"};
            for (String pedido : pedidos) {
                cocina.hacerPedido(pedido, "Cliente 3");
                try { Thread.sleep(1500); } catch (InterruptedException e) {}
            }
        });
        

        Thread cocinero = new Thread(() -> {
            for (int i = 0; i < 12; i++) {  
                cocina.procesarPedido();
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });
        
        System.out.println("Clientes comenzando a hacer pedidos...");
        System.out.println("Cocinero preparando para cocinar...");
        System.out.println();
        pausa();
        
        long inicio = System.currentTimeMillis();
        
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cocinero.start();
        
        cliente1.join();
        cliente2.join();
        cliente3.join();
        

        Thread.sleep(3000);
        cocinero.interrupt();
        
        long fin = System.currentTimeMillis();
        
        System.out.println("\n=== SERVICIO FINALIZADO ===");
        System.out.println("Tiempo total de atencion: " + (fin - inicio) + " ms");
        System.out.println("Total pedidos procesados: " + cocina.getTotalProcesados());
    }
}

class Cocina {
    private Queue<String> colaPedidos;
    private int capacidad;
    private int totalProcesados = 0;
    
    public Cocina(int capacidad) {
        this.colaPedidos = new LinkedList<>();
        this.capacidad = capacidad;
    }
    

    public synchronized void hacerPedido(String pedido, String cliente) {
        while (colaPedidos.size() >= capacidad) {
            try {
                System.out.println(cliente + " espera - cocina llena (hay " + colaPedidos.size() + " pedidos)");
                wait();
            } catch (InterruptedException e) {}
        }
        
        colaPedidos.add(pedido);
        System.out.println(cliente + " hizo pedido: " + pedido + " - Pedidos en espera: " + colaPedidos.size());
        notify(); 
    }
    

    public synchronized void procesarPedido() {
        while (colaPedidos.isEmpty()) {
            try {
                System.out.println("Cocinero espera - no hay pedidos");
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }
        
        String pedido = colaPedidos.poll();
        totalProcesados++;
        System.out.println("COCINERO prepara: " + pedido + " - Pedidos restantes: " + colaPedidos.size());
        
        try {

            int tiempoCoccion = calcularTiempoCoccion(pedido);
            Thread.sleep(tiempoCoccion);
        } catch (InterruptedException e) {}
        
        System.out.println("COCINERO termino: " + pedido + " - LISTO PARA SERVIR");
        notify(); 
    }
    
    private int calcularTiempoCoccion(String pedido) {
        if (pedido.equals("Pizza") || pedido.equals("Milanesa")) return 1500;
        if (pedido.equals("Hamburguesa") || pedido.equals("Pasta")) return 1200;
        if (pedido.equals("Sopa") || pedido.equals("Ravioles")) return 1000;
        return 500; 
    }
    
    public synchronized int getTotalProcesados() {
        return totalProcesados;
    }
}