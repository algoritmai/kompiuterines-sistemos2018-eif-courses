/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

/**
 *
 * @author Marius
 * @param <T> - logine salyga
 */
public interface Predikatas<T> {
    boolean test(T t);
}
