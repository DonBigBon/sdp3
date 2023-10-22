package adapter;

public class NinjaAdapter implements Ninja {
    private Naruto Naruto;
    private Sasuke Sasuke;

    public NinjaAdapter(Naruto Naruto, Sasuke Sasuke) {
        this.Naruto = Naruto;
        this.Sasuke = Sasuke;
    }

    @Override
    public void performNinjaTechnique() {
        Naruto.techniqueA();
        Sasuke.techniqueB();
        System.out.println("Naruto and Sasuke combine their techniques!");
        System.out.println("Uraaaa! They've won Madara!!!!");
    }
}
