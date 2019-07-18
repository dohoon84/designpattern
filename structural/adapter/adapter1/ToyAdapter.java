package structual.adapter1;

public class ToyAdapter implements Doll{

    private Toy toy;

    public ToyAdapter(Toy toy){
        this.toy = toy;
    }

    @Override
    public void play(String name) {
        toy.display(name);
    }
}
