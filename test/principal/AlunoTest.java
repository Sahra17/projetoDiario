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
public class AlunoTest {
    private final Aluno aluno;
    
    public AlunoTest() {
        aluno=new Aluno("Sahra",  1234, "13/12/1999");
    }

    /**
     * Test of getNome method, of class Aluno.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Aluno instance = null;
        String expResult = "Sahra";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMatricula method, of class Aluno.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Aluno instance = null;
        int expResult = 1234;
        int result = instance.getMatricula();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataNascimento method, of class Aluno.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        Aluno instance = null;
        String expResult = "13/12/1999";
        String result = instance.getDataNascimento();
        assertEquals(expResult, result);
    }
    
}
