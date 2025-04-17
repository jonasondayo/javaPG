package pack1515b;

class VertLine extends AbstLine {
    VertLine(int length) {
        super(length);
    }

    @Override
    public String toString() {
        return "VertLine(length:" + this.getLength() + ")";
    }

    @Override
    void draw() {
        for (int i = 0; i < this.getLength(); i++) {
            System.out.println("|");
        }
    }
}