public class Apple extends Food {
    private String size;

    public Apple(String size) {
        super("Apple");
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void consume() {
        System.out.println(this + " of size " + size + " has been eaten.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Apple apple = (Apple) obj;
        return size.equals(apple.size);
    }

    @Override
    public String toString() {
        return super.toString() + " of size '" + size + "'";
    }
}