public class Reactangle  extends Polygon {
    Reactangle(int side) {
        super(side);
        this.setName("正方形");
    }

    int perimeter() {
        return this.getSide() * 4;
    }

    double area() {
        return this.getSide() * this.getSide();
    }
}
