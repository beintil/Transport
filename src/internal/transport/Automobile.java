package internal.transport;
public class Automobile extends Transport {
    private final String view = "View Transport: Automobile";
    public Get get = new Get();

    public Automobile() {}
    public Automobile(String color, float speed, int weight, String brand, int yearOfIssue) {
        super(color, speed, weight, brand, yearOfIssue);
    }
    @Override
    public String info() {
        return view + super.info();
    }

    @Override
    public String info(String color, float speed, int weight, String brand, int yearOfIssue) {
        return view + super.info(color, speed, weight, brand, yearOfIssue);
    }
}
