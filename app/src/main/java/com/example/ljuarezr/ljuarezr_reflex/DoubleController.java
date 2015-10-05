
/*
Ljuarezr-reflex - Reaction timer and Gameshow buzzer application.
Copyright (C)2014, 2015,  Laura Patricia Juarez Reyes, Abram Hindle
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
 * Created by ljuarezr on 10/2/15.
 */
public class DoubleController {

    //Lazy Singleton
    private static DoubleBuzzerCounts doubleCounts = null;

    static public DoubleBuzzerCounts getDoubleCounts(){
        if (doubleCounts == null) {
            doubleCounts = new DoubleBuzzerCounts();
        }
        return doubleCounts;
    }

    public void incrementP1(){
        getDoubleCounts().incrementP1();
    }

    public void incrementP2(){
        getDoubleCounts().incrementP2();
    }

    public void clear(){
        getDoubleCounts().clear();
    }

    public int getP12(){return getDoubleCounts().getP1();}
    public int getP22(){return getDoubleCounts().getP2();}

    public List<Integer> getStatsList() {return getDoubleCounts().getStatsList();}




}
