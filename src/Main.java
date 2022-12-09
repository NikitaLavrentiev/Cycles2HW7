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
        int month = 1;
        int sum = 2459000;
        while (money <= sum) {
            money += 15000;
            float moneyFlow = money * 1.01f;
            money = moneyFlow;
            System.out.println("Месяц " + month + " сумма накоплений равна " + money + " рублей");
            month= month+1;
        }
        System.out.println("Месяц " + month + " нужен чтобы накопить " + sum + " рублей");
    }

    public static void task2() {
        //Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        //Не забудьте выполнить переход на новую строку между двумя циклами.
        //В результате программы вывод должен получиться следующий:
        //1 2 3 4 5 6 7 8 9 10
        //10 9 8 7 6 5 4 3 2 1

        System.out.println("\nЗадача_2");
        int i = 1;
        while (i <= 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int b=10; b>=1; b--) {
            System.out.print(b + " ");
        }

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

