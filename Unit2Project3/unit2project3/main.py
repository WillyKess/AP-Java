def power(mylist, k):
    return [x**k for x in mylist]


def even(mylist):
    return [x for x in mylist if x % 2 == 0]


def sum_two_100(mylist):
    for i in range(len(mylist)):
        for j in range(len(mylist)):
            if i != j and mylist[i] + mylist[j] == 100:
                return True, mylist[i], mylist[j]
    return False


def test():
    print("power: {result}".format(result="✅" if power(
        [1, 2, 3, 4, 5], 3) == [1, 8, 27, 64, 125] else "❌"))
    print("even: {result}".format(result="✅" if even(
        [1, 0, 2, 3, 0, 4, 5, 0]) == [0, 2, 0, 4, 0] else "❌"))
    print("sum_two_100: {result}".format(result="✅" if sum_two_100(
        [16, 2, 85, 27, 9, 45, 98, 73, 12, 26, 46, 25, 26, 49, 18, 99, 10, 86, 7, 42]) == (True, 2, 98) else "❌"))


test()
