package com.sofkaU.demoDDD.bilboard.values;

import co.com.sofka.domain.generic.Identity;

public class BillboardWeek extends Identity {

    public BillboardWeek() {
   }

    private BillboardWeek(String uuid) {
        super(uuid);
    }

    public static BillboardWeek of(String id){
        return new BillboardWeek(id);
    }
}
