import time
from multiprocessing import Process


def run():
  return 

if __name__ == '__main__':

  inicio = time.time()

  time_run = Process(target=run, args=())
  time_run.start()
  time_run.join()

  fim = time.time()
  tempo = fim - inicio
  
  print("Overhead de criação do programa: ", tempo)

   
