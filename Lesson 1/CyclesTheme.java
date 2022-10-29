public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Задача 1. Подсчет суммы четных и нечетных чисел.");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven 
                + ", а нечетных = " + sumOdd);

        System.out.println("\nЗадача 2. Вывод чисел в интервале (min и max) в порядке убывания.");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = b;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (a < min) {
            min = a;
            }
        if (c < min) {
            min = c;
        }
        /*if (a > b && a > c) {  // поиск макс числа
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else if (c > a && c > b) {
            max = c;
        }
        if (a < 0 && a < b && a < c) {  // поиск мин числа
            min = a;
        } else if (b < 0 && b < a && b < c) {
            min = b;
        } else if (c < 0 && c < a && c < b) {
            min = c;
        }*/
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача 3. Вывод реверсивного числа и суммы его цифр.");
        int num = 1234;
        int numSumm = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (num > 0) {
            System.out.print(num % 10);
            numSumm += num % 10;
            num /= 10;
        }
        System.out.print("\nСумма всех его цифр: " + numSumm);

        System.out.println("\n\nЗадача 4. Вывод чисел на консоль в несколько строк.");
        for ( int i = 1; i < 24; i += 2) {
            for (int j = 1; j <= 5; j++) {
                if (i < 24) {
                    System.out.printf("%3d", i);
                } else {
                    System.out.printf("%3d", 0);
                }
                i += 2;
                }
                i -= 2;
                System.out.println();
        }

        System.out.println("\nЗадача 5. Проверка количества единиц на четность.");
        int originalNum = 3111591;
        int copyScrNum = originalNum;
        int countOne = 0;
        while (copyScrNum > 0) {
             if (copyScrNum % 10 > 0) {
                countOne++;
             }
            copyScrNum /= 10;
        }
        if (countOne % 2 == 0) {
            System.out.printf("Число: %d содержит \"%d\" четное количество единиц", 
                    originalNum, countOne);
            } else {
                System.out.printf("Число: %d содержит \"%d\" нечетное количество единиц", 
                        originalNum, countOne);
            }

        System.out.println("\n\nЗадача 6. Отображение фигур в консоли.");
        for (int i = 1; i <= 5  ; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        int symbNum = 5;
        int symbNum1 = 0;
        while (symbNum > 0) {
            while (symbNum1 < symbNum ) {
                System.out.print("#");
                symbNum1++;
            }
        symbNum1 = 0;
        symbNum--;
        System.out.println();
        }
        int i = 1;
        symbNum = 1;
        do {
            do {
                System.out.print("$");
                symbNum++;
            } while (symbNum <= i);
        symbNum = 1;
        i++;
        System.out.println();
        } while (i <= 3);
        do {
            System.out.print("$");
            symbNum++;
        } while (symbNum < 3);
        System.out.println("\n$");

        System.out.println("\nЗадача 7. Отображение ASCII-символов.");
        System.out.println("DEC CHAR");
        for (i = 1; i < 48 || i < 123; i += 2) {
            System.out.printf("%3d %4c%n", i , (char) i);
            if (i == 47) {
                i = 96;
            }
        }

        System.out.println("\nЗадача 8. Проверка, является ли число палиндромом.");
        int numPalindrome = 1234321;
        int lastNum = 0;
        int reversNum = 0;
        int original_Num = numPalindrome;
        while (numPalindrome != 0) {
            lastNum = numPalindrome % 10;
            reversNum = reversNum*10 + lastNum;
            numPalindrome = numPalindrome / 10;
        }
        if (original_Num == reversNum) {
            System.out.printf("Число: %d является палиндромом.", original_Num);
        } else {
            System.out.printf("Число: %d не является палиндромом.", original_Num);
        }

        System.out.println("\n\nЗадача 9. Определение, является ли число счастливым.");
        int luckNum = 143321;
        int luck_Num = luckNum;
        countOne = 0;
        int sumTwo = 0;
        lastNum = 0;
        for (i = 1; i < 4; i++){
            lastNum = luckNum % 10;
            countOne = countOne + lastNum;
            luckNum = luckNum / 10;
        }
        for (int j = 1; j < 4; j++) {
            lastNum = luckNum % 10;
            sumTwo = sumTwo + lastNum;
            luckNum = luckNum / 10;
        }
        if (countOne == sumTwo) {
            System.out.printf("Число: %d является счастливым.", luck_Num);
        } else {
            System.out.printf("Число: %d не является счастливым.", luck_Num);
        }

        System.out.println("\n\nЗадача 10. Вывод таблицы умножения Пифагора.");
        System.out.println("    ТАБЛИЦА ПИФАГОРА");
        System.out.println("   |  2  3  4  5  6  7  8  9");
        System.out.println("----------------------------");
        for (i = 2; i < 10; i++) {
            System.out.printf("%2d | ", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }


    }
}