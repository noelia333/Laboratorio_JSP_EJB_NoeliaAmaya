/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Local;

/**
 *
 * @author Noelia
 */
@Local
public interface CalcbeanLocal {

    Integer suma(int val1, int val2);

    Integer resta(int val1, int val2);

    Integer multiplicar(int val1, int val2);

    Integer dividir(int val1, int val2);

    Integer modulo(int val1, int val2);

    Double elevarAlCuadradoVal1(int val1);

    Double elevarAlCuadradoVal2(int val2);

    
    
}
