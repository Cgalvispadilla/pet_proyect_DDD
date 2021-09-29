package com.softienda.tienda.usecases.factura;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.factura.events.BonoAsignado;
import com.softienda.tienda.domain.factura.events.FacturaCreada;
import com.softienda.tienda.domain.factura.values.ClienteID;
import com.softienda.tienda.domain.factura.values.EmpleadoID;
import com.softienda.tienda.domain.factura.values.Fecha;
import com.softienda.tienda.domain.generics.events.CostoTotalCalculado;
import com.softienda.tienda.domain.generics.values.CantidadProducto;
import com.softienda.tienda.domain.generics.values.CostoTotal;
import com.softienda.tienda.domain.producto.values.ProductoID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class AsignarBonoPorValorTotalDeFacturaUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void executeUseCase() {
        //arrange
        var event = new FacturaCreada(new ProductoID("1111"),
                new CantidadProducto(1),
                new Fecha(),
                new CostoTotal(12D),
                new EmpleadoID("sasas"),
                new ClienteID("qqqq"));

        event.setAggregateRootId("1111-1111");
        var useCase = new AsignarBonoPorValorTotalDeFacturaUseCase();
        Mockito.when(repository.getEventsBy("1111-1111")).thenReturn(eventStored());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("1111-1111")
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var eventBonoCreado = (BonoAsignado)events.get(0);
        var eventBonoAplicado =(CostoTotalCalculado) events.get(1);
        Assertions.assertEquals(60000D,eventBonoCreado.getBono());
        Assertions.assertEquals(1260000D,eventBonoAplicado.getCostoTotal().value());

    }

    private List<DomainEvent> eventStored() {
        var event = new FacturaCreada(new ProductoID("1111"),
                new CantidadProducto(1),
                new Fecha(),
                new CostoTotal(1200000D),
                new EmpleadoID("sasas"),
                new ClienteID("qqqq"));
        return List.of(
                event
        );
    }

}