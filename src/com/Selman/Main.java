package com.Selman;

public class Main {

    public static void main(String[] args) {

        MyLife ml = new MyLife();
        //Overloading
        OverLoading olm = new OverLoading();
        double result;
        olm .demo(11.34);
        olm .demo(10, 20);
        result = olm .demo(5.5);
        System.out.println("O/P : " + result);

        //Overriding
        Dog dog = new Dog();
        dog.sound();
        Human hmn = new Human();
        hmn.sound();

        ml.myLife1("relaxing");
        ml.myLife2("Concordia",3);
        ml.myLife3("on Science","on Math","Physicist");
        ml.myLife4(26,30);
        ml.myLife5(4);

    }
}
