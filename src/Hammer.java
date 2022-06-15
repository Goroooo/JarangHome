public class Hammer extends Car {

    private boolean isMilitary;
    private int wheels;
    private boolean isBroned;
    private double litres;

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        if (wheels == 4 || wheels == 6)
            this.wheels = wheels;
    }

    public boolean isBroned() {
        return isBroned;
    }

    public void setBroned(boolean broned) {
        isBroned = broned;
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        if (litres > 0 && litres < 700)
            this.litres = litres;
    }

    public Hammer(boolean isMilitary, int wheels, boolean isBroned, double litres) {
        this.isMilitary = isMilitary;
        this.wheels = wheels;
        this.isBroned = isBroned;
        this.litres = litres;
    }

    public void print() {
        super.print();
        System.out.println("Is military: " + isMilitary);
        System.out.println("Wheels: " + wheels);
        System.out.println("Is broned: " + isBroned);
        System.out.println("Litres: " + litres);
        System.out.println();
    }
}
