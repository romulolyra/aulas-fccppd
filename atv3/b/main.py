import time
from multiprocessing import Process


def compute_prime_factors(values):
  inicio = time.time()
  
  factors = []
  for value in values:
    factors.append(num_prime_factors(value))

  fim = time.time()
  tempo = fim - inicio

  print("\nTempo da Função secundaria: ", tempo, "\n")
  print(factors)
  
  return factors
	

def num_prime_factors(number):
  prime_factors = 0
  n = number
  for i in range(2,number+1):
    while n % i == 0:
      prime_factors+=1
      n /= i
  
  return prime_factors


if __name__ == '__main__':
# Contagem tempo (início)
  inicio = time.time()

  values = [5, 10, 11, 12, 7, 2]
  
  prime = Process(target=compute_prime_factors, args=(values,))
  prime.start()
  
  fim = time.time()
  tempo = fim - inicio
  
  print("\nTempo do Programa principal: ", tempo, "\n")

   
