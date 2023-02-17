package internal.transport;

public abstract class Transport {
    private String color;
    private float speed;
    private int weight;
    private String brand;
    private int yearOfIssue;

    public Transport() {}

    public Transport(String color, float speed, int weight, String brand, int yearOfIssue) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
    }

    public String info(String color, float speed, int weight, String brand, int yearOfIssue) {
        return  ". Brand: " + brand + ". Year of issue: " + yearOfIssue + ". Weight: " + weight+ ". Color: " + color + ". Speed: " + speed ;
    }

    public String info() {
        return  ". Brand: " + brand + ". Year of issue: " + yearOfIssue + ". Weight: " + weight+ ". Color: " + color + ". Speed: " + speed ;
}

    public final class Get {
       // return Automobile color
        public String color() {
            return color;
        }
       // return Automobile speed
        public float speed() {
            return speed;
        }
       // return Automobile weight
        public int weight() {
            return weight;
        }
       // return Automobile brand
        public String brand() {
            return brand;
        }
        // return year of issue Automobile
        public int yearOfIssue() {
            return yearOfIssue;
        }
   }
}
