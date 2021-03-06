
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
 * Created by ljuarezr on 10/2/15.
 */
public class TripleController {
    //Lazy Singleton
    private static TripleBuzzerCounts tripleCounts = null;

    static public TripleBuzzerCounts getTripleCounts(){
        if (tripleCounts == null) {
            tripleCounts = new TripleBuzzerCounts();
        }
        return tripleCounts;
    }

    public void incrementP1(){
        getTripleCounts().incrementP1();
    }

    public void incrementP2(){
        getTripleCounts().incrementP2();
    }

    public void incrementP3(){
        getTripleCounts().incrementP3();
    }


    public void clear(){
        getTripleCounts().clear();
    }

    public int getP13(){return getTripleCounts().getP1();}
    public int getP23(){return getTripleCounts().getP2();}
    public int getP33(){return getTripleCounts().getP3();}

    public List<Integer> getStatsList() {return getTripleCounts().getStatsList();}

}
