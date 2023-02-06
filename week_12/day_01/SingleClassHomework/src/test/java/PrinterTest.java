import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void setup() {
        printer = new Printer(50, 100);
    }

    @Test
    public void printerStartsWith50PagesLeft() {
        assertEquals(50, printer.getSheetsLeft());
    }

    @Test
    public void printerHasEnoughPaper() {
        assertEquals("15 pages have been printed", printer.print(5, 3));
    }

    @Test
    public void printerDoesNotHaveEnoughPaper() {
        assertEquals("Not enough paper!", printer.print(25, 3));
    }

    @Test
    public void printerReducesPaperValue() {
        printer.print(5, 3);
        assertEquals(35, printer.getSheetsLeft());
    }

    @Test
    public void printerStartsWith100TonerVolume() {
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void printerLoses1TonerVolumePerPagePrinted() {
        printer.print(3, 5);
        printer.print(2, 3);
        assertEquals(79, printer.getTonerVolume());
    }
}
