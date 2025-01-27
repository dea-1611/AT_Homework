public class Lesson_4 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
    }

    public static void task1() {
        System.out.println("Задание 1");
        printThreeWords();
        System.out.println("\n ");
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void task2() {
        System.out.println("Задание 2");
        checkSumSign();
        System.out.println("\n ");
    }

    public static void checkSumSign() {
        int a = 682;
        int b = -935;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        printColor();
        System.out.println("\n ");
    }

    public static void printColor() {
        int value = 73;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        compareNumbers();
        System.out.println("\n ");
    }

    public static void compareNumbers() {
        int a = 963;
        int b = 369;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        boolean sumInRange = isSumInRange(8, 11);
        System.out.println("Сумма в диапазоне: " + sumInRange);
        System.out.println("\n ");
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6. Метод для проверки положительное или отрицательное число передано
    public static void task6() {
        System.out.println("Задание 6");
        printSign(-22);
        System.out.println("\n ");
    }

    public static void printSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        boolean isNegativeNumber = isNegative(98);
        System.out.println("Число отрицательное: " + isNegativeNumber);
        System.out.println("\n ");
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void task8() {
        System.out.println("Задание 8");
        printStringMultipleTimes("Llanfair_Pwllgwyngyll", 10);
        System.out.println("\n ");
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static void task9() {
        System.out.println("Задание 9");
        boolean isLeap = isLeapYear(2025);
        System.out.println("Високосный год: " + isLeap);
        System.out.println("\n ");
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    public static void task10() {
        int[] binaryArray = {1, 0, 1, 0, 1, 1, 1, 1, 0, 0};
        invertBinaryArray(binaryArray);
        System.out.println("Задание 10");
        printArray(binaryArray);
        System.out.println("\n ");
    }

    public static void invertBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }

    public static void task11() {
        int[] filledArray = fillArray(100);
        System.out.println("Задание 11");
        printArray(filledArray);
        System.out.println("\n ");
    }

    public static int[] fillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void task12() {
        int[] modifyArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifyArrayValues(modifyArray);
        System.out.println("Задание 12");
        printArray(modifyArray);
        System.out.println("\n ");
    }

    public static void modifyArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void task13() {
        int[][] squareArray = fillDiagonal(7);
        System.out.println("Задание 13");
        print2DArray(squareArray);
        System.out.println("\n ");
    }

    public static int[][] fillDiagonal(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - i - 1] = 1;
        }
        return array;
    }

    public static void task14() {
        int[] customArray = createArray(13, 0);
        System.out.println("Задание 14");
        printArray(customArray);
        System.out.println("\n ");
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    // Методы для печати массивов
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
