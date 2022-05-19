package com.sofkaU.demoDDD.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.client.values.ClientDni;
import com.sofkaU.demoDDD.client.values.ClientName;

public class ClientCreated extends DomainEvent {
    private final ClientName clientName;
    private final ClientDni clientDni;

    public ClientCreated(ClientName clientName, ClientDni clientDni) {
        super("sofka.billboard.clientcreated");
        this.clientName = clientName;
        this.clientDni = clientDni;
    }

    public ClientName getClientName() {
        return clientName;
    }

    public ClientDni getClientDni() {
        return clientDni;
    }
}
