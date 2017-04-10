package com.sdajava.PatternObserver2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TotoLotek  implements  Obserwowany{

    private List<Integer> wyniki;
    ArrayList<Obserwator> observers = new ArrayList<Obserwator>();

    public TotoLotek(){
        this.wyniki = new ArrayList<Integer>();
        Random ran = new Random();
            for (int i = 0; i < 2; i++) {
                this.wyniki.add(ran.nextInt(49));
            }
    }

    public void kolejneLosowanie(){
        this.wyniki = new ArrayList<Integer>();
        Random ran = new Random();
            for (int i = 0; i < 2; i++) {
                wyniki.add(ran.nextInt(49));
            }
        this.wyniki = wyniki;
        powiadamiajObserwatorow();
    }

    @Override
    public void dodajObserwatora(Obserwator obserwator) {
        this.observers.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        this.observers.remove(obserwator);
    }

    @Override
    public void powiadamiajObserwatorow() {
        refreshObservers();
    }

    public void refreshObservers(){
        observers.forEach(o -> o.update(getWyniki()));


    }
    public List<Integer> getWyniki() {
        return this.wyniki;
    }
}
