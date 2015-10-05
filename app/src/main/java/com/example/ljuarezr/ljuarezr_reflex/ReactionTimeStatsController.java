package com.example.ljuarezr.ljuarezr_reflex;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by ljuarezr on 10/1/15.
 */
public class ReactionTimeStatsController {

    //Lazy Singleton
    private static ReactionTimesList  reactionTimesList = null;
    static public ReactionTimesList getReactionTimesList() {
        if (reactionTimesList == null){
            reactionTimesList = new ReactionTimesList();
        }
        return reactionTimesList;
    }


    public void clearAll(){
        getReactionTimesList().clearAll();
    }

    public void addSingleBuzz(int singleBuzz) {
        getReactionTimesList().addSingleBuzz(singleBuzz);
    }

    /*
    public ArrayList<Integer> getLast10 () {
        return getReactionTimesList().getLast10();
    }

    public ArrayList<Integer> getLast100 () {
        return getReactionTimesList().getLast100();
    }

    public ArrayList<Integer> getAllTime() {
        return getReactionTimesList().getAllTime();
    }
    */
    public List<Integer> getMinBuzz() throws EmptyReactionTimesListException{;
        List<Integer> mins = new ArrayList<>();
            mins.add(getReactionTimesList().getMin(getReactionTimesList().getLast10()));
            mins.add(getReactionTimesList().getMin(getReactionTimesList().getLast100()));
            mins.add(getReactionTimesList().getMin(getReactionTimesList().getAllTime()));
        return mins;
    }

    public List<Integer> getMaxBuzz() throws EmptyReactionTimesListException{;
        List<Integer> maxs = new ArrayList<>();
        maxs.add(getReactionTimesList().getMax(getReactionTimesList().getLast10()));
        maxs.add(getReactionTimesList().getMax(getReactionTimesList().getLast100()));
        maxs.add(getReactionTimesList().getMax(getReactionTimesList().getAllTime()));
        return maxs;
    }

    public List<Integer> getAvgBuzz() throws EmptyReactionTimesListException{;
        List<Integer> avgs = new ArrayList<>();
        avgs.add(getReactionTimesList().getAvg(getReactionTimesList().getLast10()));
        avgs.add(getReactionTimesList().getAvg(getReactionTimesList().getLast100()));
        avgs.add(getReactionTimesList().getAvg(getReactionTimesList().getAllTime()));
        return avgs;
    }

    public List<Integer> getMedBuzz() throws EmptyReactionTimesListException{;
        List<Integer> meds = new ArrayList<>();
        meds.add(getReactionTimesList().getMed(getReactionTimesList().getLast10()));
        meds.add(getReactionTimesList().getMed(getReactionTimesList().getLast100()));
        meds.add(getReactionTimesList().getMed(getReactionTimesList().getAllTime()));
        return meds;
    }

}
