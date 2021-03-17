/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import tienda.Inventario;

/**
 *
 * @author sergi
 */
public class test {
    
  

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    void comprobar(){
        Inventario varA = new Inventario(1,2);
        Inventario varB = new Inventario(2,2);
        Inventario resultado = new Inventario (3,4);
        Inventario esperado = varA.sumar(varB);
        assertEquals(resultado,esperado);
        
    }
}
