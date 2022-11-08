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
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача 3. Вывод реверсивного числа и суммы его цифр.");
        int num = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            sumDigits += lastDigit;
            num /= 10;
        }
        System.out.print("\nСумма всех его цифр: " + sumDigits);

        System.out.println("\n\nЗадача 4. Вывод чисел на консоль в несколько строк.");
        for (int i = 1; i < 24; i += 2) {
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
        int num5 = 3451591;
        int copyLuckNum5 = num5;
        int countOnes = 0;
        while (copyLuckNum5 > 0) {
            if (copyLuckNum5 % 10 == 1) {
                countOnes++;
            }
            copyLuckNum5 /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.printf("Число: %d содержит четное количество единиц (%d)" ,num5, countOnes);
        } else {
            System.out.printf("Число: %d содержит нечетное количество единиц (%d)",num5, countOnes);
        }

        System.out.println("\n\nЗадача 6. Отображение фигур в консоли.");
        for (int i = 1; i <= 5  ; i++) { // прямоугольник
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int symbNum = 5; // треугольник 1
        int strNum = 0;
        while (symbNum > 0) {
            while (strNum < symbNum ) {
                System.out.print("#");
                strNum++;
            }
            strNum = 0;
            symbNum--;
            System.out.println();
        }

        int row = 0; // Треугольник 2
        int count = 0;
        do {
            int elements = 0;
            do {
               System.out.print("$");
            } while (++elements <= row);
            if (++count <= 2) {
                row++;
            } else {
                row--;
            }
            System.out.println();
        } while (row >= 0);

        System.out.println("\nЗадача 7. Отображение ASCII-символов.");
        System.out.println("DEC CHAR");
        for (int i = 1; i < 48 || i < 123; i += 2) {
            System.out.printf("%3d %4c%n", i , i);
            if (i == 47) {
                i = 96;
            }
        }

        System.out.println("\nЗадача 8. Проверка, является ли число палиндромом.");
        int palindrome = 1234321;
        int reversNum = 0;
        int copyPalindrome = palindrome;
        while (palindrome != 0) {
            reversNum = reversNum * 10 + palindrome % 10;
            palindrome /= 10;
        }
        if (copyPalindrome == reversNum) {
            System.out.printf("Число: %d является палиндромом.", copyPalindrome);
        } else {
            System.out.printf("Число: %d не является палиндромом.", copyPalindrome);
        }

        System.out.println("\n\nЗадача 9. Определение, является ли число счастливым.");
        int luckNum = 133321;
        int copyLuckNum = luckNum;
        countOnes = 0;
        int sumTwo = 0;
        int digitNum = 0;
        for (int i = 1; i < 7; i++){
            digitNum = luckNum % 10;
            if (i < 4) {
                countOnes += digitNum;
            } else {
                sumTwo += digitNum;
            }
            luckNum /= 10;
        }
        if (countOnes == sumTwo) {
            System.out.printf("Число: %d является счастливым.", copyLuckNum);
        } else {
            System.out.printf("Число: %d не является счастливым.", copyLuckNum);
        }

        System.out.println("\n\nЗадача 10. Вывод таблицы умножения Пифагора.");
        System.out.println("    ТАБЛИЦА ПИФАГОРА");
        System.out.println("   |  2  3  4  5  6  7  8  9");
        System.out.println("----------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d | ", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}