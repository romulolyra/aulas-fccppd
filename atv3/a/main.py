from multiprocessing import Process


def f(i):
    print('hello world', i)


if __name__ == '__main__':
    for num in range(10):
        p = Process(target=f, args=(num, ))
        p.start()
