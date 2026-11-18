package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

            double[] messungen = { 14.5, 18.2, 22.0, 19.8, 13.0, 25.4, 21.1 };

                double max = messungen[0];
                double min = messungen[0];

                int anlageTage = 0;

                double summe = 0.0;
                for (double j : messungen) {
                    summe += j;
                    if (j >= 20.0) {
                        anlageTage++;
                    }
                    if (j > max) {
                        max = j;
                    }
                    else if (j < min) {
                       min = j;
                    }
                        System.out.println("aktueller Wert: " + j + " neue Summe: " + summe);
                    }
                double average = summe / messungen.length;
                        System.out.println("Durchschnittswert aller Tage: " + average);

                        System.out.println(max + ": höchste Wert");

                        System.out.println(min + ": niedrigster Wert");

                        System.out.println("Tage die wärmer als 20° sind: " + anlageTage);
        }
    }
