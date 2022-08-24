import java.util.Scanner;  

public class homework {
        public static Scanner sc = new Scanner(System.in);    
        //1.
        public static void printMaxElement() { 
                int first, second, third;
                int max;
                System.out.print("Enter numbers separated by spaces: ");
                first = sc.nextInt();
                second = sc.nextInt();
                third = sc.nextInt();
                max = first;
                if (second > max) {
                        max = second;
                }
                if (third > max) {
                        max = third;
                }
                System.out.println("The biggest number is equal to: " + max);
         }    

        //2.
        public static void printMinElement() { 
                int first, second, third;
                int min;
                System.out.print("Enter numbers separated by spaces: ");
                first = sc.nextInt();
                second = sc.nextInt();
                third = sc.nextInt();
                min = first;
                if (second < min) {
                        min = second;
                }
                if (third < min) {
                        min = third;
                }
                System.out.println("The smallest number is equal to: " + min);
         } 

        //3.
        public static void printMinElementIfTheSumIsZero() { 
                int first, second, third, fourth;
                int min;
                System.out.print("Enter numbers separated by spaces: ");
                first = sc.nextInt();
                second = sc.nextInt();
                third = sc.nextInt();
                fourth = sc.nextInt();
                min = first;
                if (first + second + third + fourth == 0) {
                        if (second < min) {
                                min = second;
                        }
                        if (third < min) {
                                min = third;
                        }
                        if (fourth < min) {
                                min = fourth;
                        }
                        System.out.println("The smallest number is equal to: " + min);
                } else {
                        System.out.println("The sum of numbers is not equal to 0.");
                }
        } 
        //4.

        public static void printNumbersFromZeroToHundred() {
                for (int i = 0; i < 101; ++i) {
                        System.out.print(i + " ");
                }
                        System.out.println("");
        }

       //5.
        public static void printEvenNumbersFromZeroToHundred() {
                for (int i = 0; i < 101; ++i) {
                        if (i % 2 == 0) {
                                System.out.print(i + " ");
                        }
                }
                        System.out.println("");

        }

        //6.
        public static void printOddNumbersFromZeroToHundred() {
                for (int i = 0; i < 101; ++i) {
                        if (i % 2 != 0) {
                                System.out.print(i + " ");
                        }
                }
                        System.out.println("");

        }

        //7.
        public static void swapTwoNumbersValueAndPrint() {
                float first, second;
                System.out.print("Enter two numbers separated by space... ");
                first = sc.nextFloat();
                second = sc.nextFloat();
                System.out.println("Originally first = " + first + ", second = " + second);
                first = first + second;
                second = first - second;
                first = first - second;
                System.out.println("After swapping first = " + first + ", second = " + second);
        }

        //8.
        public static int pow(int num, int degree) {
                int tmp = num;
                for (int i = 0; i < degree - 1; ++i) {
                        num *= tmp;
                }
                return num;
        
        }

        public static void printNumbersDigits() {
                int num, temp, divider;
                int count = 0;
                System.out.print("Enter the number... ");
                num = sc.nextInt();
                temp = num;
                if (num == 0) {
                        count = 1;
                }
                while ( temp >= 1 || temp <= -1) {
                        ++count;
                        temp /= 10;
                }
                divider = pow(10, count - 1);
                if (num < 0) {
                        num *= -1;
                        System.out.print("'-' ");
                }
                while (count > 0) {
                        System.out.print("'" + num / divider + "' ");
                        num %= divider;
                        divider /= 10;
                        --count;
                }
        }

        //9.
        public static void printTheSumOfNumbersDigits() {
                int num, sum = 0;
                System.out.print("Enter the number... ");
                num = sc.nextInt();
                while (num >= 1) {
                        sum += num % 10;
                        num /= 10;
                }
                System.out.println("The sum is equal to " + sum);
        }
        
        //10.
        public static void printTheResultOfCalculator() {
                double operand1, operand2, result;
                String instruction;
                System.out.print("Enter expression like this '4 + 5'... ");
                operand1 = sc.nextFloat();
                instruction = sc.next();
                operand2 = sc.nextFloat();
                switch (instruction) {
                        case "+":
                                result = operand1 + operand2;
                                break;
                        case "-":
                                result = operand1 - operand2;
                                break;
                        case "*":
                                result = operand1 * operand2;
                                break;
                        case "/":
                                result = operand1 / operand2;
                                break;
                        default:
                                System.out.println("Sorry, but you have entered invalid expression :(");
                                return;
                }
                System.out.println("The result is equal to " + result);
        }

        //11.
        public static void drawHouseWithLoop() {
                int n = 10;
                boolean head, foot;
                for (int i = 0; i < n; ++i) {
                        for (int j = 0; j < n * 2; ++j) {
                                head = (i <=  n / 2 - 1 && (j == n - i || j == n + i));
                                foot = ((i == n / 2  && j % 2 != 0) && j >= n / 2 && j <= n + n / 2);

                                if (i <= n / 2 ) {
                                        if (head || foot) {
                                                System.out.print("*");
                                        } else {
                                                System.out.print(" ");
                                        }
                                } else {
                                        if (i < n - 1) {
                                                if (j == n / 2 || j == n + n / 2) {
                                                        System.out.print("*");
                                                } else {
                                                        System.out.print(" ");
                                                }
                                        } else if (i == n - 1) {
                    
                                                foot = j % 2 != 0 && j > n / 2 - 1 && j < n + n / 2 + 1;
                    
                                                if (foot) {
                                                        System.out.print("*");
                                                        continue;
                                                } else {
                                                        System.out.print(" ");
                                                }
                                        }
                                }
                        }
                        System.out.println("");
                }       
        }
        
        //12.
        public static void drawTriangle() {
                int n = 10;
                boolean head;
                for (int i = 0; i < n; ++i) {
                        for (int j = 1; j < n * 2; ++j) {
                                head = (i < n - 1 && (j == n - i || j == n + i) || (i == n - 1 && j % 2 != 0));
                                if (i == n - 1 && j % 2 != 0) {
                                        System.out.print("*");
                                        continue;
                                }
                                if (j == n - i) {
                                        System.out.print("*");
                                } else if (j == n + i) {
                                        System.out.print("*");
                                } else {
                                        System.out.print(" ");
                                }
                        }
                        System.out.println("");
                }
        }

        // 13.
        public static double threeNumbersMul(float first, float second, float third) {
                System.out.print("Result is equal to " + first * second * third);
                return first * second * third;
        }
        
        public static void main(String[] argc) {
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
                // drawHouseWithLoop();
                // drawTriangle();
                // float first, second, third;
                // System.out.print("Enter three numbers separated by spaces...");
                // first = sc.nextFloat();
                // second = sc.nextFloat();
                // third = sc.nextFloat();
                // threeNumbersMul(first, second, third);
        }
}
