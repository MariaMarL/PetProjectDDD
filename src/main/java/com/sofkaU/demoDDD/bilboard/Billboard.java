package com.sofkaU.demoDDD.bilboard;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.demoDDD.bilboard.events.BillboardCreated;
import com.sofkaU.demoDDD.bilboard.values.BillboardWeek;
import com.sofkaU.demoDDD.bilboard.values.SizeOfBillboard;

import java.util.Set;

public class Billboard extends AggregateEvent<BillboardWeek> {
    protected Set<Movie> movies;
    protected Set<Theater> theaters;
    protected Set<Schedule> schedule;
    protected SizeOfBillboard billboardSize;

    public Billboard(BillboardWeek entityId, SizeOfBillboard size){
        super(entityId);
        appendChange(new BillboardCreated(billboardSize)).apply();
    }


    private Billboard(BillboardWeek billboardWeek){
        super(billboardWeek);
        subscribe(new BillboardSubscriber(this));
    }

    public static Billboard

}

