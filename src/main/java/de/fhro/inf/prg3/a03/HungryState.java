package de.fhro.inf.prg3.a03;

public class HungryState extends State {
    public HungryState(int duration, Animal animal) {
        super(duration, animal);
    }

    @Override
    State successor() {
        return new SleepingState(10, animal);
    }

    State feed() {
        return new DigestingState(animal.getDigest(), animal);
    }
}
