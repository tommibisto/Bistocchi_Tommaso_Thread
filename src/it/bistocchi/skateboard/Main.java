package it.bistocchi.skateboard;

/**
 * Main per avviare una piccola simulazione di produzione.
 */
public class Main {
    public static void main(String[] args) {
        ProductionManager manager = new ProductionManager();

        System.out.println("Main: avvio produzione batch di 3 skateboard");
        manager.produceBatch(3);
        System.out.println("Main: produzione terminata");
    }
}