/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2018.web.rest.server;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.prn335_2018.datos.acceso.TipoVehiculoFacade;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.TipoVehiculo;

/**
 *
 * @author rafael
 */
@Path("TipoVehiculo")
@RequestScoped
public class TipoVehiculoFacadeRest implements Serializable {

//    @Inject
//    private TipoVehiculoFacade tipoVehiculoFacade;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {
//        if (tipoVehiculoFacade != null) {
//            return tipoVehiculoFacade.count();
//        }
        return 0;
    }

//    @GET
//    @Produces({MediaType.APPLICATION_JSON})
//    public List<TipoVehiculo> buscarTodo() {
//        if (tipoVehiculoFacade != null) {
//            return tipoVehiculoFacade.findAll();
//        }
//        return Collections.EMPTY_LIST;
//    }
//
//    @GET
//    @Produces({MediaType.APPLICATION_JSON})
//    public List<TipoVehiculo> buscarPorRango(@QueryParam("desde") @DefaultValue("0") int desde, @QueryParam("hasta") @DefaultValue("10") int hasta) {
//        if (tipoVehiculoFacade != null) {
//            return tipoVehiculoFacade.findRange(desde, hasta);
//        }
//        return Collections.EMPTY_LIST;
//    }

}
