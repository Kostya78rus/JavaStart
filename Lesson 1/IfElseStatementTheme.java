public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Задача 1. Перевод псевдокода на язык Java.");
        int age = 35;
        if (age > 20) {
            System.out.println("Персонаж старше 20 лет");
        } else {
            System.out.println("Персонаж младше 20 лет");
        }
        boolean genderMale = true;
        if (!genderMale) {
            System.out.println("Персонаж мужчина");
        } else {
            System.out.println("Персонаж другого пола");
        }
        float height = 1.92f;
        if (height <= 1.80) {
            System.out.println("По высоте проходите");
        } else {
            System.out.println("Максимальная высота 1.8м.");
        }
        char firstLetterName = "Сергей".charAt(0);
        if (firstLetterName == 'М') {
            System.out.println("Молодец");
        } else if (firstLetterName == 'С') {
            System.out.println("Супер");
        } else {
            System.out.println("Ты кто то другой");
        }
        
        System.out.println("\nЗадача 2. Поиск max и min числа.\n");
        int a = 4;
        int b = 4;
        if(a > b) {
            System.out.println("Большее: " + a + " меньшее: " + b);
        } else if (a < b) {
            System.out.println("Большее: " + b + " меньшее: " + a);
        } else {
            System.out.println("Число: " + b + " равно числу: " + a);
        }

        System.out.println("\nЗадача 3. Работа с числом.");
        /*int num = -15;
        if (num == 0) {
            System.out.println("Число равно 0");
        } else if (num > 0) {
               if (num % 2 == 0) {
                   System.out.println("Число: " + num + " положительное, чётное");
               } else {
                   System.out.println("Число: " + num + " положительное, нечётное");
               }
               } else if (num % 2 == 0) {
                   System.out.println("Число: " + num + " отрицательное, чётное");
               } else {
                   System.out.println("Число: " + num + " отрицательное, нечётное");
               }*/
        int srcNum = 0;
        System.out.println("Исходное число: " + srcNum);
        if (srcNum != 0) {
            if (srcNum % 2 == 0) {
                System.out.println("Нечётное число");
            } else {
                System.out.println("Чётное число");
            }
            if (srcNum > 0) {
                System.out.println("Положительное число");
            } else {
                System.out.println("Отрицательное число");
            }
        }

        System.out.println("\nЗадача 4. Поиск одинаковых цифр в числах.");
        int x = 123;
        int y = 123;
        System.out.println("Исходные числа: " + x + " и " + y);
        if (x / 100 == y / 100) {
            System.out.println("Одинаковое число: " + x / 100 + " в 3 разряде");
        }
        if (x % 100 / 10 == y % 100 /10) {
            System.out.println("Одинаковое число: " + x % 100 / 10 + " во 2 разряде");
        }
        if (x % 10 == y % 10) {
            System.out.println("Одинаковое число: " + x % 10 + " в 1 разряде");
        } else {
            System.out.println("Одинаковых цифр по разрядам нет.\n");
        }

        System.out.println("\nЗадача 5. Определение буквы, числа или символа по их коду.");
        char unknownChar = '\u0035';
        if (unknownChar >= 'a' & unknownChar < 'z') {
            System.out.println("Символ: " + unknownChar + " - Маленькая буква");
        } else if (unknownChar >= '0' & unknownChar <= '9') {
            System.out.println("Символ: " + unknownChar + " - число");
        } else if (unknownChar >= 'A' & unknownChar <= 'Z') {
            System.out.println("Символ: " + unknownChar + " - Большая буква");
        } else {
            System.out.println("Символ: " + unknownChar + " - не буква и не число");
        }

        System.out.println("\nЗадача 6. Определение суммы вклада и начисленных банком %.");
        int deposit = 300_000;
        int accrual = 0;
        if (deposit < 100_000) {
            accrual = deposit / 100 * 5;
        } else if ((deposit >= 100_000 & deposit <= 300_000)) {
            accrual = deposit / 100 * 7;
        } else if (deposit > 300_000) {
            accrual = deposit / 100 * 10;
        }
        System.out.println("Общая сумма с %: " + (deposit + accrual));
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный %: " + accrual);

        System.out.println("\nЗадача 7. Определение оценки по предметам.");
        int percetHistory = 56;
        int percetProgramming = 95;
        int scoreHistory = 5;
        int scoreProgramming = 5;
        if (percetHistory <= 60) {
            scoreHistory = 2;
        } else if (percetHistory > 60 && percetHistory <= 73) {
            scoreHistory = 3;
        } else if (percetHistory > 73 && percetHistory <= 91) {
            scoreHistory = 4;
        }
        if (percetProgramming <= 60) {
            scoreProgramming = 2;
        } else if (percetProgramming > 60 && percetProgramming <= 73) {
            scoreProgramming = 3;
        } else if (percetProgramming > 73 && percetProgramming <= 91) {
            scoreProgramming = 4;
        }
        System.out.println(scoreHistory + " по истории");
        System.out.println(scoreProgramming + " по программированию");
        System.out.println("Средний балл оценок по предметам: " 
                + ((scoreHistory + scoreProgramming) / 2));
        System.out.println("Средний % по предметам: " + ((percetHistory + percetProgramming) / 2));

        System.out.println("\nЗадача 8. Расчет прибыли.");
        int rent = 5_000;
        int sale = 13_000;
        int costPrice = 9_000;
        int annualProfit = (sale - costPrice - rent) * 12;
        if (annualProfit > 0) {
            System.out.println("прибыль за год: +" + annualProfit);
        } else {
            System.out.println("прибыль за год: " + annualProfit);
        }

        System.out.println("\nЗадача 9. Подсчет количества банкнот.");
        int takeOff = 567;
        int numAvailable100 = 4;
        int numAvailable10 = 200;
        int numAvailable1= 50;
        int numRequired100 = takeOff / 100;
        int numRequired10 = takeOff % 100 / 10;
        int numActual100 = 0;
        int numActual10 = 0;
        int numActual1 = 0;
        if (takeOff > (numAvailable100 * 100 + numAvailable10 * 10 + numAvailable1)) {
            System.out.println("Превышение суммы, которую может выдать");
        } else {
            int remains100 = 0;
            if(numRequired100 <= numAvailable100) {
                System.out.println("Номинал 100: " + numRequired100 + " шт.");
                numActual100 = numRequired100;
            } else {
                System.out.println("Номинал 100: " + numAvailable100 + " шт.");
                remains100 = numRequired100 - numAvailable100;
                numActual100 = numAvailable100;
            }
            int remains10 = 0;
            if ((numRequired10 + remains100 * 10) <= numAvailable10) {
                System.out.println("Номинал 10: " + (numRequired10 + remains100 * 10) + " шт.");
                numActual10 = numRequired10 + remains100 * 10;
            } else {
                System.out.println("Номинал 10: " + numAvailable10 + " шт.");
                remains10 = (numRequired10 + remains100 * 10) - numAvailable10;
                numActual10 = numAvailable10;
            }
            System.out.println("Номинал 1: " + (takeOff % 10 + remains10) + " шт.");
            numActual1 = takeOff % 10 + remains10;
        }
        System.out.println("Исходная сумма: " + (numActual100 * 100 + numActual10 * 10 + numActual1));

    }
}