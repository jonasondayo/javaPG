public class Wand {
    private String name;
    private double power;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (name.length() >= 3 && name != null) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("名前が異常です");
        }
    }
    public double getPower() {
        return this.power;
    }
    public void setPower(double power) {
        this.power = power;
    }
}