package de.fhro.inf.prg3.a03;

public class PayfullState extends State {
    public PayfullState(int duration, Animal animal) {
        super(duration, animal);
    }

    @Override
    State successor() {
        return new SleepingState(animal.getSleep(), animal);
    }
}
