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