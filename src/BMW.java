public class BMW extends Car {

    private boolean isCoupe;
    private int series;
    private boolean isMechanical;

    public boolean isCoupe() {
        return isCoupe;
    }

    public void setCoupe(boolean coupe) {
        isCoupe = coupe;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        if (series > 0 && series <= 8) {
            this.series = series;
        } else {
            System.out.println("Enter number from 1 - 8");
        }
    }

    public boolean isMechanical() {
        return isMechanical;
    }

    public void setMechanical(boolean mechanical) {
        isMechanical = mechanical;
    }

    public void print() {
        super.print();
        System.out.println("Is coupe: " + (isCoupe));
        System.out.println("Series: " + series);
        System.out.println("Is Mechanical: " + isMechanical);
        System.out.println();
    }
}
