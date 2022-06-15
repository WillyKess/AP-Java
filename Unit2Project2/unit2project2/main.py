class G(object):
    def __init__(self):
        self._x = 3

    def setX(self, val):
        self._x = val

    def __str__(self):
        return str(self._x)


class H(G):
    def __init__(self):
        self._y = 4

    def setY(self, val):
        self._y = val

    def __str__(self):
        return str(self._y) + " " + super(H, self).__str__()


def main():
    one = G()
    print(one)
    one.setX(5)
    print(one)
    two = H()
    two.setX(-2)
    two.setY(11)
    print(two)


main()
