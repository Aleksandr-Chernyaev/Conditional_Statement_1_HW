//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задач 1");

        int personsAgeOne = 20;
        int personsAgeTwo = 17;

        if (personsAgeOne >= 18) {
            System.out.println("Если возраст человека равен " + personsAgeOne + " лет то, он совершеннолетний.");
        } else System.out.println("Если возраст человека равен" + personsAgeOne + " лет то, он не достиг совершеннолетия, придется подождать.");
        if (personsAgeTwo <= 18) {
            System.out.println("Если возраст человека равен " + personsAgeTwo + " лет то, он не достиг совершеннолетия, придется немного подождать.");
        } else System.out.println("Если возраст человека равен " +personsAgeTwo + " лет то, он совершеннолетний.");

        System.out.println("Задача 2");

        int airTemperatureLow = -2;
        int airTemperatureHigh = 18;

        if (airTemperatureLow < 5) {
            System.out.println("На улице " + airTemperatureLow + " градуса, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + airTemperatureLow + " градусов, можно идти без шапки.");
        }
        if (airTemperatureHigh >= 5) {
            System.out.println("На улице " + airTemperatureHigh + " градусов, можно идти без шапки.");
        }  else {
            System.out.println("На улице " + airTemperatureHigh + " градуса, нужно надеть шапку.");
        }

        System.out.println("Задача 3");

        int speedCarOne = 79;
        int speedCarTwo = 59;

        if (speedCarOne >= 60) {
            System.out.println("Если скорость " + speedCarOne + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedCarOne + " км/ч, то можно ехать спокойно.");
        }
        if (speedCarTwo < 60) {
            System.out.println("Если скорость " + speedCarTwo + " км/ч, то можно ехать спокойно.");
        } else {System.out.println("Если скорость " + speedCarTwo + " км/ч, то придется заплатить штраф.");
        }

        System.out.println("Задача 4");

        int agePersonOne = 8;

        boolean agePersonD = agePersonOne >= 2 && agePersonOne <= 6;
        boolean agePersonS = agePersonOne >= 7 && agePersonOne <= 17;
        boolean agePersonU = agePersonOne >= 18 && agePersonOne <= 24;
        boolean agePersonW = agePersonOne >= 25;


        if (agePersonD) {
            System.out.println("Если возраст человека равен " + agePersonOne + " лет, то ему нужно ходить в детский сад.");
        }
        if (agePersonS) {
            System.out.println("Если возраст человека равен " + agePersonOne + " лет, то ему нужно ходить в школу.");
        }
        if (agePersonU) {
            System.out.println("Если возраст человека равен " + agePersonOne + " лет, то его место в университете.");
        }
        if (agePersonW) {
            System.out.println("Если возраст человека равен " + agePersonOne + " лет, то ему пора ходить на работу.");
        }

        System.out.println("Задача 5");

        int childsAgeOne = 3;

        boolean childsAgeO = childsAgeOne > 0 && childsAgeOne < 5;
        boolean childsAgeT = childsAgeOne >= 5 && childsAgeOne < 14;
        boolean childsAgeW = childsAgeOne >= 14;

        if (childsAgeO) {
            System.out.println("Если возраст ребенка равен " + childsAgeOne + " лет/года, то он не может кататься на аттракционе.");
        }
        if (childsAgeT) {
            System.out.println("Если возраст ребенка равен " + childsAgeOne + " лет, то он может кататься на атракционе только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (childsAgeW) {
            System.out.println("Если возраст ребенка равен " + childsAgeOne + " лет, то он может кататься без сопровождения взрослого.");
        }

        System.out.println("Задача 6");

        int peopleInTheCarriage = 100;

        boolean seating = peopleInTheCarriage >= 1 && peopleInTheCarriage <= 60;
        boolean standingRoom = peopleInTheCarriage > 60 && peopleInTheCarriage <= 101;
        boolean carriageCapacity = peopleInTheCarriage == 102;

        if (seating) {
            System.out.println("Если в вагоне " + peopleInTheCarriage + " человек, то еще есть сидячие места.");
        } else if (standingRoom) {
            System.out.println("Если в вагоне " + peopleInTheCarriage + " человек, то остались стоячие места.");
        } else {
            System.out.println("Если в вагоне " + peopleInTheCarriage + " человека, то вагон полностью забит.");
        }

        System.out.println("Задача 7");

        int one = 55;
        int two = 7;
        int three = 16;

        if (one > two && one > three) {
            System.out.println("Число one больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число two больше остальных");
        } else {
            System.out.println("Число three больше остальных");
        }

    }
}