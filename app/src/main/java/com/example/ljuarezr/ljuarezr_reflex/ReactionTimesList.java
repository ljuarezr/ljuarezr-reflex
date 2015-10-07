
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by ljuarezr on 9/28/15.
 */
public class ReactionTimesList {

    private ArrayList<Integer> reactionStatList = new ArrayList<>();

    public void clearAll(){
        reactionStatList.clear();
        assertEquals(0, reactionStatList.size());
    }

    public void addSingleBuzz(int singleBuzz) {
        reactionStatList.add(singleBuzz);
        assertTrue(reactionStatList.contains(singleBuzz));
    }

    public ArrayList<Integer> getLast10 () {
        //Two cases:
        //Case 1. the list has 10 or more items
        //Then just get the last ten items
        if (reactionStatList.size() >= 10) {
            ArrayList last10list;
            last10list =(ArrayList) reactionStatList.subList((reactionStatList.size() - 10),
                    (reactionStatList.size() - 1));
            return last10list;
        } else {
            //Case 2. the list has less than 10 items (even 0)
            //Return the list as is, if we add 0s to fill the missing values,
            //we would skew the final stat values
            return reactionStatList;
        }
    }

    public ArrayList<Integer> getLast100() {
        //Two cases:
        //Case 1. the list has 10 or more items
        //Then just get the last 100 items
        if (reactionStatList.size() >= 100) {
            ArrayList<Integer> last100list;
            last100list = (ArrayList) (reactionStatList.subList((reactionStatList.size() - 100),
                    (reactionStatList.size() - 1)));
            //want to return an ArrayList, not a List!!
            return last100list;
        } else {
            //Case 2. the list has less than 100 items (even 0)
            //Return the list as is, if we add 0s to fill the missing values,
            //we would skew the final stat values
            return reactionStatList;
        }
    }

    public ArrayList<Integer> getAllTime(){
        return reactionStatList;
    }

    public int getMin(ArrayList<Integer> buzzList) throws EmptyReactionTimesListException {
        int size = buzzList.size();
        if (size <= 0) {
            throw new EmptyReactionTimesListException();
        }
        int min = Collections.min(buzzList);
        return min;
    }


    public int getMax(ArrayList<Integer> buzzList) throws EmptyReactionTimesListException {
        int size = buzzList.size();
        if (size <= 0) {
            throw new EmptyReactionTimesListException();
        }
        int max = Collections.max(buzzList);
        return max;
    }

    public int getAvg(ArrayList<Integer> buzzList) throws EmptyReactionTimesListException {
        int size = buzzList.size();
        if (size <= 0) {
            throw new EmptyReactionTimesListException();
        }
        int sum = buzzList.get(0);
        int index = 1;
        while (index < size){
            sum += buzzList.get(index);
            index = index +1;
        }
        return sum/size ;
    }

    public int getMed(ArrayList<Integer> buzzList) throws EmptyReactionTimesListException {
        int size = buzzList.size();
        if (size <= 0) {throw new EmptyReactionTimesListException();}
        Collections.sort(buzzList);
        int medIndex = (int)Math.floor(size/2);
        return buzzList.get(medIndex);
    }


}
