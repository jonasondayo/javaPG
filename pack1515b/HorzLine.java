package pack1515b;

class HorzLine extends AbstLine {
    HorzLine (int length) {
        super(length);
    }

    @Override
    public String toString() {
        return "HorzLine(lengh:" + this.getLength() + ")";
    }

    @Override
    void draw() {
        for (int i = 0; i < this.getLength(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}