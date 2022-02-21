// https://medium.com/nerd-for-tech/understanding-threads-in-java-1f5a074d5753

// https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html

public class Main {

  public static void main(String[] variavel){ 

    PrimeThread p = new PrimeThread(143);
    p.start(); 

    PrimeRun pl = new PrimeRun(143);
    new Thread(pl).start();

  }
}


