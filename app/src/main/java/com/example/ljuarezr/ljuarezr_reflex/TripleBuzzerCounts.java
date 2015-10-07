
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
 * Created by ljuarezr on 10/1/15.
 */
public class TripleBuzzerCounts {
    private int p1;
    private int p2;
    private int p3;
    private List<Integer> list;

    public TripleBuzzerCounts(){
        p1 = 0;
        p2 = 0;
        p3 = 0;
    }

    public void incrementP1(){
        p1 = p1 +1;
    }

    public void incrementP2(){
        p2 = p2 +1;
    }
    public void incrementP3(){
        p3 = p3 +1;
    }
    public void clear(){
        p1 = 0;
        p2 = 0;
        p3 = 0;
    }
    public int getP1() {return p1;}
    public int getP2() {return p2;}
    public int getP3() {return p3;}

    public List<Integer> getStatsList(){
        list.add(p1);
        list.add(p2);
        list.add(p3);
        return list;}
}

