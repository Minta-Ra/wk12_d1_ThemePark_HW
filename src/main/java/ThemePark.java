import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> allReviewed;

    public ThemePark(){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.allReviewed = new ArrayList<IReviewed>();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public int getAttractions() {
        return attractions.size();
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public int getStalls() {
        return stalls.size();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        for(Attraction attraction : attractions){
            allReviewed.add(attraction);
        }
        for(Stall stall : stalls){
            allReviewed.add(stall);
        }
        return allReviewed;
    }

}
