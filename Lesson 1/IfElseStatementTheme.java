public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Задача 1. Перевод псевдокода на язык Java.\n");
        int age = 35;
        if(age > 20) {
            System.out.println("Персонаж старше 20 лет");
        } else {
            System.out.println("Персонаж младше 20 лет");
        }
        String gender = "male";
        if(!(String.valueOf(gender) == "male")) {
            System.out.println("Персонаж мужчина");
        } else {
            System.out.println("Персонаж другого пола");
        }
        float height = 1.92f;
        if(height <= 1.80) {
            System.out.println("По высоте проходите");
        } else {
            System.out.println("Максимальная высота 1.8м.");
        }
        char firstLetterName = "Сергей".charAt(0);
        if(firstLetterName == 'М') {
            System.out.println("Молодец");
        } else if(firstLetterName == 'С') {
            System.out.println("Супер");
        } else {
            System.out.println("Ты кто то другой");
        }
        
        System.out.println("\nЗадача 2. Поиск max и min числа.\n");
        int a = 4;
        int b = 4;
        if(a > b) {
            System.out.println("Большее: " + a + " меньшее: " + b);
        } else if(a < b) {
            System.out.println("Большее: " + b + " меньшее: " + a);
        } else {
            System.out.println("Число: " + b + " равно числу: " + a);
        }

        System.out.println("\nЗадача 3. Работа с числом.\n");
        int num = -15;
        if(num == 0) {
            System.out.println("Число равно 0");
        } else if(num > 0) {
            if(num % 2 == 0) {
            System.out.println("Число: " + num + " положительное, чётное");
        } else {
            System.out.println("Число: " + num + " положительное, нечётное");
        }
        } else if(num % 2 == 0) {
            System.out.println("Число: " + num + " отрицательное, чётное");
        } else {
            System.out.println("Число: " + num + " отрицательное, нечётное");
        }

        System.out.println("\nЗадача 4. Поиск одинаковых цифр в числах.\n");
        int x = 123;
        int y = 123;
        System.out.println("Исходные числа: " + x + " и " + y);
        if(x / 100 == y / 100) {
            System.out.println(x / 100 + " 3 разряд");
        }
        if(x % 100 / 10 == y % 100 /10) {
            System.out.println(x % 100 / 10 + " 2 разряд");
        }
        if(x % 10 == y % 10) {
            System.out.println(x % 10 + " 1 разряд");
        } else {
            System.out.println("Одинаковых цифр по разрядам нет.\n");
            }

        System.out.println("\nЗадача 5. Определение буквы, числа или символа по их коду.\n");
        char unknownChar = '\u0035';
        if(unknownChar >= 'a' & unknownChar < 'z') {
            System.out.println("Символ: " + unknownChar + " - Маленькая буква");
        } else if(unknownChar >= '0' & unknownChar <= '9') {
            System.out.println("Символ: " + unknownChar + " - число");
        } else if(unknownChar >= 'A' & unknownChar <= 'Z') {
            System.out.println("Символ: " + unknownChar + " - Большая буква");
        } else {
            System.out.println("Символ: " + unknownChar + " - не буква и не число");
        }

        System.out.println("\nЗадача 6. Определение суммы вклада и начисленных банком %.\n");
        int deposit = 300_000;
        int accrual;
        if(deposit < 100_000) {
            accrual = deposit / 100 * 5;
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Начисленный %: " + accrual);
            System.out.println("Общая сумма с %: " + (deposit + accrual));
        } else if((deposit >= 100_000 & deposit <= 300_000)) {
            accrual = deposit / 100 * 7;
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Начисленный %: " + accrual);
            System.out.println("Общая сумма с %: " + (deposit + accrual));
        } else if(deposit > 300_000) {
            accrual = deposit / 100 * 10;
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Начисленный %: " + accrual);
            System.out.println("Общая сумма с %: " + (deposit + accrual));
        }

        System.out.println("\nЗадача 7. Определение оценки по предметам.\n");
        int offsetHistory = 59;
        int offsetProgramming = 91;
        Integer scoreHistory = null;
        Integer scoreProgramming = null;
        String alertHistory = " по истории";
        String alertProgramming = " по программированию";
        if (offsetHistory <= 60) {
            scoreHistory = 2;
        } else if(offsetHistory > 60 & offsetHistory <= 73) {
            scoreHistory = 3;
        } else if(offsetHistory > 73 & offsetHistory <= 91) {
            scoreHistory = 4;
        } else if(offsetHistory > 91) {
            scoreHistory = 5;
        }
        if(offsetProgramming <= 60) {
            scoreProgramming = 2;
        } else if(offsetProgramming > 60 & offsetProgramming <= 73) {
            scoreProgramming = 3;
        } else if(offsetProgramming > 73 & offsetProgramming <= 91) {
            scoreProgramming = 4;
        } else if(offsetProgramming > 91) {
            scoreProgramming = 5;
        }
        System.out.println(scoreHistory + " по истории");
        System.out.println(scoreProgramming + " по программированию");
        System.out.println("Средний балл оценок по предметам: " 
                + ((scoreHistory + scoreProgramming) / 2));
        System.out.println("Средний % по предметам: " + ((offsetHistory + offsetProgramming) / 2));

        System.out.println("\nЗадача 8. Расчет прибыли.\n");
        int rent = 5_000;
        int sale = 13_000;
        int costPrice = 9_000;
        int annualProfit = (sale - costPrice - rent) * 12;
        if(annualProfit > 0) {
            System.out.println("прибыль за год: +" + annualProfit);
        } else {
            System.out.println("прибыль за год: " + annualProfit);
        }

        }
}