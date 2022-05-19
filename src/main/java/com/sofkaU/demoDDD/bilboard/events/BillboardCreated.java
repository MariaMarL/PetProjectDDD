package com.sofkaU.demoDDD.bilboard.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.bilboard.values.SizeOfBillboard;

public class BillboardCreated extends DomainEvent {
    private final SizeOfBillboard billboardSize;


    public BillboardCreated(SizeOfBillboard billboardSize) {
        super("sofka.billboard.billboardcreated");
        this.billboardSize = billboardSize;
    }

    public SizeOfBillboard getBillboardSize() {
        return billboardSize;
    }
}
