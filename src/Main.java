public class Main
{
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 ()
    {
        System.out.println("Задача 1");
        int bank = 0;
        int nak = 15_000;
        int mouth = 0;
        while (bank<2_459_000)
        {
            bank = bank + nak;
            mouth ++;
            System.out.println("    Месяц " + mouth + ", сумма накоплений равна " + bank + "рублей");
        }
    }

    public static void task2 ()
    {
        System.out.println("Задача 2");
        int i = 0;
        System.out.print("    ");
        while (i < 10)
        {
            i ++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("    ");
        for (;i > 0; i --)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3 ()
    {
        System.out.println("Задача 3");
        int people = 12_000_000;
        int year = 1;
        while (year <= 10)
        {
            int birth = people/ 1000 * 17;
            int death = people/ 1000 * 8;
            people = people + birth - death;
            System.out.println("    Год " + year + ", численность населения составляет " + people);
            year ++;
        }
    }
    public static void task4 ()
    {
        System.out.println("Задача 4");
        int bank = 15000;
        int mouth = 0;
        while (bank < 12_000_000)
        {
            mouth ++;
            bank = bank + 7*bank/100;
            System.out.println("    Месяц " + mouth + " сумма на счёте " + bank);
        }
        System.out.println("    Понадобится " + mouth + " месяцев");
    }
    public static void task5 ()
    {
        System.out.println("Задача 5");
        int bank = 15000;
        int mouth = 0;
        while (bank < 12_000_000)
        {
            mouth ++;
            bank = bank + 7*bank/100;
            if (mouth % 6 == 0)
            {
                System.out.println("    Месяц " + mouth + " сумма на счёте " + bank);
            }
        }
        System.out.println("    Понадобится " + mouth + " месяцев");
    }
    public static void task6 ()
    {
        System.out.println("Задача 6");
        int bank = 15000;
        int mouth = 0;
        while (mouth < 108)
        {
            mouth ++;
            bank = bank + 7*bank/100;
            if (mouth % 6 == 0)
            {
                System.out.println("    Месяц " + mouth + " сумма на счёте " + bank);
            }
        }
    }
    public static void task7 ()
    {
        System.out.println("Задача 7");
        int friday = 4;
        for (int i =1 ; i <= 31 ; i++)
        {
            if (i == friday)
            {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
                friday = friday + 7;
            }
        }
    }
    public static void task8 ()
    {
        System.out.println("Задача 8");
        int year = 1822;
        while (year % 79 != 0)
        {
            year ++;
        }
        while (year<=2122)
        {
            System.out.println("    " + year);
            year = year + 79;
        }
    }
}