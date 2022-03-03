
public class Main {

  public static void main(String[] variavel) throws InterruptedException{ 
    long start = System.currentTimeMillis();

    Thread thread1 = new Thread(new myRunnable());
    
    thread1.start();

    thread1.join();
    System.out.println("Tempo em milisegundos para a criacao da Thread :"+(System.currentTimeMillis() - start));
  }
}


