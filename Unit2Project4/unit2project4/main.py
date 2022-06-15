def sum_diagonal(array):
    sum = 0
    for i in range(len(array)):
        sum += array[i][i]
    return sum


def homothety_square(square, k):
    new_square = []
    for i in range(len(square)):
        temp_arr = []
        for j in range(len(square)):
            for _ in range(k):
                temp_arr.append(square[i][j])
        for _ in range(k):
            new_square.append(temp_arr)
    return new_square


def block_addition_square(big_square, small_square):
    new_square = []
    for i in range(len(big_square)):
        temp_arr = []
        for j in range(len(big_square)):
            temp_arr.append(
                big_square[i][j] + small_square[i % len(small_square)][j % len(small_square)])
        new_square.append(temp_arr)
    return new_square


def test():

    sumdiagarr_in = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]

    homothetyarr1_in = [
        [4, 9, 2],
        [3, 5, 7],
        [8, 1, 6]
    ]

    homothetyarr2_in = [
        [1, 14, 15, 4],
        [7, 9, 6, 12],
        [10, 8, 11, 5],
        [16, 3, 2, 13]
    ]

    blockaddsmall_in = [
        [1, 2],
        [3, 4]
    ]

    blockaddbig_in = [
        [4, 4, 9, 9, 2, 2],
        [4, 4, 9, 9, 2, 2],
        [3, 3, 5, 5, 7, 7],
        [3, 3, 5, 5, 7, 7],
        [8, 8, 1, 1, 6, 6],
        [8, 8, 1, 1, 6, 6]
    ]

    sumdiagarr_out = 15

    homothetyarr1_out = [
        [4, 4, 4, 9, 9, 9, 2, 2, 2],
        [4, 4, 4, 9, 9, 9, 2, 2, 2],
        [4, 4, 4, 9, 9, 9, 2, 2, 2],
        [3, 3, 3, 5, 5, 5, 7, 7, 7],
        [3, 3, 3, 5, 5, 5, 7, 7, 7],
        [3, 3, 3, 5, 5, 5, 7, 7, 7],
        [8, 8, 8, 1, 1, 1, 6, 6, 6],
        [8, 8, 8, 1, 1, 1, 6, 6, 6],
        [8, 8, 8, 1, 1, 1, 6, 6, 6]
    ]

    homothetyarr2_out = [
        [1, 1, 14, 14, 15, 15, 4, 4],
        [1, 1, 14, 14, 15, 15, 4, 4],
        [7, 7, 9, 9, 6, 6, 12, 12],
        [7, 7, 9, 9, 6, 6, 12, 12],
        [10, 10, 8, 8, 11, 11, 5, 5],
        [10, 10, 8, 8, 11, 11, 5, 5],
        [16, 16, 3, 3, 2, 2, 13, 13],
        [16, 16, 3, 3, 2, 2, 13, 13]
    ]

    blockadd_out = [
        [5, 6, 10, 11, 3, 4],
        [7, 8, 12, 13, 5, 6],
        [4, 5, 6, 7, 8, 9],
        [6, 7, 8, 9, 10, 11],
        [9, 10, 2, 3, 7, 8],
        [11, 12, 4, 5, 9, 10]
    ]

    print("sum_diagonal: {result}".format(
        result="✅" if sum_diagonal(sumdiagarr_in) == sumdiagarr_out else "❌"))

    print("homothety_square (3x3): {result}".format(result="✅" if homothety_square(
        homothetyarr1_in, 3) == homothetyarr1_out else "❌"))

    print("homothety_square (4x4): {result}".format(result="✅" if homothety_square(
        homothetyarr2_in, 2) == homothetyarr2_out else "❌"))

    print("block_addition_square: {result}".format(result="✅" if block_addition_square(
        blockaddbig_in, blockaddsmall_in) == blockadd_out else "❌"))


test()
