/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import questao5.Operacao;

/**
 *
 * @author aluno
 */
public class Testeb {
    
    @Test
    public void testaFat(){
        
        double atual;
        
        Operacao op = new Operacao();
        
        atual = op.fatorial(8);
        
        assertNotEquals("Resultado não é o esperado", 1000, atual);
        
        
    }
    
}
