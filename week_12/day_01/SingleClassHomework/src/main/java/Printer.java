public class Printer {
    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }
    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public String print(int pages, int copies) {
        int pagesPrinted = pages * copies;
        if (this.sheetsLeft >= pagesPrinted) {
            this.sheetsLeft = sheetsLeft - pagesPrinted;
            this.tonerVolume = this.tonerVolume - pagesPrinted;
            return (String.format("%s pages have been printed", pagesPrinted));
        }
        else {
            return "Not enough paper!";
        }
    }
}
