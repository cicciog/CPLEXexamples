package com.company;

import ilog.concert.IloException;
import ilog.concert.IloLinearNumExpr;
import ilog.concert.IloNumVar;
import ilog.cplex.IloCplex;

public class Esercizio1 {

    public void risolvereEsercizio1() {
        try {
            //creare il modello di Cplex
            IloCplex model = new IloCplex();

            //variabili
            IloNumVar x1 = model.numVar(0, Double.MAX_VALUE, "x1");
            IloNumVar x2 = model.numVar(0, Double.MAX_VALUE, "x2");

            //espressioni
            IloLinearNumExpr objective = model.linearNumExpr();
            objective.addTerm(x1, 1.80);
            objective.addTerm(x2, 2.00);

            //definizione della funzione obbiettivo
            model.addMinimize(objective);

            //definizione vincoli
            IloLinearNumExpr c1 = model.linearNumExpr();
            c1.addTerm(x1, 20);
            c1.addTerm(x2, 5);
            model.addGe(c1, 15, "c1");

            IloLinearNumExpr c2 = model.linearNumExpr();
            c2.addTerm(x1, 6);
            c2.addTerm(x2, 30);
            model.addGe(c2, 12, "c2");

            IloLinearNumExpr c3 = model.linearNumExpr();
            c3.addTerm(x1, 10);
            model.addGe(c3, 5, "c3");

            System.out.println("problem: " + model.getModel());

            if (model.solve()) {
                System.out.println("Solution status = " + model.getStatus());
                System.out.println("Solution value = " + model.getObjValue());
            } else {
                System.out.println("Solution status = " + model.getStatus());
            }

            model.end();


        } catch (IloException ex) {
            System.out.println(ex.getMessage());
        }
        /*
         min z = 1,80 x1 + 2x2
            s.a. 20 x1 + 5x2 + >= 15
                6x1 + 5x2 >= 15
                10x1 >= 5
        */
    }
}
