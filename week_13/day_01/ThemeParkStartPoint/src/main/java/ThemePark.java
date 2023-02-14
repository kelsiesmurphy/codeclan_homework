import attractions.Attraction;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void setStalls(ArrayList<Stall> stalls) {
        this.stalls = stalls;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewedItems = new ArrayList<>();
        reviewedItems.addAll(this.attractions);
        reviewedItems.addAll(this.stalls);
        return reviewedItems;
    }


    public void visit(Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addAttraction(attraction);
    }

    public HashMap<String, Integer> allReviews() {
        HashMap<String, Integer> allReviewsHashMap = new HashMap<>();
        ArrayList<IReviewed> allReviews = this.getAllReviewed();

        for (IReviewed review : allReviews) {
            allReviewsHashMap.put(review.getName(), review.getRating());
        }
        return allReviewsHashMap;
    }

    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor) {
        ArrayList<IReviewed> allowedToGoOn = new ArrayList<>();

        ArrayList<IReviewed> allReviews = this.getAllReviewed();

        for (IReviewed review : allReviews) {
            if(review instanceof ISecurity) {
                if(((ISecurity) review).isAllowedTo(visitor)){
                    allowedToGoOn.add(review);
                }
            }
            else {
                allowedToGoOn.add(review);
            }
        }
        return allowedToGoOn;
    }
}
