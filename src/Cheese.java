public class Cheese extends Food {

    public Cheese() {
        super("Cheese");
    }

    @Override
    public void consume() {
        System.out.println(this + " has been eaten.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
