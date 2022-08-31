#1.
def printMaxElement():
    first = input("Enter first number: ")
    second = input("Enter second number: ")
    third = input("Enter third number: ")
    max = first
    if second > max:
        max = second
    if third > max:
        max = third
    print("The biggest number is equal to: " + max)

#2.
def printMinElement():
    first = input("Enter first number: ")
    second = input("Enter second number: ")
    third = input("Enter third number: ")
    min = first
    if second < min:
        min = second
    if third < min:
        min = third
    print("The smallest number is equal to: " + min)

#3.
def printMinElementIfTheSumIsZero():
        first = int(input("Enter first number: "))
        second = int(input("Enter second number: "))
        third = int(input("Enter third number: "))
        fourth = int(input("Enter fourth number: "))
        min = first
        sum = first + second + third + fourth
        if sum == 0:
            if second < min:
                min = second
            if third < min:
                min = third
            if fourth < min:
                min = fourth
            print("The smallest number is " + str(min))
        else:
            print("Sorry, but the sum of four numbers is not equal to 0")

#4.
def printNumbersFromZeroToHundred():
    for i in range(0, 101):
        print(i, end=' ')

#5.
def printEvenNumbersFromZeroToHundred():
    for i in range(0, 101):
        if i % 2 == 0:
            print(i, end=' ')
#6.
def printOddNumbersFromZeroToHundred():
    for i in range(0, 101):
        if i % 2 != 0:
            print(i, end=' ')
            
#7.
def swapTwoNumbersValueAndPrint():
        first = int(input("Enter first number: "))
        second = int(input("Enter second number: "))
        print("Originally first = " + str(first) + ", second = " + str(second))
        first = first + second
        second = first - second
        first = first - second
        print("After swapping first = " + str(first) + ", second = " + str(second))

#8.
def pow(num: int, degree: int):
        tmp = num
        for i in range(0, degree - 1):
            num *= tmp
        return num


def printNumbersDigits():
        count = 0
        num = int(input("Enter the number: "))
        temp = int(num)
        if num == 0:
            count = 1
        
        while temp >= 1 or temp <= -1:
            count += 1
            temp /= 10

        divider = pow(10, count - 1)
        if num < 0:
            num *= -1
            print("'-' ", end=" ")

        while count:
            print("'" + str(int(num / divider)) + "' ", end=' ')
            num %= divider
            divider /= 10
            count -= 1

#9.
def printTheSumOfNumbersDigits():
        sum = 0
        num = int(input("Enter the number... "))
        if num < 0:
            num *= -1

        while num >= 1:
            sum += num % 10
            num /= 10
        print("The sum is equal to " + str(int(sum)))

#10.
def printTheResultOfCalculator():
        operand1 = int(input("Enter first number: "))
        operand2 = int(input("Enter second number: "))
        instruction = input("Enter the instruction symbol: ")
        result = 0
        if instruction ==  '+':
            result = operand1 + operand2
        elif instruction ==  '-':
            result = operand1 - operand2
        elif instruction ==  '*':
            result = operand1 * operand2
        elif instruction ==  '/':
            result = operand1 / operand2
        else:
            print("Sorry, but you have entered invalid expression :(")
            return
        print("The result is equal to " + str(result))

#11.
def drawHouseWithLoop():
        n = 22
        for i in range(0, n):
            print("\n")
            for  j in range(0, n * 2):
                head = i <=  n / 2 - 1 and (j == n - i or j == n + i)
                foot = (i == n / 2  and j % 2 != 0) and j >= n / 2 and j <= n + n / 2
                if i <= n / 2:
                    if head or foot:
                        print('*', end='')
                    else:
                        print(' ', end='')
                else:
                    if i < n - 1:
                        if j == n / 2 or j == n + n / 2:
                            print('*', end='')
                        else:
                            print(' ', end='')
                    elif i == n - 1:
                        foot = j % 2 != 0 and j > n / 2 - 1 and j < n + n / 2 + 1
                        if foot:
                            print('*', end='')
                            continue
                        else:
                            print(' ', end='')

#12.
def drawTriangle():
    n = int(input("Enter triangle size: "))
    for i in range(0, n):
        print("")
        for j in range(0, n * 2):
            condition = i < n - 1 and (j == n - i or j == n + i) or (i == n - 1 and j % 2 != 0)
            if condition:
                print('*', end='')
            else:
                print(' ', end='')

#13.
def threeNumbersMul(first, second, third):
    print("Result is equal to " + str(first * second * third))
    return first * second * third


def main():
    #printMaxElement()
    #printMinElement()
    #printMinElementIfTheSumIsZero()    
    #printNumbersFromZeroToHundred()
    #printEvenNumbersFromZeroToHundred()
    #printOddNumbersFromZeroToHundred()
    #swapTwoNumbersValueAndPrint()
    #printNumbersDigits()
    #printTheSumOfNumbersDigits()
    #printTheResultOfCalculator()
    drawHouseWithLoop()
    #drawTriangle()
    #first = float(input("Enter first number: "))
    #second = float(input("Enter second number: "))
    #third = float(input("Enter third number: "))
    #threeNumbersMul(first,second,third)

main()
