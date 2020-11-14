package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Trainer> trainers=new ArrayList<Trainer>();
        Trainer trainer1=new Trainer("Dimitris","Nikolidakis","Java");
        Trainer trainer2=new Trainer("Lefteris","Papadogiannhs","tipota");
        Trainer trainer3=new Trainer("mixalis","karvelas","How to become a trash");
        trainers.add(trainer1);
        trainers.add(trainer2);
        trainers.add(trainer3);
        for(int i=0; i<trainers.size(); i++)
        System.out.println(trainers);//edw thelw na dialegw ti tha kanw print apo kathe trainer.px mono ta onomata.xwris na xrhsimopoihsw to string
        System.out.println(trainer1.getFirstName());//oxi omws apo ton trainer1,trainer2,trainer3. apo thn lista trainers mporw na dialeksw ti tha ektupwsw apo to object p petaksa mesa?
    }
}
