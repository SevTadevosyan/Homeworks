
def countOfExpectedNumbers(arr: int):
        count = 0
        for i in range(1, len(arr)):
                if (arr[i] % i == 0):
                        count += 1
        return count

def countOfEachNumber(arr: int):
        count = 0
        newArr =  [True] * len(arr)      
        for i in range(0, len(arr)):
                count = 0
                if newArr[i] == False:
                        continue
                for j in range(0, len(arr)):
                        if newArr[j] == False:
                                continue
                        if arr[i] == arr[j]:
                                newArr[j] = False
                                count += 1
                newArr[i] = False
                print(arr[i], ":", count, " ")
                

def getDifference(arr):
        sumOfEvenNumbers = 0
        mulOfOddNumbers = 1
        for i in range(0, len(arr)):
                if arr[i] % 2 == 0:
                        sumOfEvenNumbers += arr[i]
                else:
                        mulOfOddNumbers *= arr[i]
        return (sumOfEvenNumbers - mulOfOddNumbers)


def fibonacciEven(number):
        n1 = 0
        n2 = 1
        n3 = 0
        summit = 0
        while n3 < number:
                n3 = n1 + n2
                n1 = n2
                n2 = n3
                if n3 % 2 == 0:
                        summit += n3
        return summit

def bubbleSort(arr):
        tmp = 0
        for i in range(0, len(arr)):
                for j in range(0, len(arr) - i - 1):
                        if arr[j] > arr[j + 1]:
                                tmp = arr[j]
                                arr[j] = arr[j + 1]
                                arr[j + 1] = tmp
def main():
        arr = [1,2,2,4,3,4]
        #1.
        #print("Expected numbers count is equal to ", countOfExpectedNumbers(arr))
        #2.
        #countOfEachNumber(arr)
        #3.
        #print(getDifference(arr))
        #4.
        #print(fibonacciEven(4000000))
        #5.
        #bubbleSort(arr)
        #print(arr)

main()
