import java.util.Objects;

public class Cake extends Food {
    private String icing;

    public Cake(String icing) {
        super("Cake");
        this.icing = icing;
    }

    public String getIcing() {
        return icing;
    }

    @Override
    public void consume() {
        System.out.println(this + " with " + icing + " icing has been eaten.");
    }

    @Override
    public String toString() {
        return super.toString() + " with icing='" + icing + "'";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!super.equals(o)) return false;
//        Cake cake = (Cake) o;
//        return Objects.equals(icing, cake.icing);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), icing);
    }
}