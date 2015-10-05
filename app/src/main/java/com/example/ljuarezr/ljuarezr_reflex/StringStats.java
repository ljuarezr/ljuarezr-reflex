
/*
Ljuarezr-reflex - Reaction timer and Gameshow buzzer application.
Copyright (C)2015,  Laura Patricia Juarez Reyes
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
 */
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
