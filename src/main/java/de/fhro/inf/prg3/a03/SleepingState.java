package de.fhro.inf.prg3.a03;

public class SleepingState extends State {
    public SleepingState(int duration, Animal animal) {
        super(duration, animal);
    }

    @Override
    State successor() {
        return new HungryState(animal.getAwake(), animal);
    }
}
