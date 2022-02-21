 class PrimeRun implements Runnable {
         long minPrime;
         PrimeRun(long minPrime) {
             this.minPrime = minPrime;
         }

         public void run() {
        // Método system que da hora com o momento
	      //current time 
          System.out.println("segunda Thread");

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
     }