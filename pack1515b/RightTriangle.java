package pack1515b;

class RightTriangle extends AbstTriangle {
    RightTriangle(int side) {
        super(side);
    }
    @Override
    public String toString() {
        return "RightTriangle(side:" + this.getSide() + ")";
    }

    @Override 
    void draw() {
        for(int i = 0; i <this.getSide(); i++) {
            for(int j = 0; j < j +1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}