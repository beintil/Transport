package internal.transport;
public class Automobile extends Transport {
    private final String view = "Automobile";
    public Get get = new Get();

    public final class Get extends Transport.Get {
        public String view() {
            return view;
        }
    }

    public Automobile() {}
    public Automobile(String color, float speed, int weight, String brand, int yearOfIssue) {
        super(color, speed, weight, brand, yearOfIssue);
    }
    @Override
    public String info() {
        return "View Transport: " + view + super.info();
    }

    @Override
    public String info(String color, float speed, int weight, String brand, int yearOfIssue) {
        return "View Transport: " + view + super.info(color, speed, weight, brand, yearOfIssue);
    }
}
