/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cash express
 */
public class exTest {
    
    public exTest() {
    }
    
   
    @Test
    public void testCalcul() {
        System.out.println("calcul");
       
        ex instance = new ex("bb",5,7);
       
        float result = instance.calcul(5, 7);
        assertEquals(6, result, 0.0);
      
    }
    
}
