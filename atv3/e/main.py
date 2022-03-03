import time
from multiprocessing import Process
import numpy as np

def compute_prime_factors(values):
  
  factors = []
  for value in values:
    factors.append(num_prime_factors(value))
  
  return factors
	

def num_prime_factors(number):
  prime_factors = 0
  n = number
  for i in range(2,number+1):
    while n % i == 0:
      prime_factors+=1
      n /= i
  
  return prime_factors

def partition_data(array, start_idx, final_idx):
	idx = start_idx
	aux = 0
	retun_array = []

	while idx != final_idx:
		retun_array.append(array[idx])
		aux +=1
		idx +=1
		
	return retun_array

if __name__ == '__main__':
# Contagem tempo (início)
  NUMBER_OF_PROCESSES = 5
  inicio = time.time()

  initial_values = np.random.randint(1,10000,500)
  partition_size = int((len(initial_values)/NUMBER_OF_PROCESSES))
  start_index = 0 
  final_idex = partition_size -1

  for i in range(NUMBER_OF_PROCESSES):

    values = partition_data(initial_values, start_index,final_idex)
    prime = Process(target=compute_prime_factors, args=(values,))
    prime.start()

    start_index = start_index + partition_size 
    final_idex = final_idex + partition_size 

  
  fim = time.time()
  tempo = fim - inicio
  
  print("\nTempo do Programa principal: ", tempo, "\n")

   
