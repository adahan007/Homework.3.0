package com.company;

public class Main {

    public static void main(String[] args) {
        double[] arr = {5.6, -4.5, 5.7, -9.3, 1.2, -3.7, 9.6, -2.7, 8.6, -9.4, 3.8, -6.3, 8.8, -9.9, 3.1};
        double summa = 0;
        double kolichestvo = 0;
        boolean fanta = false;
        for (double asd : arr) {
            if (asd <= 0) {
                fanta = true;
            } else if (asd > 0) {
                if (fanta) {
                    summa += asd; // сумма
                    kolichestvo++;
                }

            }
            System.out.println("среднее арифмитическое число       " + summa / kolichestvo);
        }


    }


            public static void sortirovkaChisel(double[] geek) {
                for (int i = 0; i < geek.length; i++) {
                    double minZnachenie = geek[i];
                    for (int j = i; j < geek.length; j++) {
                        if (minZnachenie > j) {
                            double d = minZnachenie;
                            minZnachenie = geek[j];
                            geek[j] = d;

                        }
                    }
                }
            }
}










