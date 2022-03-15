/*

C) Implemente uma segunda versão de
Counter capaz de ser compartilhada por
várias Threads (Thread-safe) ainda
utilizando o tipo primitivo int mas dessa
vez usando a palavra reservada
synchronized.

*/

public class SequentialCounter implements Runnable {
     static int  counter = 0;

    public SequentialCounter() {
    }

    synchronized static int increment() {
         int aux = 0;
         while(aux< 1000){
            counter++;
            aux++;
         }
         //System.out.println(counter);
         return counter;
    }
    public static void initializeThreads(SequentialCounter count) {

        Thread thread1 = new Thread(count);
        thread1.start();         
    }

    @Override
    public void run() {
        int aux = increment();

    }
    public int getValue() {
        return counter;
    } 


    public static void main(String[] args) {
        SequentialCounter count1 = new SequentialCounter();
        for(int i = 0; i < 10; i++) {
            initializeThreads(count1);
        }
        int value = count1.getValue();
        System.out.println(value);    
                
    }
}
