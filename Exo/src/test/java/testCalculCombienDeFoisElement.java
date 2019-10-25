/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.exo.CalculCombienDeFoisElementTableau;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class testCalculCombienDeFoisElement {
    
    public testCalculCombienDeFoisElement() {
    }
 

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test3() {
        int tableau[] = {1, 4, 3, 3, 4, 2, 2, 2, 4, 1};
        int tableauResult[] = {2,3,2,3,0};
        CalculCombienDeFoisElementTableau tab = new CalculCombienDeFoisElementTableau();
        int[] result = tab.calculCombienDeFoisElementTableau(tableau);
        assertArrayEquals(tableauResult,result);
    }
}
