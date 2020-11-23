package ru.FirstLesson;


public class LessonOne {
    public static void main(String[] args) {
        firsExercise();
        System.out.println(secondExercise(1, 2, 4, 2));
        System.out.println(thirdExercise(5, 10));
        fourthExercise(-4);
        fifthExercise("Мир");
        sixthExercise(100);
    }

    static void firsExercise() {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        char x = 'j';
        float e = (float) 2.4;
        double p = 2.2;
        boolean kek = true;
    }

    static int secondExercise(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean thirdExercise(int a, int b) {
        int kek = a + b;
        if (kek >= 10 && kek <= 20)
            return true;
        else return false;
    }

    static void fourthExercise(int a) {
        int kek = a;
        if (kek >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static void fifthExercise(String kek) {
        System.out.println("Привет, " + kek + " ! ");
    }

    static void sixthExercise(int year) {
        String v = "Високосный год";
        String n = "Невисокосный год";
        if (year == 400 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(v);
        } else if (year % 4 != 0 || year % 100 == 0) {
            System.out.println(n);
        }
    }
} //ll
