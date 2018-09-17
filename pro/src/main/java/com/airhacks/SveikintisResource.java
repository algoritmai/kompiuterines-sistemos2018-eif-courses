/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Marius
 */

@Path("labas")
public class SveikintisResource {
    
    @GET
    public String helloWorld(){
        return "Hello world";
    }
}
