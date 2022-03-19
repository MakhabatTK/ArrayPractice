public enum Car {
    FIRST("AUDI"),
    SECOND("MERCEDES"),
    THIRD("FORD"),
    FORTH("HONDA"),
    FIFTH("HYUNDAI"),
    SIXTH("SUBARU"),
    SEVENTH("LADA");


    private String brand;

    public String getBrand() {
        return brand;
    }

    Car(String brand) {
        this.brand = brand;
    }
}
