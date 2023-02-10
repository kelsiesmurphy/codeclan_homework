package staff;

import staff.RankType;

public class Staff {
    private String name;
    private RankType rank;

    public Staff(String name, RankType rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RankType getRank() {
        return rank;
    }

    public void setRank(RankType rank) {
        this.rank = rank;
    }
}
