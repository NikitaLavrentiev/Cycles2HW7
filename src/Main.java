public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        //Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.
        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        // что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления данной суммы.
        // Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .

        System.out.println("\nЗадача_1");
        float money = 0f;

        for (int month = 1; month <= 12; month++) {
            money += 29000;
            float moneyFlow = money * 1.01f;
            money = moneyFlow;
            System.out.println("Месяц " + month + " сумма накоплений равна " + money + " рублей");
        }
    }

    public static void task2() {

        System.out.println("\nЗадача_2");
    }

    public static void task3() {

        System.out.println("\nЗадача_3");
    }

    public static void task4() {

        System.out.println("\nЗадача_4");
    }

    public static void task5() {

        System.out.println("\nЗадача_5");
    }

    public static void task6() {

        System.out.println("\nЗадача_6");
    }

    public static void task7() {

        System.out.println("\nЗадача_7");
    }
}

