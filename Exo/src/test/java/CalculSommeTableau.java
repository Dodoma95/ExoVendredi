/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.exo.tableauSomme;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class CalculSommeTableau {
    
    public CalculSommeTableau() {
    }
    
 
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Test1() {
        int tableau[] = {5,78,23,13,12,56};
        tableauSomme tab = new tableauSomme();
        int result = tab.calculSomme(tableau);
        assertEquals(187,result);
    
    }
        @Test
    public void Test2() {
        int tableau[] = {-5,78,23,13,12,56};
        tableauSomme tab = new tableauSomme();
        int result = tab.calculSomme(tableau);
        assertEquals(177,result);
    
    }
    
}
