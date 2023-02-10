package plane;

public enum PlaneType {
    BOEING747(366, 412770),
    BOEING767(269, 347996),
    BOEING777(312, 347450),
    COMACC919(156, 72500),
    AIRBUSA380(500, 573794);

    private int capacity;
    private double totalWeightKg;

    PlaneType(int capacity, double totalWeightKg) {
        this.capacity = capacity;
        this.totalWeightKg = totalWeightKg;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getTotalWeightKg() {
        return totalWeightKg;
    }

    public void setTotalWeightKg(double totalWeightKg) {
        this.totalWeightKg = totalWeightKg;
    }
}
