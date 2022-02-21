import java.util.Random;

class myRunnable implements Runnable {

  public void run() {
    
          long start = System.currentTimeMillis();
          int[] list_primos = new int[30];
          list_primos = computePrimeFactors(randomList(list_primos));
          System.out.println("Tempo em milisegundos na Thread :"+(System.currentTimeMillis() - start));

          
        }
        public static int[] computePrimeFactors(int[] values) {
          int[] factors = new int[values.length];
          for (int i = 0; i < values.length; i++) {
          factors[i] = numPrimeFactors(values[i]);
          }
          return factors;
          }
       
          public static int numPrimeFactors(int number) {
            int primeFactors = 0;
            int n = number;
            for (int i = 2; i <= n; i++) {
              while (n % i == 0) {
                primeFactors++;
                n /= i;
              }
            }
            return primeFactors;
          }
          public static int[] randomList(int [] list) {
            Random r = new Random();
            int[] newList = new int[list.length];
            for (int i = 0; i < list.length; i++) {
              newList[i] = r.nextInt();
           }
           return newList;
          }
          

         
     }