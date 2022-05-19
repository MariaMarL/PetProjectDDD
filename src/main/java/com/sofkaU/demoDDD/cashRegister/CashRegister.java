package com.sofkaU.demoDDD.cashRegister;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.demoDDD.cashRegister.events.CashCreated;
import com.sofkaU.demoDDD.cashRegister.values.CashId;

import java.util.Set;

public class CashRegister extends AggregateEvent<CashId> {
    protected Set<Cashier> cashier;
    protected Payment payment;

    public CashRegister(CashId entityId) {
        super(entityId);
        appendChange(new CashCreated()).apply();
    }

}
