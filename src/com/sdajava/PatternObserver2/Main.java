package com.sdajava.PatternObserver2;

public class Main {

    public static void main(String[] args) {

        TotoLotek lotek = new TotoLotek();

        Telewizja telewizja = new Telewizja(lotek);
        lotek.dodajObserwatora(telewizja);

        Internet internet = new Internet(lotek);
        lotek.dodajObserwatora(internet);
        lotek.powiadamiajObserwatorow();


        telewizja.informuj();
        internet.informuj();

        lotek.kolejneLosowanie();

        telewizja.informuj();
        internet.informuj();

        lotek.usunObserwatora(telewizja);


        lotek.kolejneLosowanie();

        telewizja.informuj();
        internet.informuj();



    }
}
