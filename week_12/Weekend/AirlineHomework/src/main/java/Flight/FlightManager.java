package Flight;

public class FlightManager {

    private double baggageWeightKgPerPerson = 20;

    public double calcBaggageWeightReservedPerCustomer(Flight flight) {
        return baggageWeightKgPerPerson * flight.getPlane().getPlaneType().getCapacity();
    }

    public double calcBaggageWeightBookedByCustomers(Flight flight) {
        return baggageWeightKgPerPerson * flight.getPassengers().size();
    }

    public double calcRemainingBaggageWeight(Flight flight) {
        double maxBaggageWeight = baggageWeightKgPerPerson * flight.getPlane().getPlaneType().getCapacity();
        return maxBaggageWeight - (baggageWeightKgPerPerson * flight.getPassengers().size());
    }
}
