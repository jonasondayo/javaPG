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
        System.out.println("this.getSide()" + this.getSide());
        for(int i = 1; i <= this.getSide(); i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}