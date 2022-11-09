public class MyFirstGame {
    public static void main(String[] args) {
        int random_num = 79;
        int num = 100;
        System.out.println("Загаданное число от 0 до 100");
        do {
            if (random_num < num) {
                System.out.printf("Число меньше %d%n", num);
                num /= 2;
            } else if (random_num > num) {
                System.out.printf("Число больше %d%n", num);
                num++;
            }
        } while (num != random_num);
        System.out.printf("Вы угадали! Это число %d", random_num);
    }
}