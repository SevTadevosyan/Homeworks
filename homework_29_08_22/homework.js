function countOfExpectedNumbers(arr) {
        let count = 0;
        for (let i = 1; i < arr.length; ++i) {
                if (arr[i] % i == 0) {
                        ++count;
                }
        }
        return count;

}


function countOfEachNumber(arr) {
        let newArr = Array(arr.length).fill(true)
        for (let i = 0; i < arr.length; ++i) {
                count = 0;
                if (newArr[i] == false) {continue}
                for (let j = 0; j < arr.length; ++j) {
                        if (newArr[j] == false) {continue}
                        if (arr[i] == arr[j]) {
                                ++count
                                newArr[j] = false
                        }
                }
                newArr[i] = false
                process.stdout.write(arr[i] + ":" + count + " ")
        }
}

function getDifference(arr) {
        let sumOfEvenNumbers = 0
        let mulOfOddNumbers = 1
        for (let i = 0; i < arr.length; ++i) {
                if (arr[i] % 2 == 0) {
                        sumOfEvenNumbers += arr[i]
                } else {
                        mulOfOddNumbers *= arr[i]
                }
        }
        return (sumOfEvenNumbers - mulOfOddNumbers)
}

function fibonacciEven(number) {
        let n1 = 0
        let n2 = 1
        let n3 = 0
        let sum = 0
        for (let i = 0; n3 < number; ++i) {
                n3 = n1 + n2
                n1 = n2
                n2 = n3
                if (n3 % 2 == 0) {
                        sum += n3
                }
        }
        return sum
}

function bubbleSort(arr) {
        let tmp = 0
        for (let i = 0; i < arr.length; ++i) {
                for (let j = 0; j < arr.length - i - 1; ++j) {
                        if (arr[j] > arr[j + 1]) {
                                tmp = arr[j]
                                arr[j] = arr[j + 1]
                                arr[j + 1] = tmp
                        }
                }
        }
}


function main() {
        let arr = [1,1,3,8,2,4]
        //1.
        //let count = countOfExpectedNumbers(arr)
        //console.log("Count of pairs = " + count)

        //2.
        //countOfEachNumber(arr)

        //3.
        //console.log("Difference = " + getDifference(arr))

        //4.
        //console.log("Sum of even numbers in fibonacci = " + fibonacciEven(4000000))

        //5.
        //bubbleSort(arr)
        //console.log(arr)
}



main()
