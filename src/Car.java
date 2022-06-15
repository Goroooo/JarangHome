public class Car implements Transport {

    private String model;
    private int price;
    private int year = 2022;
    private int speed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null)
            this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0)
            this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1900 && year <= 2022)
            this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0)
            this.speed = speed;
    }

    @Override
    public boolean isSportCar(int speed) {
        return speed > 400;
    }

    @Override
    public void superCar(int year, int speed, int price) {
        if (year > 2020 && speed > 300 && price > 200000) {
            System.out.println("It's a super car");
        } else {
            System.out.println("No super cars");
        }
    }

    @Override
    public void newSeries(int year) {
        if (year >= 2021) {
            System.out.println("New series");
        } else {
            System.out.println("All cars are old series");
        }
    }

    public void print(){
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + getPrice());
        System.out.println("Year: " + getYear());
        System.out.println("Speed: " + getSpeed());
    }

    public Car(){

    }
    public Car(String model, int price, int year, int speed) {
        this.model = model;
        this.price = price;
        this.year = year;
        this.speed = speed;
    }
}
