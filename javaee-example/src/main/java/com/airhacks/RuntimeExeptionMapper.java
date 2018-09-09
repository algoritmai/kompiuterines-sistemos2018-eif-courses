/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Marius
 */
@Provider
public class RuntimeExeptionMapper implements ExceptionMapper<RuntimeException>{

    @Override
    public Response toResponse(RuntimeException exception) {
        return Response.status(Status.INTERNAL_SERVER_ERROR).header("x-reason", exception.getMessage()).build();
    }
    
}
