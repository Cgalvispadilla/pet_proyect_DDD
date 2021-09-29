package com.softienda.tienda.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.softienda.tienda.domain.compra.commands.CrearCompra;
import com.softienda.tienda.domain.compra.events.CompraCreada;
import com.softienda.tienda.domain.compra.values.CompraID;
import com.softienda.tienda.domain.generics.values.CantidadProducto;
import com.softienda.tienda.domain.generics.values.CostoTotal;
import com.softienda.tienda.domain.producto.values.ProductoID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearCompraUseCaseTest {

    @Test
    void CrearComprar(){
        //Arrange
        var command = new CrearCompra(
                CompraID.of("1111"),
                new ProductoID("xxxx"),
                new CantidadProducto(12),
                new CostoTotal(500000D)
        );
        var useCase=new CrearCompraUseCase();

        //act
        var events=UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (CompraCreada)events.get(0);
        Assertions.assertEquals("xxxx", event.getProductoID().value());
        Assertions.assertEquals(12, event.getCantidadProducto().value());
        Assertions.assertEquals(500000, event.getCostoTotal().value());

    }

}