package com.sofkaU.demoDDD.bilboard;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.demoDDD.bilboard.events.BillboardCreated;
import com.sofkaU.demoDDD.bilboard.values.BillboardWeek;

import java.util.Set;

public class Billboard extends AggregateEvent<BillboardWeek> {
    protected Set<Movie> movies;
    protected Set<Theater> theaters;
    protected Schedule schedule;

    public Billboard(BillboardWeek entityId){
        super(entityId);
        appendChange(new BillboardCreated()).apply();
    }

    }

