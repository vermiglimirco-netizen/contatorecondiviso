package it.mirco.thread;

import java.util.Random;

public class lavoratore implements Readable
{
    private Contatore contatore;
    private String nome;
    private final Random random = new Random();

    public Lavoratore(Contatore contatore, String nome) {
        this.contatore = contatore;
        this.nome = nome;
    }

    @Override
    public void run() {
        boolean continua = true;
        while (continua) {
            continua = contatore.incrementa(nome);
            
            if (continua) 
            {  
                int pausa = 100 + random.nextInt(401); 
                Thread.sleep(pausa);                
            }
        }
    }


}
