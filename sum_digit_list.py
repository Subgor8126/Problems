def sum_digit_list(arr1, arr2):

    num1 = ""
    num2 = ""
    arr3 = []
# arr1[i] + arr2[i]
    for i in range(len(arr1)):
        num1+=str(arr1[i])
    for j in range(len(arr2)):
        num2+=str(arr2[j])
    sum = int(num1)+int(num2)
    sum = str(sum)
    for k in range(len(sum)):
        arr3+=sum[k]
        arr3[k] = int(arr3[k])
    return arr3
