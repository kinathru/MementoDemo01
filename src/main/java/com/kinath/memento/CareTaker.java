package com.kinath.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kinath on 08/03/2017.
 */
public class CareTaker
{
    List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state)
    {
        mementoList.add( state );
    }

    public Memento get(int index)
    {
        return mementoList.get( index );
    }
}
