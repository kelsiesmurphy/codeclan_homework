package staff;

public class CabinCrewMember extends Staff {
    public CabinCrewMember(String name, RankType rank) {
        super(name, rank);
    }

    public String relayMessage(String message) {
        return message;
    }
}
