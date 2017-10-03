/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sahra.flohr
 */
public class ExameTest {
     private final Exame exame;
     private final Aluno aluno;
    public ExameTest() {
        aluno=new Aluno("Sahra", 1234, "13/12/1999");
        exame=new Exame(aluno,"2/2/2017", 10.0);
    }

    /**
     * Test of getAluno method, of class Exame.
     */
    @Test
    public void testGetAluno() {
        System.out.println("getAluno");
        Exame instance = exame;
        Aluno expResult = aluno;
        Aluno result = instance.getAluno();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getData method, of class Exame.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Exame instance = exame;
        String expResult = "2/2/2017";
        String result = instance.getData();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getNota method, of class Exame.
     */
    @Test
    public void testGetNota() {
        System.out.println("getNota");
        Exame instance = exame;
        double expResult = 10.0;
        double result = instance.getNota();
        assertEquals(expResult, result, 0.0);
    }
    
}
