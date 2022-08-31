import java.util.Scanner;

public class homework {
        public static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
                /*
                System.out.print("Enter array length: ");
                int length = sc.nextInt();
                Integer[] arr = new Integer[length];
                for (int i = 0; i < length; ++i) {
                        arr[i] = sc.nextInt();
                }
                */
                //1.
                // int count = countOfExpectedNumbers(arr, length);
                // System.out.println("Expected pairs count = " + count); 

                //2.
                //countOfEachNumber(arr, length);

                //3.
                //int count = getDifference(arr, length);
                //System.out.print("Difference = " + count);
                
                //4.
                //int result = fibonacciEven(4000000);
                //System.out.print(result);

                //5.
                //bubbleSort(arr, length);
                //for (int i = 0; i < length; ++i) {
                //        System.out.print(arr[i] + " ");
                //}
        }

        static int countOfExpectedNumbers(Integer[] arr,int length) {
                int count = 0;
                for (int i = 1; i < length; ++i) {
                        count += arr[i] % i == 0 ? 1 : 0;                        
                }
                return count;
        }

        static void countOfEachNumber(Integer[] arr,int length) {
                int count;
                boolean[] newArr = new boolean[length];
                for (int i = 0; i < length; ++i) {
                        newArr[i] = true;
                }
                for (int i = 0; i < length; ++i) {
                        count = 0;
                        if (newArr[i] == false) { continue;}
                        for (int j = 0; j < length; ++j) {
                                if (newArr[j] == false) {continue;}
                                if (arr[i] == arr[j]) {
                                        ++count;
                                        newArr[j] = false;
                                }
                        }
                        System.out.print(arr[i] + ":" + count + " ");
                }
        }
        
        static int getDifference(Integer[] arr,int length) {
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
        
        static int fibonacciEven(int number) {
                int n1 = 0;
                int n2 = 1;
                int n3 = 0;
                int tmp;
                int sum = 0;
                for (int i = 0; n3 < number; ++i) {
                        n3 = n1 + n2;
                        tmp = n1;
                        n1 = n2;
                        n2 = n3;
                        if (n3 % 2 == 0) {
                                sum += n3;
                        }
                }
                return sum;
        }

        static void bubbleSort(Integer[] arr, int length) {
                int tmp;
                for (int i = 0; i < length; ++i) {
                        for (int  j = 0; j < length - i - 1; ++j) {
                                if (arr[j] > arr[j + 1]) {
                                        tmp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = tmp;
                                }
                        }
                }
        }
}
