public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Задача 1. Создание переменных и вывод их значений на консоль.\n");
        byte core = 4;
        short mhz= 2100;
        int ram = 8192;
        long ssd = 524288;
        float mhz_max = 3.7f;
        double prosto = 9.9876543210d;
        char sym = 'Y';
        boolean yes = true;
        System.out.println("Количество ядер процессора: " + core);
        System.out.println("Базовая частота процессора: " + mhz + " MHz");
        System.out.println("Объём оперативной памяти: " + ram + " MB");
        System.out.println("Объём SSD накопителя: " + ssd + " MB");
        System.out.println("Максимальная частота процессора: " + mhz_max + " GHz");
        System.out.println("Просто число: " + prosto);
        System.out.println("Продолжаем изучать Java? "+ "'" + sym + "'");
        System.out.println("Идём дальше!" + yes);

        System.out.println("\nЗадача 2. Расчет стоимости товара со скидкой.\n");
        int pen = 100;
        int book = 200;
        int sale = 11;
        int cash = (pen + book) * sale / 100;
        int buy = pen + book - cash;
        System.out.println("Ваша скидка составила: " + cash);
        System.out.println("Общая сумма товаров, учитывая скидку: " + buy);

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
        b = b ^ a;
        a = b ^ a;
        b = b ^ a;
        System.out.println("Новые значения переменных: " + a + " " + b);

        System.out.println("\nЗадача 6. Вывод символов и их кодов.\n");
        int symb1 = 35;
        int symb2 = 38;
        int symb3 = 64;
        int symb4 = 94;
        int symb5 = 95;
        System.out.println("Код символа: " + symb1 + " Символ из ASCII-таблицы: " + (char)symb1);
        System.out.println("Код символа: " + symb2 + " Символ из ASCII-таблицы: " + (char)symb2);
        System.out.println("Код символа: " + symb3 + " Символ из ASCII-таблицы: " + (char)symb3);
        System.out.println("Код символа: " + symb4 + " Символ из ASCII-таблицы: " + (char)symb4);
        System.out.println("Код символа: " + symb5 + " Символ из ASCII-таблицы: " + (char)symb5);

        System.out.println("\nЗадача 7. Отображение количества сотен, десятков и единиц числа.\n");
        int ttt = 123;
        System.out.println("Число: " + ttt + " содержит:");
        int x = ttt / 100;
        System.out.println(x + " сотен" );
        int y = ttt % 100 / 10;
        System.out.println(y + " десятков" );
        int z = ttt % 10;
        System.out.println(z + " единиц" );

        System.out.println("\nЗадача 8. Вывод на консоль ASCII-арт Дюка.\n");
        char duk1 = '/';
        char duk2 = '\\';
        char duk3 = '_';
        char duk4 = '(';
        char duk5 = ')';
        System.out.println("    " + duk1 + duk2);
        System.out.println("   " + duk1 + "  " + duk2);
        System.out.println("  " + duk1 + duk3 + duk4 + duk5 + " " + duk2);
        System.out.println(" " + duk1 + "      " + duk2);
        System.out.println("" + duk1 + duk3 + duk3 + duk3 + duk3 + duk1 + duk2 + duk3 + duk3 + duk2);

        System.out.println("\nЗадача 9. Произведение и сумма цифр числа.\n");
        int num5 = 345;
        int x1 = num5 / 100;
        int y1 = num5 %100 / 10;
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