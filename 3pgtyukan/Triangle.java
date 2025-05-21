
class Triangle extends Polygon {
    Triangle(int side){
        super(side);
        this.setName("正三角形");
    }
    
    @Override
    int perimeter(){                   // 周囲の長さ＝1辺の長さ×3
        return this.getSide() * 3;    
    }
    @Override
    double area(){                      // 面積はヘロンの公式をa=b=cとして使用
        double s = this.getSide() * 3 / 2.0;
        return Math.sqrt(s * Math.pow(s-this.getSide(),3));
    }
}
