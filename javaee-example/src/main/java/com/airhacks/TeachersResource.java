/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import java.net.URI;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.swing.JOptionPane;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Marius
 */
@Path("teachers")
public class TeachersResource {
    
    @GET
    public Response teachers(){
        return Response.status(Status.OK).
                entity(new Teacher("Marius", "Gžegoževskis").
                toJson()).
                build();
    }
//    @GET
//    public JsonArray teachers(@Context HttpHeaders http){
//        JsonObject jsonObject = Json.createObjectBuilder().add("Gzegozevskis", "Pranaitis").build();
//        return Json.createArrayBuilder().add(jsonObject).build();
//        //throw new RuntimeException("Visi destytojai uzimti");
//    }
    
    @GET
    @Path("{first}-{last}")
    public Response teacher(@PathParam("first") String first,
            @PathParam("last") String last){
        return Response.status(Status.OK).entity(new Teacher(first, last)).build();
    }
    @POST
    public Response save(Teacher teacher, @Context UriInfo uriInfo){
        URI uri = uriInfo.getAbsolutePathBuilder().path("/id-"+System.currentTimeMillis()).build();
        return Response.created(uri).build();
    }
    
    
}
