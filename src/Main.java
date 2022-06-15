public class Main {
    public static void main(String[] args) {

        BMW b1 = new BMW();
        b1.setModel("BMW");
        b1.setPrice(200000);
        b1.setYear(2022);
        b1.setSpeed(420);
        b1.setSeries(30);
        b1.setCoupe(true);
        b1.setMechanical(false);
        b1.print();

        Hammer hammer = new Hammer(true,6,true,550.78);
        hammer.setModel("Hammer");
        hammer.setPrice(75000);
        hammer.setYear(2015);
        hammer.setSpeed(220);
        hammer.print();


        System.out.println(b1.isSportCar(500));
        b1.superCar(2022, 400, 350000);
        b1.newSeries(2025);





    }
}
