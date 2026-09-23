package it.mirco.thread;

public class Main {
    public static void main(String[] args) 
    {
        Contatore contatoreCondiviso = new Contatore();

        Lavoratore lavoratore1 = new Lavoratore(contatoreCondiviso,"Thread-1");
        Lavoratore lavoratore2 = new Lavoratore(contatoreCondiviso, "Thread-2");

        Thread t1 = new Thread(lavoratore1);
        Thread t2 = new Thread(lavoratore2);

        t1.start();
        t2.start();

        // Attesa del completamento dei thread tramite join()
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Il thread principale è stato interrotto.");
        }

        // Messaggio finale dopo la fine di entrambi i thread
        System.out.println("Raggiunto il valore massimo del contatore!");
    }
}