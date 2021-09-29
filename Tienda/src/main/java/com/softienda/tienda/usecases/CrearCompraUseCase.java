package com.softienda.tienda.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.softienda.tienda.domain.compra.Compra;
import com.softienda.tienda.domain.compra.commands.CrearCompra;
import com.softienda.tienda.domain.compra.values.CompraID;

public class CrearCompraUseCase extends UseCase<RequestCommand<CrearCompra>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCompra> crearCompraRequestCommand) {
        var command = crearCompraRequestCommand.getCommand();

        var compra= new Compra(
                command.getEntityId(),
                command.getProductoID(),
                command.getCantidadProducto(),
                command.getCostoTotal()
        );
        emit().onResponse(new ResponseEvents(compra.getUncommittedChanges()));
    }
}
