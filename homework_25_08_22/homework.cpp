#include <iostream>
// 1.Print the biggest number from three members
void printMaxElement() {
        double first, second, third;
        double max;
        std::cout << "Enter three numbers separated by spaces... ";
        std::cin >> first >> second >> third;
        max = first;
        if (second > max) {
                max = second;
        }
        if (third > max) {
                max = third;
        } 
        std::cout << "The biggest number is " << max << std::endl;
}

// 2.Print the smallest number from three members

void printMinElement() {
        double first, second, third;
        double min;
        std::cout << "Enter three numbers separated by spaces... ";
        std::cin >> first >> second >> third;
        min = first;
        if (second < min) {
                min = second;
        }
        if (third < min) {
                min = third;
        } 
        std::cout << "The smallest number is " << min << std::endl;
}

// 3.Print the smallest number if all numbers sum is equal to 0

void printMinElementIfTheSumIsZero() {
        double first, second, third, fourth;
        double min;
        std::cout << "Enter four numbers separated by spaces... ";
        std::cin >> first >> second >> third >> fourth;
        min = first;
        if (!(first + second + third + fourth)) {
                if (second < min) {
                        min = second;
                }
                if (third < min) {
                        min = third;
                } 
                if (fourth < min) {
                        min = fourth;
                }
                std::cout << "The smallest number is " << min << std::endl;
        } else {
                std::cout << "Sorry, but the sum of four numbers is not equal to 0" << std::endl;
        }
}

// 4.Print the numbers from zero to hundred in ascending order

void printNumbersFromZeroToHundred() {
        for (int i = 0; i < 101; ++i) {
                std::cout << i << " ";
        }
        std::cout << std::endl;
}

// 5.Print even numbers from zero to hundred

void printEvenNumbersFromZeroToHundred() {
        for (int i = 0; i < 101; ++i) {
                if (!(i % 2)) {
                        std::cout << i << " ";
                }
        }
        std::cout << std::endl;
}

// 6.Print odd numbers from zero to hundred

void printOddNumbersFromZeroToHundred() {
        for (int i = 0; i < 101; ++i) {
                if (i % 2) {
                        std::cout << i << " ";
                }
        }
        std::cout << std::endl; 
}

// 7.Declare two numbers swap their values and print on screen.

void swapTwoNumbersValueAndPrint() {
        double first, second;
        std::cout << "Enter two numbers separated by space... ";
        std::cin >> first >> second;
        std::cout << "Originally first = " << first << ", second = " << second << std::endl;
        first = first + second;
        second = first - second;
        first = first - second;
        std::cout << "After swapping first = " << first << ", second = " << second << std::endl;
}

// 8. Print number's digits

int pow(int num, int degree) {
        int tmp = num;
        for (int i = 0; i < degree - 1; ++i) {
                num *= tmp;
        }
        return num;
}

void printNumbersDigits() {
        int num, temp, divider;
        int count = 1;
        std::cout << "Enter the number... ";
        std::cin >> num;
        temp = num;
        while ( temp > 1 || temp < -1) {
                ++count;
                temp /= 10;
        }
        divider = pow(10, count - 1);
        if (num < 0) {
                num *= -1;
                std::cout << "'-' "; 
        }
        while (count) {
                std::cout << "'" << num / divider << "' ";
                num %= divider;
                divider /= 10;
                --count;
        }
}

// 9. Print the sum of number's digits.

void printTheSumOfNumbersDigits() {
        int num, sum = 0;
        std::cout << "Enter the number... ";
        std::cin >> num;
        num = num > 0 ? num : -num; 
        while (num >= 1) {
                sum += num % 10;
                num /= 10;
        }
        std::cout << "The sum is equal to " << sum;
}

// 10. Print th result of expression.

void printTheResultOfCalculator() {
        double operand1, operand2, result;
        char instruction;
        std::cout << "Enter expression like this '4 + 5'... ";
        std::cin >> operand1 >> instruction >> operand2;
        switch (instruction) {
                case '+':
                        result = operand1 + operand2;
                        break;
                case '-':
                        result = operand1 - operand2;
                        break;
                case '*':
                        result = operand1 * operand2;
                        break;
                case '/':
                        result = operand1 / operand2;
                        break;
                default:
                        std::cout << "Sorry, but you have entered invalid expression :(" << std::endl;
                        return;
        }
        std::cout << "The result is equal to " << result << std::endl;
}

// 11. Draw house using symbols

void drawHouse() {
        int n;
        std::cin >> n;
        bool head, foot, wall;
        for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n * 2; ++j) {
                        head = i < n / 2 && (j == n - i || j == n + i);
                        foot = (i == n / 2 || i == n - 1) && (j % 2 == 0 && (j >= n / 2 && j <= n + n / 2));
                        wall = (i > n / 2 && i < n - 1) && (j == n / 2 || j == n + n / 2);
                        if (head || foot || wall) {
                                std::cout << "*";
                        } else {
                                std::cout << " ";
                        }
                }
                std::cout << std::endl;
        }
}


// 12. Draw triangle.

void drawTriangle() {
    int n;
    std::cout << "Enter triangle size: ";
    std::cin >> n;
    for (int i = 0; i < n; ++i) {
        for (int j = 1; j < n * 2; ++j) {
            if (i < n - 1 && (j == n - i || j == n + i) || (i == n - 1 && j % 2 != 0)) {
                std::cout << '*';
            } else {
                std::cout << " ";
            }
        }
        std::cout << std::endl;
    }
}

// 13. Function that return three arguments' multiplication.

double threeNumbersMul(double first, double second, double third) {
    std::cout << "Result is equal to " << first * second * third;
    return first * second * third;
}



int main() {
    // printMaxElement();
    // printMinElement();
    // printMinElementIfTheSumIsZero();
    // printNumbersFromZeroToHundred();
    // printEvenNumbersFromZeroToHundred();
    // printOddNumbersFromZeroToHundred();
    // swapTwoNumbersValueAndPrint();
    // printNumbersDigits();
    // printTheSumOfNumbersDigits();
    // printTheResultOfCalculator();
     //drawHouse();
     drawTriangle();
    // double first, second, third;
    // std::cout << "Enter three numbers separated by spaces...";
    // std::cin >> first >> second >> third;
    // threeNumbersMul(first, second, third);
    // drawHouseWithLoop();
}
