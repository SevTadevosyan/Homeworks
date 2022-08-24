//1.
function printMaxElement() {
        let first = 10
        let second = 20
        let third = 30
        let max = first
        if (second > max) {
                max = second
        } 
        if (third > max) {
                max = third
        }
        console.log("The biggest number is equal to: " + max)
}

//2.
function printMinElement() {
        let first = -1
        let second = -2
        let third = 1
        let min = first
        if (second < min) {
                min = second
        }
        if (third < min) {
                min = third
        }
        console.log("The smallest number is equal to: " + min)
}

//3.
function printMinElementIfTheSumIsZero() {
        let first = 1
        let second = 2
        let third = -1 
        let fourth = -2
        let min = first
        if (first + second + third + fourth == 0) {
                if (second < min) {
                        min = second
                }
                if (third < min) {
                        min = third
                }
                if (fourth < min) {
                        min = fourth
                }
                console.log("The smallest number is equal to: " + min)
        } else {
                console.log("Sorry, but the sum of four numbers is not equal to 0")
        }

}

//4.
function printNumbersFromZeroToHundred() {
        for (let i = 0; i < 101; ++i) {
              process.stdout.write(i + " ")
        }
}

//5.
function printEvenNumbersFromZeroToHundred() {
        for (let i = 0; i < 101; ++i) {
                if (!(i % 2)) {
                       process.stdout.write(i + " ")
                }
        }
}

//6.
function printOddNumbersFromZeroToHundred() {
         for (let i = 0; i < 101; ++i) {
                if (i % 2) {
                       process.stdout.write(i + " ")
                }
        }
}

//7.
function swapTwoNumbersValueAndPrint() {
        let first = 10
        let second = 20
        console.log("Originally first = " + first + ", second = " + second)
        first = first + second
        second = first - second
        first = first - second
        console.log("After swapping first = " + first + ", second = " + second)
}

//8.
function  pow(num, degree) {
        let tmp = num
        for (let i = 0; i < degree - 1; ++i) {
                num *= tmp
        }
        return num;
}

function printNumbersDigits() {
        let num = 5479
        let  temp = num
        let divider = 0
        let count = 0
        if (num == 0) {
                count = 1
        }
        while ( temp >= 1 || temp <= -1) {
                ++count;
                temp /= 10;
        }
        divider = pow(10, count - 1);
        if (num < 0) {
                num *= -1
                console.log("'-'" + " ") 
        }
        while (count) {
               process.stdout.write("'" + parseInt(num / divider) + "' ")
                num %= divider
                divider /= 10
                --count
        }
}

//9.
function printTheSumOfNumbersDigits() {
        let num = 123
        let sum = 0
        
        if (num < 0) {
            num *= -1
        }
        while (num >= 1) {
                sum += num % 10
                num /= 10
        }
        console.log("The sum is equal to " + parseInt(sum))
}


//10.
function printTheResultOfCalculator() {
        let operand1 = 10
        let instruction = '+'
        let operand2 = 20
        let result
        switch (instruction) {
                case '+':
                        result = operand1 + operand2
                        break
                case '-':
                        result = operand1 - operand2
                        break
                case '*':
                        result = operand1 * operand2
                        break
                case '/':
                        result = operand1 / operand2
                        break
                default:
                        console.log("Sorry, but you have entered invalid expression :(")
                        return
        }
        console.log("The result is equal to " + result)
}

//11.
function drawHouseWithLoop() {
    let n = 10
    let head
    let foot
    for (let i = 0; i < n; ++i) {
        for (let j = 0; j < n * 2; ++j) {
            
            head = i <=  n / 2 - 1 && (j == n - i || j == n + i)
            foot = (i == n / 2  && j % 2 != 0) && j >= n / 2 && j <= n + n / 2
            
            if (i <= n / 2 ) {
                if (head || foot) {
                        process.stdout.write("*") 
                } else {
                        process.stdout.write(" ")  
                }
            } else {
                if (i < n - 1) {
                        if (j == n / 2 || j == n + n / 2) {
                                process.stdout.write("*")        
                        } else {
                                process.stdout.write(" ") 
                        }
                } else if (i == n - 1) {
                    
                    foot = j % 2 != 0 && j > n / 2 - 1 && j < n + n / 2 + 1;
                    
                        if (foot) {
                                process.stdout.write("*")
                                continue;
                        } else {
                                process.stdout.write(" ")  
                        }
                }
            }
        }
        console.log("")
    }
}

//12.
function drawTriangle() {
    let n = 15
    for (let i = 0; i < n; ++i) {
        for (let j = 1; j < n * 2; ++j) {
                if (i < n - 1 && (j == n - i || j == n + i) || (i == n - 1 && j % 2 != 0)) {
                        process.stdout.write('*')
                } else {
                        process.stdout.write(" ")
                }
        }
       console.log("")
    }
}

//13.
function threeNumbersMul(first, second, third) {
    console.log("Result is equal to " + first * second * third)
    return first * second * third
}

function main() {
        // printMaxElement()
        // printMinElement()
        // printMinElementIfTheSumIsZero()
        // printNumbersFromZeroToHundred()
        // printEvenNumbersFromZeroToHundred()
        // printOddNumbersFromZeroToHundred()
        // swapTwoNumbersValueAndPrint()
        // printNumbersDigits()
        // printTheSumOfNumbersDigits()
        // printTheResultOfCalculator()
        // drawHouseWithLoop()
        // drawTriangle()
        // let first = 10
        // let second = 20
        // let third = 30
        // threeNumbersMul(first, second, third)
}


main()
