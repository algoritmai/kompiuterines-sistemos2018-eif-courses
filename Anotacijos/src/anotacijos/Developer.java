/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotacijos;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Marius
 */




@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Developer {
    String name();
    int id() default 9852;
    int[] tasks();
}
