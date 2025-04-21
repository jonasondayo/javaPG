package pack1515b;

class EqTriangle extends AbstTriangle {
    EqTriangle(int side) {
        super(side);
    }

    @Override
    public String toString() {
        return "EqTriangle(side:" + this.getSide() + ")";
    }

    @Override
    void draw() {
        for (int i = 1; i < this.getSide(); i++) {
            for(int j = 1; j <=this.getSide()-i;j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

