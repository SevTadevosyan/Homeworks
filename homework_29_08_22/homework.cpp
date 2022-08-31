#include <iostream>


int countOfExpectedNumbers(int* arr,int length);
void countOfEachNumber(int* arr, int length);
int printDifference(int* arr, int length);
int fibonacciEven(int number);
void bubbleSort(int* arr,int length);


int main() {
        int length;
        std::cout << "Enter the length of array: ";
        std::cin >> length;
        std::cout << "Enter the numbers separated by spaces... ";
        int* arr = new int[length];
        for (int i = 0; i < length; ++i) {
                std::cin >> arr[i];
        }

        //1.
        //std::cout << "Expected numbers count is equal to " << countOfExpectedNumbers(arr, length) << std::endl;

        //2.
        //countOfEachNumber(arr, length);

        //3.
        //std::cout << "Difference is equal to: " << getDifference(arr, length) << std::endl;

        //4.
        //std::cout << fibonacciEven(4000000) << std::endl;

        //5.
        //bubbleSort(arr, length);
        //for (int i = 0; i < length; ++i) {
        //       std::cout << arr[i] << " ";
        //}

}

//1.
int countOfExpectedNumbers(int* arr,int length) {
        int count = 0;
        for (int i = 1; i < length; ++i) {
                count += *(arr + i) % i == 0;
        }
        return count;
}

//2.
void countOfEachNumber(int* arr,int length) {
        int count;
        bool* tmpArr = new bool[length];
        for (int i = 0; i < length; ++i) {
                tmpArr[i] = true;
        }
        for (int i = 0; i < length; ++i) {
                count = 1;
                if (tmpArr[i] == 0) { continue;} 
                for (int j = i + 1; j < length; ++j) {
                        if (tmpArr[j] == 0) {continue; }
                        if (arr[i] == arr[j]) {
                                ++count;
                                tmpArr[j] = 0;
                        } 
                }
                std::cout << arr[i]  << ":" << count <<  " ";
                tmpArr[i] = 0;
        }   
}

//3.

int getDifference(int* arr, int length) {
        int sumOfEvenNumbers = 0;
        int mulOfOddNumbers = 1;
        for (int i = 0; i < length; ++i) {
                if (arr[i] % 2 == 0) {
                        sumOfEvenNumbers += arr[i];
                } else {
                        mulOfOddNumbers *= arr[i];
                }
        }
        return (sumOfEvenNumbers - mulOfOddNumbers);
}

//4.
int fibonacciEven(int number) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int sum = 0;
        for (int i = 0; n3 < number; ++i) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                if (n3 % 2 == 0) {
                        sum += n3;
                }
        }
        return sum;
}

//5.
void bubbleSort(int* arr, int length) {
        int tmp;
        for (int i = 0; i < length; ++i) {
                for (int j = 0; j < length - i - 1; ++j) {
                        if (arr[j] > arr[j + 1]) {
                                tmp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = tmp;
                        }
                }
        }
}
