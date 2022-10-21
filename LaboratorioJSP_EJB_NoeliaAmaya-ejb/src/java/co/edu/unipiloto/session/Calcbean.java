/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Stateless;

/**
 *
 * @author Noelia
 */
@Stateless
public class Calcbean implements CalcbeanLocal {
    int elevado = 2;

    @Override
    public Integer suma(int val1, int val2) {
        return (val1+val2);
    }

    @Override
    public Integer resta(int val1, int val2) {
        return (val1-val2);
    }

    @Override
    public Integer multiplicar(int val1, int val2) {
        return (val1*val2);
    }

    @Override
    public Integer dividir(int val1, int val2) {
        return (val1/val2);
    }

    @Override
    public Integer modulo(int val1, int val2) {
        return (val1%val2);
    }

    @Override
    public Double elevarAlCuadradoVal1(int val1) {
        return Math.pow(val1, elevado);
    }

    @Override
    public Double elevarAlCuadradoVal2(int val2) {
        return Math.pow(val2, elevado);
    }
    
    
    
    

    
  
    
   
    
    
    

  
    
}
