package attractions;

import people.Visitor;

public class RollerCoaster  extends Attraction {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 145;
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200) {
            return this.defaultPrice() * 2;
        } else {
            return this.defaultPrice();
        }
    }
}
