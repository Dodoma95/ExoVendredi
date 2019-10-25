/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.exo.MinTableau;
import com.mycompany.exo.SuiteDeSyracuse;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class testMin {
    
    public testMin() {
    }

    @Test
    public void testMin1() {
    
        MinTableau min = new MinTableau();
        int [] tab2 = {4, 5, 1, 6, 9};
        int result = min.calculerMinTab(tab2);
        assertEquals(1, result);                
    }
    
     @Test
    public void testSyracus() {
    
       SuiteDeSyracuse ss = new SuiteDeSyracuse();
        int nb = 11;
        List<Integer> listeSyracus = ss.calculerSuiteSyracuse(nb);
        int result = listeSyracus.get(0);
        assertEquals(34, result);                
    }
}
