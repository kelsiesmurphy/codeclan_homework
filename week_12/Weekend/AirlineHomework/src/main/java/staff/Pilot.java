package staff;

public class Pilot extends Staff {
    private String licenseNumber;

    public Pilot(String name, RankType rank, String licenseNumber) {
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String flyPlane() {
        return "Neowwwwwwwww";
    }
}