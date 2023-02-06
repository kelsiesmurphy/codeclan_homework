public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void drink() {
        this.volume = this.volume - 10;
    }

    public void empty() {
        this.volume = 0;
    }

    public void refill() {
        this.volume = 100;
    }
}
