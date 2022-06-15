class Beast:
    def __init__(self, n: str, a: int):
        self.n = n
        self.a = a

    def __repr__(self):
        return f"{self.n} - {self.a}"


class Beasts:
    def __init__(self, size: int):
        self.things: list[Beast] = [None] * size  # type: ignore

    def set(self, spot: int, b):
        self.things[spot] = b


def main(beasts):
    group: Beasts = Beasts(len(beasts))
    for beast in beasts:
        group.set(beasts.index(beast), beast)
    print(group.things)


def tester():
    main([Beast("Dog", 1), Beast("Cat", 7), Beast("Spot", 9), Beast(
        "Fido", 3), Beast("Garfield", 22), Beast("Odie", 8), Beast("Porky", 32)])


tester()
