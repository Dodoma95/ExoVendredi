/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.exo.PuissanceNombre;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class TestPuissance {
    
    public TestPuissance() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testPuissanceNombre() {
    
        PuissanceNombre ps = new PuissanceNombre();
        int result = ps.calculerPuissanceNombre(5, 3);
        assertEquals(125, result); 
        
        
    }
}
