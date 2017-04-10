package com.sdajava.PatternObserver2;


import java.util.List;

public class Internet implements Media, Obserwator{

    private TotoLotek lotek;
    private List<Integer> wyniki;


    public Internet(TotoLotek lotek) {
        this.lotek = lotek;
    }

    @Override
    public void informuj() {
        for(Integer p : this.wyniki){
            System.out.println(p);
        }
    }

    @Override
    public void update(List<Integer> wyniki) {
        this.wyniki = wyniki;
    }

    public void spadam(){
    }

}
