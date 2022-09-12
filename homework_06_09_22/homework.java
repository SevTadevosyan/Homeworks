import java.util.*;

public class Homework {
        public static Scanner sc = new Scanner(System.in);

        static char[] toCharArray(String str, int length) {
                char[] arr = new char[length];
                for (int i = 0; i < str.length(); ++i) {
                        arr[i] = str.charAt(i);
                }
                arr[str.length()] = '\0';
                return arr;
        }

        public static void main(String argc[]) {
                //1.
                /*
                System.out.print("Enter array size: ");
                int size = sc.nextInt();
                System.out.print("Enter array elements: ");
                int[] arr = new int[size];
                for (int i = 0; i < size; ++i) {
                        arr[i] = sc.nextInt();
                }
                System.out.print("Enter target: ");
                int target = sc.nextInt();
                int begin = 0;
                int end = size - 1;
                //int res = binarySearchIterative(arr, size, target);
                int res = binarySearchRecursive(arr, size, target, begin, end);
                System.out.println("The index is: " + res);
                */

                //3. - //4.
                /*
                int n;
                System.out.print("Enter string length: ");
                n = sc.nextInt();
                char[] str = new char[n + 1];
                for (int i = 0; i < n ; ++i) {
                        str[i] = sc.next().charAt(0);
                }
                str[n] = '\0';
                System.out.println(str);
                //3
                //reverse(str);
                //4
                to_upper_case(str);
                System.out.println(str);
                */

                //5.
                /*
                System.out.print("Enter operands separated by space: ");
                Double op1 = sc.nextDouble();
                Double op2 = sc.nextDouble();
                System.out.print("Enter valid(+,-,*,/) instruction character: ");
                Character inst = sc.next().charAt(0);
                Map<Character, Double> map = new HashMap<Character, Double>();
                map.put('+', _add(op1, op2));
                map.put('-', _sub(op1, op2));
                map.put('*', _mul(op1, op2));
                map.put('/', _div(op1, op2));
                System.out.println(map.get(inst));
                */

                //6.
                /*
                String s1 = sc.nextLine();
                String s2 = sc.nextLine();
                int length = s1.length() + s2.length();
                char[] str1 = new char[length + 1];
                char[] str2 = new char[s2.length() + 1];
                str1 = toCharArray(s1, length + 1);
                str2 = toCharArray(s2, s2.length() + 1);
                _strcat(str1, str2);
                System.out.println(str1);
                */

                //7. - //8.
                /*
                String s = sc.nextLine();
                char[] str = new char[s.length() + 1];
                int n = sc.nextInt();
                str = toCharArray(s, s.length() + 1);
                //char ch = sc.next().charAt(0);
                //_strset(str, ch);
                _strmove(str, n);
                System.out.println(str);
                */
        }

        //1.
        static int binarySearchIterative(int[] arr,int size, int target) {
                int begin = 0;
                int end = size - 1;
                int mid = -1;
                while (begin <= end) {
                        mid = (begin + end) / 2;
                        if (arr[mid] == target) {
                                return mid;
                        }
                        if (arr[mid] < target) {
                                begin = mid + 1;
                        } else {
                                end = mid - 1;
                        }
                }
                return mid;
        }

        static int binarySearchRecursive(int arr[], int size, int target, int begin, int end) {
                int mid = -1;
                if (begin <= end) {
                        mid = (begin + end) / 2;
                        if (arr[mid] == target) {
                                return mid;
                        }
                        if (arr[mid] < target) {
                                begin = mid + 1;
                                return binarySearchRecursive(arr, size, target, begin, end);
                        } else {
                                end = mid - 1;
                                return binarySearchRecursive(arr, size, target, begin, end);
                        }
                }
                return mid;
        }
        

        //2.
        static void reverse(char[] str) {
                int length = _strlen(str);
                char tmp = ' ';
                for (int i = 0; i < length / 2; ++i) {
                        tmp = str[i];
                        str[i] = str[length - i - 1];
                        str[length - i - 1] = tmp;
                }
        }
        
        //3.
        static int _strlen(char[] str) {
                int count = 0;
                while (str[count] != '\0') {
                        ++count;
                }
                return count;
        }

        //4.
        static void to_upper_case(char[] str) {
                for (int i = 0; str[i] != '\0'; ++i) {
                        if (str[i] >= 97 && str[i] <= 122) {
                                str[i] -= 32;
                        }
                }
        }

        //5.
        static Double _add(Double op1, Double op2) {
                return op1 + op2;
        }

        static Double _sub(Double op1, Double op2) {
                return op1 - op2;
        }

        static Double _mul(Double op1, Double op2) {
                return op1 * op2;
        }

        static Double _div(Double op1, Double op2) {
                if (op2 != 0) {
                        return op1 / op2;
                }
                System.out.println("Division by zero!");
                return 0.0;
        }
        
        //6.
        static void _strcat(char[] str1, char[] str2) {
                int length1 = _strlen(str1);
                int length2 = _strlen(str2) - 1;
                for (int i = 0; i <= length2 ; ++i) {
                        str1[length1 + i] = str2[i];
                }      
        }
        
        //7.
        static void _strset(char[] str, char ch) {
                int length = _strlen(str);
                for (int i = 0; i < length; ++i) {
                        str[i] = ch;
                }
        }

        static void _strmove(char[] str, int n) {
                int length = _strlen(str);
                int count = n % (length);
                char tmp;
                for (int i = 0; i < count; ++i) {
                        tmp = str[length - 1];
                        for (int j = 0; j < length - 1; ++j) {
                                str[length - 1 - j] = str[length - 2 - j];
                        }
                        str[0] = tmp;
                }
        }
}
