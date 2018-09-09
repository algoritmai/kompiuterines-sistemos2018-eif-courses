/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.boundary;

import com.airhacks.Teacher;
import com.airhacks.entity.Classroom;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author Marius
 */
@Path("classrooms")
public class ClassroomResource {
     @GET
    public Response classrooms(){
        return Response.status(Response.Status.OK).
                entity(new Classroom(420, "30 students").
                toJson()).
                build();
    }
}
