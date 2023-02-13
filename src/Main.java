public class Main {
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

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);

        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);

        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 12.0;
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 7.6;
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763793;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxersWeight = 78.2;
        System.out.println("Вес первого боксёра " + firstBoxersWeight + "кг.");
        var secondBoxersWeight = 82.7;
        System.out.println("Вес второго боксёра " + secondBoxersWeight + "кг.");
        var totalWeight = firstBoxersWeight + secondBoxersWeight;
        System.out.println("Вес обоих боксёров " + totalWeight + "кг");
        var differenceInWeight = secondBoxersWeight - firstBoxersWeight;
        System.out.println("Разница в весе " + differenceInWeight + "кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxersWeight = 78.2;
        System.out.println("Вес первого боксёра " + firstBoxersWeight + "кг.");
        var secondBoxersWeight = 82.7;
        System.out.println("Вес второго боксёра " + secondBoxersWeight + "кг.");
        var differenceInWeight = secondBoxersWeight - firstBoxersWeight;
        System.out.println("1. Вычитание из большего веса меньшего " + differenceInWeight);
        var differenceInWeight1 = secondBoxersWeight % firstBoxersWeight;
        System.out.println("2. С помощью функции остаток от деления " + differenceInWeight1);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var totalHours = 640;
        var eachWorkerWorks = 8;
        var workersInCompany = totalHours / eachWorkerWorks;
        System.out.println("Всего работников в компании " + workersInCompany + " человек.");
        workersInCompany = workersInCompany + 94;
        eachWorkerWorks = totalHours / workersInCompany;
        System.out.println("Если в компании работает " + workersInCompany + " человек, то всего " + eachWorkerWorks + " часов работы может быть поделено между сотрудниками.");


    }
}