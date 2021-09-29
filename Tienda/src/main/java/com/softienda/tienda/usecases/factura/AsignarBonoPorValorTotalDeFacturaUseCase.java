package com.softienda.tienda.usecases.factura;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.softienda.tienda.domain.factura.Factura;
import com.softienda.tienda.domain.factura.events.FacturaCreada;
import com.softienda.tienda.domain.factura.values.FacturaID;
import com.softienda.tienda.domain.generics.values.CostoTotal;

public class AsignarBonoPorValorTotalDeFacturaUseCase extends UseCase<TriggeredEvent<FacturaCreada>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<FacturaCreada> facturaCreadaTriggeredEvent) {
        var event = facturaCreadaTriggeredEvent.getDomainEvent();
        var factura = Factura.from(FacturaID.of(event.aggregateRootId()),this.retrieveEvents());
        if(factura.costoTotal().value()>1000000){
            Double bono= factura.costoTotal().value()*0.05;
            factura.asignarBono(bono);
            factura.calcularCostoTotal(new CostoTotal(Double.sum(factura.costoTotal().value(),bono)));
            emit().onResponse(new ResponseEvents(factura.getUncommittedChanges()));
        }

    }
}
