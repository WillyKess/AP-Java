def main():
    word = input("Enter a word: ")
    print(word)
    wlen = len(word)
    if wlen > 2:
        rmiddlei = int(wlen/2)
        if wlen % 2 == 0:
            middletwo = word[rmiddlei-1] + \
                " " + word[rmiddlei]
            print(middletwo)
            print(middletwo[::-1])
        else:
            middleone = word[rmiddlei] + " " + \
                word[rmiddlei]
            print(middleone)
    print(word[::-1])


main()
