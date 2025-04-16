import java.util.*;

public class Cleric {
    String name;
    int hp = 50;
    final int Max_hp= 50;
    int mp = 10;
    final int Max_mp = 10;
    
    public void selfAid () {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp=-10;
        this.hp = this.Max_hp;
        System.out.println("HPが最大値まで回復した");
    }

    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒間天に祈った");

        int recover = new Random().nextInt(3) + sec;
        
        //int recoverActual = Math.min(this.Max_mp - this.mp, recover);
        if (this.mp+ recover > this.Max_mp) {
            this.mp = this.Max_mp;
            recover = this.Max_mp - this.mp;
        } else {
            this.mp += recover;
        }
        //this.mp += recoverActual;
        // System.out.println("MPが" + recoverActual + "回復した");
        System.out.println("MPが" + recover + "回復した");
        //return recoverActual;
        return recover;

    }
}