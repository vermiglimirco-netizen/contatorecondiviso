package it.mirco.thread;

import java.util.Random;

public class Lavoratore implements Readable
{
    private Contatore contatore;
    private String nome;
    

    public Lavoratore(Contatore c, String n) {
        this.c = c;
        this.n = n;
    }

    public void run () {
        
        while (continua) {
            continua = contatore.incrementa(nome);
            
            if (continua) 
            {  
               try 
               {                    
                    int pausa = 100 + random.nextInt(401); 
                    Thread.sleep(pausa);
                } catch (InterruptedException e) {
                    System.out.println(nome + " è stato interrotto.");
                    Thread.currentThread().interrupt(); // Ripristina lo stato di interruzione
                }              
            }
        }
    }


}
