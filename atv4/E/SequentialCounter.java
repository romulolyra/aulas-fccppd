/*

Implemente uma classe que inicializa
uma única Thread e executa o método
increment 1000x.
Qual o valor final de getValue()?


*/


public class SequentialCounter implements Runnable {
    static int  counter = 0;

   public SequentialCounter() {
   }

    static int increment() {
        int aux = 0;
        while(aux< 1000){
           counter++;
           aux++;
        }
        //System.out.println(counter);
        return counter;
   }
   public static void initializeThreads(SequentialCounter count, int idx) {

       Thread thread1 = new Thread(count);
       thread1.start();         
   }

   @Override
   public void run() {
       int aux = increment();
       System.out.println("Thread = "+idx);

   }
   public int getValue() {
       return counter;
   } 


   public static void main(String[] args) {
       SequentialCounter count1 = new SequentialCounter();
       for(int i = 0; i < 10; i++) {
           initializeThreads(count1, i);
       }
       int value = count1.getValue();
       System.out.println(value);    
               
   }
}
