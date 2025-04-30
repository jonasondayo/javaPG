
import java.util.ArrayList;

class CollectArray00 {
    public static void main(String[] args) {
        ArrayList<String> stations = new ArrayList<>();
        stations.add("名古屋");
        stations.add("金山");
        stations.add("知立");
        System.out.println("Easy01"+ stations);

        stations.add(1, "神宮前");
        System.out.println("Easy02"+ stations);

        stations.set(stations.indexOf("知立"), "東岡崎");

        System.out.println("Easy03"+ stations);

        String station = "神宮前";
        int num = stations.indexOf(station);
        System.out.printf("Easy04%sは%d番目にある\n", station, num);

        int Snum = 3;
        System.out.printf("Easy05:%d番目は%sである\n", Snum, stations.get(Snum));

    }
}