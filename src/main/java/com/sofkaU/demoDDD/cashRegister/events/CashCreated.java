package com.sofkaU.demoDDD.cashRegister.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CashCreated extends DomainEvent {

    public CashCreated() {
        super("sofka.billboard.createCashRegister");
    }
}
