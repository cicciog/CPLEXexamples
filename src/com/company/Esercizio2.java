package com.company;

import ilog.concert.IloException;
import ilog.concert.IloLinearNumExpr;
import ilog.concert.IloNumVar;
import ilog.cplex.IloCplex;

public class Esercizio2 {

    public void risolvereEsercizio2() {
        try {
            //creo il modello del Cplex
            IloCplex model = new IloCplex();

            //variabili
            IloNumVar P1 = model.numVar(0, Double.MAX_VALUE, "P1");
            IloNumVar P2 = model.numVar(0, Double.MAX_VALUE, "P2");

            //espressioni
            IloLinearNumExpr objective = model.linearNumExpr();
            objective.addTerm(P1, 80);
            objective.addTerm(P2, 120);

            //definizione obbiettivo
            model.addMaximize(objective);

            //definizione dei vincoli
            IloLinearNumExpr c1 = model.linearNumExpr();
            c1.addTerm(P1, 10);
            c1.addTerm(P2, 30);
            model.addLe(c1, 1800, "c1");

            IloLinearNumExpr c2 = model.linearNumExpr();
            c2.addTerm(P1, 1);
            c2.addTerm(P2, 1);
            model.addLe(c2, 100, "c2");

            if (model.solve()) {
                System.out.println("Solution Status = " + model.getStatus());
                System.out.println("Solution value = " + model.getObjValue());
            } else {
                System.out.println("Solution status = " + model.getStatus());
            }

            model.end();

        } catch (IloException ex) {
            System.out.println(ex.getMessage());
        }
        /*
         max z = 80 P1 + 120 P2
         s.a. 10P1 +30P2 <= 1800
              P1 + P2 <= 100
        */
    }
}
