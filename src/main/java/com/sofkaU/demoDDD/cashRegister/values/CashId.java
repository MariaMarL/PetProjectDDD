package com.sofkaU.demoDDD.cashRegister.values;

import co.com.sofka.domain.generic.Identity;

public class CashId extends Identity {

    public CashId() {
    }

    public CashId(String uuid) {
        super(uuid);
    }

    public static CashId of(String id){
        return new CashId(id);
    }
}
