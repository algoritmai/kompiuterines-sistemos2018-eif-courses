/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import javax.json.bind.spi.JsonbProvider;

/**
 *
 * @author Marius
 */

public class Teacher {
    public String name;
    public String lastname;

    public Teacher() {
    }

    public Teacher(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    public String toJson(){
        return JsonbProvider.provider().
                create().
                build().
                toJson(this);
    }
  
}
