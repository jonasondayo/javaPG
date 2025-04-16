public class Computer extends TangibleAseet {
    String makerName;

    public Computer (String name, int price, String color, String isbn, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    public String getMakerName() { return this.makerName; }
}