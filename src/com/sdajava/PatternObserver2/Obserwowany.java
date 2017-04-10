package com.sdajava.PatternObserver2;


public interface Obserwowany {

    public void dodajObserwatora(Obserwator obserwator);
    public void usunObserwatora(Obserwator obserwator);
    public void powiadamiajObserwatorow();

}
