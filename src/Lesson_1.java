import java.util.Arrays;

public class Lesson_1 {

    public static void main(String[] args) {

        // Task 1
        int number = 5, number2 = 7;
        System.out.println(getMax(number, number2));

        // Task 2
        int arr[] = new int[10];
        fillArray(arr);
        System.out.println(Arrays.toString(arr));

        //Task 3
        float a[] = {3.1213f, 4.666f, 72.98766f};
        printRoundArray(a);

        System.out.println(sumOfNumber(130099));

    }

    // Task 1
    public static int getMax(int a, int b) {
        System.out.println("Task Max Value");
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //Task 2
    public static void fillArray(int a[]) {
        System.out.println("Task Fill Array");
        for (int i = 0; i < a.length; i++) {
            a[i] += i + 1;
        }
    }

    //Task 3
    public static void printRoundArray(float arr[]) {
        System.out.println("Task Print Round Array");
        if (arr == null) {
            System.out.println("Array is Null");
        } else {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                float temp = arr[i];
                System.out.printf("%1.2f", temp);
                System.out.print(i < arr.length - 1 ? "; " : "");
            }
            System.out.print("]");
        }
        System.out.println();
    }

    // Task 4
    public static int sumOfNumber(int number) {
        System.out.println("Task Sum of Number");
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}
