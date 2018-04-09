package de.fhro.inf.prg3.a03;

public class DeathState extends State {
    public DeathState(int duration, Animal animal) {
        super(duration, animal);
    }

    @Override
    State successor() {
        return null;
    }
}
