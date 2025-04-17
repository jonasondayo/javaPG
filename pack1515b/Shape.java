

abstract class Shape {
    @Override
    public abstract String toString();

    abstract void draw();

    void print() {
        System.out.println(toString());
        draw();
    }
}
