def main():
    nums = []
    for i in range(5):
        nums.append(int(input("Value of roll #{i}: ".format(i=i+1))))
    if sum(nums) > 25:
        print("3 OF A KIND")
    else:
        print("FULL HOUSE")


main()
