package com.sofkaU.demoDDD.bilboard.events;

import co.com.sofka.domain.generic.DomainEvent;

public class BillboardCreated extends DomainEvent {

    public BillboardCreated() {
        super("sofka.billboard.billboardcreated");
    }
}
