package com.sofkaU.demoDDD.bilboard;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.demoDDD.bilboard.events.BillboardCreated;

import java.util.HashSet;

public class BillboardSubscriber extends EventChange {

    public BillboardSubscriber(Billboard billboard){
        apply((BillboardCreated event) ->{
            billboard.billboardSize = event.getBillboardSize();
            billboard.movies = new HashSet<>();
            billboard.theaters = new HashSet<>();
            billboard.schedule = new HashSet<>();
        });
    }


}
