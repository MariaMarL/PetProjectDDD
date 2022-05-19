package com.sofkaU.demoDDD.client;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.demoDDD.client.events.ClientCreated;
import com.sofkaU.demoDDD.client.values.ClientDni;
import com.sofkaU.demoDDD.client.values.ClientId;
import com.sofkaU.demoDDD.client.values.ClientName;

public class Client extends AggregateEvent<ClientId> {
    protected Order order;
    protected Vip vip;
    protected ClientName clientName;
    protected ClientDni clientDni;


    public Client(ClientId entityId, ClientName clientName, ClientDni clientDni) {
        super(entityId);
        appendChange(new ClientCreated(clientName,clientDni)).apply();
    }
}
