package com.company;

import ilog.concert.IloException;
import ilog.concert.IloLinearNumExpr;
import ilog.concert.IloNumVar;
import ilog.cplex.IloCplex;

public class Esercizio3 {

    public void risolvereEsercizio3() {
        try {
            //creo il modello del Cplex
            IloCplex model = new IloCplex();

            //variabili
            IloNumVar x = model.numVar(0, Double.MAX_VALUE, "x");
            IloNumVar y = model.numVar(0, Double.MAX_VALUE, "y");

            //espressioni
            IloLinearNumExpr objective = model.linearNumExpr();
            objective.addTerm(x, 50);
            objective.addTerm(y, 60);

            //definizione obbiettivo
            model.addMaximize(objective);

            //definizione dei vincoli
            IloLinearNumExpr c1 = model.linearNumExpr();
            c1.addTerm(x, 2);
            c1.addTerm(y, 2);
            model.addLe(c1, 120, "c1");

            IloLinearNumExpr c2 = model.linearNumExpr();
            c2.addTerm(x, 15);
            c2.addTerm(y, 45);
            model.addLe(c2, 2400, "c2");

            IloLinearNumExpr c3 = model.linearNumExpr();
            c3.addTerm(x, 60);
            c3.addTerm(y, 30);
            model.addLe(c3, 2400, "c3");

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
         max z = 50 x + 6 y
         s.a. 2x + 2y <= 120
              15x + 45 y <= 2400
              60 x + 30y <= 2400
        */
    }
}
