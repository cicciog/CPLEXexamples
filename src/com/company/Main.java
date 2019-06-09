package com.company;

public class Main {

    public static void main(String[] args) {
        /*
         min z = 1,80 x1 + 2x2
            s.a. 20 x1 + 5x2 + >= 15
                6x1 + 5x2 >= 15
                10x1 >= 5
        */

        Esercizio1 es1 = new Esercizio1();
        es1.risolvereEsercizio1();

        /*
         max z = 80 P1 + 120 P2
         s.a. 10P1 +30P2 <= 1800
              P1 + P2 <= 100
        */

        Esercizio2 es2 = new Esercizio2();
        es2.risolvereEsercizio2();

        /*
         max z = 50 x + 6 y
         s.a. 2x + 2y <= 120
              15x + 45 y <= 2400
              60 x + 30y <= 2400
        */

        Esercizio3 es3 = new Esercizio3();
        es3.risolvereEsercizio3();
    }
}
