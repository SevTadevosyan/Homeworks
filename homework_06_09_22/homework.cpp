#include <iostream>
#include <vector>
#include <map>
//1.
int binarySearchIterative(std::vector<int>& arr, int target);
int binarySearchRecursive(std::vector<int>& arr, int target, int begin, int end);

//2.
int _strlen(char* str);

//3.
void reverse(char* str);

//4.
void to_upper_case(char* str);

//5.
int _add(int op1, int op2);
int _sub(int op1, int op2);
int _mul(int op1, int op2);
int _div(int op1, int op2);

//6.
char* _strcat(char* s1, char* s2);

//7.
void _strset(char* s, char ch);

//8.
void _strmove(char* s, int n);



int main() {
        //int target;
        //int begin = 0;
        //int end;
        //std::vector<int> arr = {1,2,3,4,5,6,7,8,9,10};
        //end = arr.size() - 1;
        //std::cin >> target;

        //1.
        //std::cout << binarySearchIterative(arr, target) << std::endl;
        //std::cout << binarySearchRecursive(arr, target, begin, end) << std::endl;

        //2.
        /*
        char* str = new char[100];
        std::cin.getline(str, 100);
        std::cout << _strlen(str) << std::endl;
        //char ch;
        //std::cin >> ch;
        //_strset(str, ch);

        //3.
        //reverse(str);

        //4.
        //to_upper_case(str);

        //5.
        int op1;
        int op2;
        char ins;
        std::cout << "Enter operands separated by spaces: ";
        std::cin >> op1 >> op2;
        std::cout << "Enter instruction character: ";
        std::cin >> ins;
        std::map<char, int> functionMap;
        //int (*add)(int, int) = _add;
        //int (*sub)(int, int) = _sub;
        functionMap['+'] = _add(op1,op2);
        functionMap['-'] = _sub(op1,op2);
        functionMap['*'] = _mul(op1,op2);
        functionMap['/'] = _div(op1,op2);
        std::cout << functionMap[ins];
        */

        //6.
        //char* s1 = new char[100];
        //std::cin.getline(s1); 
        //char* s2 = new char[100];
        //std::cin.getline(s2);
        //std::cout << s1 << std::endl;
        //std::cout << s2 << std::endl;
        //s1 = _strcat(s1, s2);
        //std::cout << s1 << std::endl;

        //8.
        //_strmove(str, 7);

        //for (int i = 0; i < 13; ++i) {
        //        std::cout << str[i];
        //}

        //delete [] str;
        //delete [] s1;
        //delete [] s2;
}

//1.
int binarySearchIterative(std::vector<int>& arr, int target) {
        int begin = 0;
        int end = arr.size() - 1;
        int mid = -1;
        while (begin <= end) {
                mid = (begin + end) / 2;
                if (target == arr[mid]) {
                        return mid;
                } 
                if (target < arr[mid]) {
                        end = mid - 1;
                } else {
                        begin = mid + 1;
                }
        }
        return mid;
}

int binarySearchRecursive(std::vector<int>& arr, int target, int begin, int end) {
        int mid = -1;
        if (begin <= end) {
                mid = (begin + end) / 2;
                if (target == arr[mid]) {
                        return mid;
                }
                if (target < arr[mid]) {
                        end = mid - 1;
                        return binarySearchRecursive(arr, target, begin, end);
                } else {
                        begin = mid + 1;
                        return binarySearchRecursive(arr, target, begin, end);
                }
        }
        return mid;
}

//2.
int _strlen(char* str) {
        int count = 0;
        while (str[count] != '\0') {
                ++count;
        }
        return count;
}

//3.
void reverse(char* str) {
        int length = _strlen(str);
        char tmp;
        for (int i = 0; i < length / 2; ++i) {
                tmp = str[i];
                str[i] = str[length - i];
                str[length - i] = tmp;
        }
}

//4.
void to_upper_case(char* str) {
        int length = _strlen(str);
        char tmp;
        for (int i = 0; i < length; ++i) {
                if (str[i] >= 97 && str[i] <= 122) {
                        str[i] -= 32;
                }
        }
}

//5.
int _add(int op1, int op2) {
        
        return op1 + op2;
}

int _sub(int op1, int op2) {
        return op1 - op2;
}

int _mul(int op1, int op2) {
        return op1 * op2;
}

int _div(int op1, int op2) {
        if (op2 != 0) {
                return op1 / op2;
        }
        std::cout << "C++ does not divide a number by zero, unlike JS or Python";
        return 0;
}

//6.
char* _strcat(char* s1, char* s2) {
        int size1 = _strlen(s1);
        int size2 = _strlen(s2);
        for (int i = 0; i < size2; ++i) {
                s1[size1 + i] = s2[i];
        }
        return s1;
}

//7.
void _strset(char* s, char ch) {
        int length = _strlen(s);
        for (int i = 0; i < length; ++i) {
                s[i] = ch;
        }
}

//8.
void _strmove(char* str, int n) {
        int length = _strlen(str);
        int count = n % length;
        char tmp;
        for (int i = 0; i < count; ++i) {
                tmp = str[length - 1];
                for (int j = length - 1; j > 0; --j) {
                        str[j] = str[j - 1];
                }
                str[0] = tmp;
        }
}



