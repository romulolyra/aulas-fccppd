
public class MyRunnable implements Runnable {
  int[] list_primos = new int[30];

  MyRunnable(int[] list){
    list_primos = list; 
  }
  
  public void run() {
    
        list_primos =  computePrimeFactors(list_primos);

          
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

          

         
     }