package com.sdajava.PatternObserver2;


import java.util.List;

public class Telewizja implements Media, Obserwator {

    private TotoLotek lotek;
    private List<Integer> wyniki;


    public Telewizja(TotoLotek lotek) {
        this.lotek = lotek;
        update(lotek.getWyniki());
    }

    @Override
    public void informuj() {
        for(Integer p : wyniki){
            System.out.println(p);
        }
    }

    @Override
    public void update(List<Integer> wyniki) {
        this.wyniki = wyniki;
    }

    public void spadam() {

    }
}
