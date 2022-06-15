def fibonacci(a, b, n):
    if n == 0:
        return a
    else:
        return fibonacci(b, a + b, n - 1)


def testFibonacci():
    print(assert fibonacci(0, 1, 10) == 55)
    print(assert fibonacci(2, 1, 9) == 76)


# print(fibonacci(0, 1, 10))
# print(fibonacci(2, 1, 9))
testFibonacci()
