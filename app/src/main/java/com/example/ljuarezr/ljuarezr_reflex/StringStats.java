package com.example.ljuarezr.ljuarezr_reflex;

import java.util.List;

/**
 * Created by ljuarezr on 10/4/15.
 */
public class StringStats {
    ReactionTimeStatsController rtsControl = new ReactionTimeStatsController();
    private String reactionStats = rtsControl.getReactionTimesList().toString();

    DoubleController dControl = new DoubleController();
    private String doubleStats = dControl.getStatsList().toString();

    TripleController tControl = new TripleController();
    private String  tripleStats = tControl.getStatsList().toString();

    QuadController qControl = new QuadController();
    private String quadStats = qControl.getStatsList().toString();


    private String AllStats = "Reaction Stats: " + reactionStats +
                              "Two Player Game Stats:" + doubleStats +
                              "Three Player Game Stats:" + tripleStats +
                              "Two Player Game Stats:" + quadStats;

    public String getStats(){return AllStats;}








}
