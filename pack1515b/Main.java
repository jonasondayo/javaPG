package pack1515b;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("表示する図形の個数は?:");
        int num = sc.nextInt();
        Shape[] p = new Shape[num];

        for (int i = 0; i < num; i++) {
            int type;
            do{
                System.out.printf("%d番の図形種類(1:点 / 2: 水平直線 / 3:垂直直線/ 4:長方形/ 5:正方形/ 6:直角三角形):" , i+1);
                type = sc.nextInt();
            }while(type < 1 || type > 6);
            switch(type){
                case 1:
                    p[i] = new Point();
                    break;
                case 2:
                case 3:
                    System.out.print("長さ:");
                    int length = sc.nextInt();
                    p[i] = (type == 2) ? new HorzLine(length) : new VertLine(length);
                    break;
                case 4:
                    System.out.print("幅:");
                    int width = sc.nextInt();
                    System.out.print("高さ");
                    int height = sc.nextInt();
                    p[i] = new Reactangle(width, height);
                    break;
                case 5:
                case 6:
                    System.out.print("１辺の長さ:");
                    int side = sc.nextInt();
                    p[i] = (type == 5) ? new EqTriangle(side) : new RightTriangle(side);
            }
        }
        

        System.out.print("\n 指定された図形を表示します。\n");

        for (Shape s : p) {
            s.print();
            if (s instanceof Plane2D) {
                ((Plane2D)s).printArea();
            }
            System.out.println();
        }
    }
}