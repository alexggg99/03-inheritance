package de.fhro.inf.prg3.a03;

public class DigestingState extends State {
    public DigestingState(int duration, Animal animal) {
        super(duration, animal);
    }

    @Override
    State successor() {
        return new PayfullState(5, animal);
    }
}
