import java.util.concurrent.atomic.AtomicInteger;

/*
A) Revise o Exercício A da aula anterior (em
python) e corrija o problema identificado

Inicie com uma implementação de
Counter chamada SequentialCounter. A
implementação não deve usar nenhuma
sincronização e simplesmente incrementar
um inteiro a cada chamada de
increment().

def f(i):
    print('hello world', i)


if __name__ == '__main__':
    for num in range(10):
        p = Process(target=f, args=(num, ))
        p.start()


*/

public class ThreadsExample implements Runnable {
    static AtomicInteger counter = new AtomicInteger(1);

    public ThreadsExample() {
    }

    static void increment() {
         System.out.println(" Hello World, " + counter.getAndIncrement());
    }

    @Override
    public void run() {
         while(counter.get() < 10){
              increment();
         }
    }

    public static void main(String[] args) {
        ThreadsExample te = new ThreadsExample();
        Thread thread1 = new Thread(te);
        thread1.start();         
    }
}
