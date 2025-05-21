
abstract class Polygon{
    private int side;              // 1辺の長さ
    private String name;           // 図形の名称
    Polygon(int side){
        this.side = side; 
    }
    abstract int perimeter();     // 周囲の長さを返すメソッド perimeter()
    abstract double area();       // 面積を返すメソッド       area()

    void setName(String name){    // セッターメソッド
        this.name = name;
    }
    String getName(){              // ゲッターメソッド(name)
        return this.name;
    }
    int getSide(){                 // ゲッターメソッド(side)
        return this.side;
    }
    @Override
    public String toString(){
        return this.getName()+"\n(周囲の長さ)"+this.perimeter()+"cm"+" / (面積)"+this.area()+"cm2";
    }
}
