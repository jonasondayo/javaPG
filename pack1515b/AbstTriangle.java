package pack1515b;

abstract class AbstTriangle extends Shape implements Plane2D {
    private int side;

    AbstTriangle(int side) {
        this.side = side;
    }

    int getSide() {
        return this.side;
    }

    void setSide(int side) {
        this.side = side;
    }

    @Override
    public void printArea() {
        double area = this.side * this.side / 2.0;
        System.out.printf("面積:%.2f\n", area);
    }
}