
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
        System.out.println("this.getSide()" + this.getSide());
        for(int i = 0; i < this.getSide(); i++) {
            for(int j = 0; j < i +1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}