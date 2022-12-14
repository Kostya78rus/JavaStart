public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Задача 1. Создание переменных и вывод их значений на консоль.\n");
        byte core = 4;
        short mhz = 2100;
        int ram = 8192;
        long ssd = 524288;
        float mhzMax = 3.7f;
        double numberPi = 3.1415926535d;
        char oneNumberSimbol = 'Y';
        boolean yes = true;
        System.out.println("Количество ядер процессора: " + core);
        System.out.println("Базовая частота процессора: " + mhz + " MHz");
        System.out.println("Объём оперативной памяти: " + ram + " MB");
        System.out.println("Объём SSD накопителя: " + ssd + " MB");
        System.out.println("Максимальная частота процессора: " + mhzMax + " GHz");
        System.out.println("Просто число: " + numberPi);
        System.out.println("Продолжаем изучать Java? "+ "'" + oneNumberSimbol + "'");
        System.out.println("Идём дальше!" + yes);

        System.out.println("\nЗадача 2. Расчет стоимости товара со скидкой.\n");
        int costPen = 100;
        int costBook = 200;
        int discount = 11;
        int sumDiscount = (costPen + costBook) * discount / 100;
        int discountPrice = costBook + costPen - sumDiscount;
        System.out.println("Ваша скидка составила: " + sumDiscount);
        System.out.println("Общая сумма товаров, учитывая скидку: " + discountPrice);

        System.out.println("\nЗадача 3. Вывод на консоль слова JAVA.\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\nОтображение min и max значений числовых типов данных.\n");
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;
        System.out.println("Первоначальное значение: " + num1);
        System.out.println("Значение после инкремента: " + ++num1);
        System.out.println("Значение после декремента: " + --num1);
        System.out.println("\nПервоначальное значение: " + num2);
        System.out.println("Значение после инкремента: " + ++num2);
        System.out.println("Значение после декремента: " + --num2);
        System.out.println("\nПервоначальное значение: " + num3);
        System.out.println("Значение после инкремента: " + ++num3);
        System.out.println("Значение после декремента: " + --num3);
        System.out.println("\nПервоначальное значение: " + num4);
        System.out.println("Значение после инкремента: " + ++num4);
        System.out.println("Значение после декремента: " + --num4);

        System.out.println("\nЗадача 5. Перестановка значений переменных.\n");
        int a = 2;
        int b = 5;
        System.out.println("<<Перестановка с помощью третьей переменной>>");
        System.out.println("Начальные данные: " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Новые значения переменных: " + a + " " + b);
        System.out.println("\n<<Перестановка с помощью арифметических операций>>");
        System.out.println("Начальные данные: " + a + " " + b);
        b += a;
        a = b - a;
        b -= a;
        System.out.println("Новые значения переменных: " + a + " " + b);
        System.out.println("\n<<Перестановка с помощью побитовой операции ^>>");
        b ^= a;
        a = b ^ a;
        b ^= a;
        System.out.println("Новые значения переменных: " + a + " " + b);

        System.out.println("\nЗадача 6. Вывод символов и их кодов.\n");
        char number = '#';
        char and = '&';
        char sobaka = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println("Код символа: " + (int) number + " Символ из ASCII-таблицы: " + number);
        System.out.println("Код символа: " + (int) and + " Символ из ASCII-таблицы: " + and);
        System.out.println("Код символа: " + (int) sobaka + " Символ из ASCII-таблицы: " + sobaka);
        System.out.println("Код символа: " + (int) caret + " Символ из ASCII-таблицы: " + caret);
        System.out.println("Код символа: " + (int) underscore + " Символ из ASCII-таблицы: " + underscore);

        System.out.println("\nЗадача 7. Отображение количества сотен, десятков и единиц числа.\n");
        int originalNumber = 123;
        System.out.println("Число: " + originalNumber + " содержит:");
        int hundredNumber = originalNumber / 100;
        System.out.println(hundredNumber + " сотен" );
        int tenNumber = originalNumber % 100 / 10;
        System.out.println(tenNumber + " десятков" );
        int oneNumber = originalNumber % 10;
        System.out.println(oneNumber + " единиц" );

        System.out.println("\nЗадача 8. Вывод на консоль ASCII-арт Дюка.\n");
        char slash = '/';
        char backSlash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underscore + leftParenthesis + rightParenthesis + " " + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\nЗадача 9. Произведение и сумма цифр числа.\n");
        int num5 = 345;
        int x1 = num5 / 100;
        int y1 = num5 % 100 / 10;
        int z1 = num5 % 10;
        System.out.println("Сумма цифр числа:" + num5 + " = " + (x1 + y1 + z1));
        System.out.println("Произведение цифр числа:" + num5 + " = " + (x1 * y1 * z1));

        System.out.println("\nЗадача 10. Преобразование секунд.\n");
        int sec = 86399;
        int hour = sec / 3600;
        int min = sec / 60 % 60;
        int sec1 = sec % 60;
        System.out.println(sec + " секунд, это:");
        System.out.println(hour + ":" + min + ":" + sec1);
    }
    
}