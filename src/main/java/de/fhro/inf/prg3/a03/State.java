package de.fhro.inf.prg3.a03;

import java.util.logging.Logger;

public abstract class State {
    protected Logger logger = Logger.getLogger(getClass().getName());
    protected Animal animal;
    private int t;
    private int duration;

    public State(int duration, Animal animal) {
        this.duration = duration;
        this.animal = animal;
    }

    State tick() {
        t++;
        if (t == duration) {
            return successor();
        }
        return this;
    }

    abstract State successor();

}
