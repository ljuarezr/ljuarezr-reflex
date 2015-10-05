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
