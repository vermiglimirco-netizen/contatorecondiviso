package it.mirco.thread;

public class contatore extends Thread
{
    private int valore = 0;
    private int valoremassimo = 10;

    public synchronized boolean incrementa (String nomethread)
    {
        if(valore < valoremassimo)
        {
            valore++;
            System.out.println(nomethread + " ha incrementato il contatore a: " + valore);
            return true;
        }
            
        return false;
    }
}
