public class Variables {
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

    public static void task1() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("task1: dog = " + dog + "; cat = " + cat + "; paper = " + paper);
        System.out.println();
    }

    public static void task2() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("task2: dog = " + dog + "; cat = " + cat + "; paper = " + paper);
        System.out.println();
    }

    public static void task3() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("task3: dog = " + dog + "; cat = " + cat + "; paper = " + paper);
        System.out.println();
    }

    public static void task4() {
        var friend = 19;
        System.out.print("task4: friend = " + friend + "; ");
        friend = friend + 2;
        System.out.print(friend + "; ");
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();
    }

    public static void task5() {
        var frog = 3.5;
        System.out.print("task5: frog = " + frog + "; ");
        frog = frog * 10;
        System.out.print(frog + "; ");
        frog = frog / 3.5;
        System.out.print(frog + "; ");
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();
    }

    public static void task6() {
        var weightFirst = 78.2;
        var weightSecond = 82.7;
        System.out.println("task6:");
        System.out.println("Общий вес двух бойцов равен " + (weightFirst + weightSecond) + " кг.");
        System.out.println("Разница между весами бойцов составляет " + (weightSecond - weightFirst) + " кг.");
        System.out.println();
    }

    public static void task7() {
        var weightFirst = 78.2;
        var weightSecond = 82.7;
        var diffMethod1 = weightSecond - weightFirst;
        var diffMethod2 = (weightFirst + weightSecond) % weightFirst;
        System.out.println("task7:");
        System.out.println("Метод вычитания: " + diffMethod1 + "; метод деления с остатком: " + diffMethod2);
        System.out.println();
    }

    public static void task8() {
        System.out.println("task8:");
        var hours = 640;
        var hoursPerEmp = 8;
        var emp = hours / hoursPerEmp;
        System.out.println("1. Всего работников в компании - " + emp + " человек.");
        var newEmp = emp + 94;
        var newHours = newEmp * hoursPerEmp;
        System.out.println("2. Если в компании работает " + newEmp + " человек, то всего " + newHours + " часов работы может быть поделено между сотрудниками.");
    }
}
