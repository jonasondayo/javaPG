package pack1515b;

class RightTrianle extends AbstTriangle {
    RightTrianle(int side) {
        super(side);
    }
    @Override
    public String toString() {
        return "RightTrianle(side:" + this.getSide() + ")";
    }

    @Override
    void draw() {
        for(int i = 0; i <this.getSide(); i++) {
            for (int j =0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}