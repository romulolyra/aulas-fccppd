/*

Implemente uma classe que inicializa
uma única Thread e executa o método
increment 1000x.
Qual o valor final de getValue()?


*/

public class SequentialCounter implements Runnable {
     int counter = 0;

    public SequentialCounter() {
    }

    static int increment(int a) {
         //System.out.println(" Hello World, " +a);
         a++;
         return a;
    }

    @Override
    public void run() {
        int counter = 0;
         while(counter< 1000){
            counter =   increment(counter);
         }
         System.out.println(counter);
    }

    public static void main(String[] args) {
        SequentialCounter count1 = new SequentialCounter();
        Thread thread1 = new Thread(count1);
        thread1.start();      
                
    }
}
