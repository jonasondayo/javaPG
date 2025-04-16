
public abstract class TangibleAseet extends Aseet implements Thing {
    String color;
    double weight;

    public TangibleAseet (String name, int price, String color, double weight) {
        super(name, price);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() { return this.color; }
    public String getWeight() { return this.weight; }
    public void setWeight(double weight) { this.weight = weight}
}