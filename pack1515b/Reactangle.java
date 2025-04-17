package pack1515b;

class Reactangle extends Shape implements Plane2D {
    private int width, height;

    Reactangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Reactangle(width:" + this.width + ", height" + this.height + ")";
    }

    @Override
    void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("*");
            }
            // プリント
            System.out.println("*");
        }
    }

    @Override
    public void printArea() {
        int area = this.width * this.height;
        System.out.printf("面積：　%d\n", area);
    }
}