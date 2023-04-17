import attractions.*;
import behaviours.IReviewed;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.Stall;
import stalls.TobaccoStall;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ThemePark {

//   Stalls
    private ArrayList<Stall> stalls;
//    Attractions
    private ArrayList<Attraction> attractions;


    private ArrayList<IReviewed> reviews;

    public ThemePark() {
        this.stalls = new ArrayList<>();
        this.attractions = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return reviews;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addVisitedAttraction(attraction);
    }


}
