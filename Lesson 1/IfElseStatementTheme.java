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
        boolean isGender = gender == "male";
                if(!isGender) {
            System.out.println("Персонаж другого пола");
        } else {
            System.out.println("Персонаж мужчина");
        }
        float height = 1.92f;
        if(height <= 1.80) {
            System.out.println("По высоте проходите");
        } else {
            System.out.println("Максимальная высота 1.8м.");
        }
        String name = "Сергей";
        char firstLetterName = name.charAt(0);
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
        if(a>b) {
            System.out.println("Большее: " + a + " меньшее: " + b);
        } else if(a<b) {
            System.out.println("Большее: " + b + " меньшее: " + a);
        } else {
            System.out.println("Число: " + b + " равно числу: " + a);
        }

        System.out.println("\nЗадача 3. Работа с числом.\n");
        int c = -16;
        boolean isEvenNumber = c % 2 == 0;
        boolean isNegativeNumber = c > 0;
        if(c == 0) {
            System.out.println("Число равно 0");
            } else if(isEvenNumber & isNegativeNumber) {
                System.out.println("Число: " + c + " положительное, чётное");
            } else if(!isEvenNumber& isNegativeNumber) {
                System.out.println("Число: " + c + " положительное, нечётное");
            } else if(isEvenNumber & !isNegativeNumber) {
                System.out.println("Число: " + c + " отрицательное, чётное");
            } else {
                System.out.println("Число: " + c + " отрицательное, нечётное");
            }

        System.out.println("\nЗадача 4. Поиск одинаковых цифр в числах.\n");
        int x = 223;
        int y = 123;
        int hundredResult = x / 100;
        int tenResult = x % 100 / 10;
        int oneResult = x % 10;
        boolean hundredNumber = x / 100 == y / 100;
        boolean tenNumber = x % 100 / 10 == y % 100 /10;
        boolean oneNumber = x % 10 == y % 10;
        System.out.println("Исходные числа: " + x + " и " + y);
        if(hundredNumber & tenNumber & oneNumber) {
            System.out.println("Одинаковые числа в сотнях: " + hundredResult + ", в десятках: "
                + tenResult + ", в единицах: " + oneResult);
            } else if(hundredNumber & oneNumber) {
                System.out.println("Одинаковые числа в сотнях: " + hundredResult +
                 ", в единицах: " + oneResult);
            } else if(hundredNumber & tenNumber) {
                System.out.println("Одинаковые числа в сотнях: " + hundredResult + 
                    ", в десятках: "+ tenResult);
            } else if(hundredNumber) {
                System.out.println("Одинаковые числа в сотнях: " + hundredResult);
            } else if(tenNumber & oneNumber) {
                System.out.println("Одинаковые числа в десятках: "+ tenResult + 
                    ", в единицах: " + oneResult);
            } else if(tenNumber) {
                System.out.println("Одинаковые числа в десятках: "+ tenResult);
            } else if(oneNumber) {
                System.out.println("Одинаковые числа в единицах: " + oneResult);
            } else {
                System.out.println("Одинаковых цифр по разрядам нет.\n");
            }

        System.out.println("\nЗадача 5. Определение буквы, числа или символа по их коду.\n");
        char simbol = '\u0057';
        int str = (char) simbol;
        if(str >= 'a' & str < 'z') {
            System.out.println("Символ: " + simbol + " - Маленькая буква");
            } else if(str >= '0' & str <= '9') {
                System.out.println("Символ: " + simbol + " - число");
            } else if(str >= 'A' & str <= 'Z') {
                System.out.println("Символ: " + simbol + " - Большая буква");
            } else {
                System.out.println("Символ: " + simbol + " - не буква и не число");
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
        int scoreHistory;
        int scoreProgramming
        String alertHistory = " по истории";
        String alertProgramming = " по программированию";
        if(offsetHistory <= 60) {
            scoreHistory = 2;
            System.out.println(scoreHistory + alertHistory);
        } else if(offsetHistory > 60 & offsetHistory <= 73) {
            scoreHistory = 3;
            System.out.println(scoreHistory + alertHistory);
        } else if(offsetHistory > 73 & offsetHistory <= 91) {
            scoreHistory = 4;
            System.out.println(scoreHistory + alertHistory);
        } else if(offsetHistory > 91) {
            scoreHistory = 5;
            System.out.println(scoreHistory + alertHistory);
        }
        if(offsetProgramming <= 60) {
            scoreProgramming = 2;
            System.out.println(scoreProgramming + alertHistory);
        } else if(offsetHistory > 60 & offsetHistory <= 73) {
            scoreProgramming = 3;
            System.out.println(scoreProgramming + alertHistory);
        } else if(offsetHistory > 73 & offsetHistory <= 91) {
            scoreProgramming = 4;
            System.out.println(scoreProgramming + alertHistory);
        } else if(offsetHistory > 91) {
            scoreProgramming = 5;
            System.out.println(scoreProgramming + alertHistory);
        }
        //int averageMark = scoreHistory / 2;
        //System.out.println("Средняя: " + averageMark);
        System.out.println("Средний % по предметам: " + ((offsetHistory + offsetProgramming) / 2));




        }
}