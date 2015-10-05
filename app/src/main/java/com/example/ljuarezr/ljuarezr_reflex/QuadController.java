
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

public class QuadController {

    //Lazy Singleton
    private static QuadBuzzerCounts quadCounts = null;

    static public QuadBuzzerCounts getQuadCounts(){
        if (quadCounts == null) {
            quadCounts = new QuadBuzzerCounts();
        }
        return quadCounts;
    }

    public void incrementP1(){
        getQuadCounts().incrementP1();
    }

    public void incrementP2(){
        getQuadCounts().incrementP2();
    }

    public void incrementP3(){
        getQuadCounts().incrementP3();
    }

    public void incrementP4(){
        getQuadCounts().incrementP4();
    }

    public void clear(){
        getQuadCounts().clear();
    }

    public int getP14(){return getQuadCounts().getP1();}
    public int getP24(){return getQuadCounts().getP2();}
    public int getP34(){return getQuadCounts().getP3();}
    public int getP44(){return getQuadCounts().getP4();}

    public List<Integer> getStatsList() {return getQuadCounts().getStatsList();}

}
