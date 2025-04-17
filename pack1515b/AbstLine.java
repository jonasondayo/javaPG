

abstract class AbstLine extends Shape {
    private int length;

    AbstLine(int length) {
        this.length = length;
    }

    int getLength() {
        return this.length;
    }

    void setLength(int length) {
        this.length = length;
    }
}
