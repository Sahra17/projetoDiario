/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sahra.flohr
 */
public class DiarioTest {
    
    public DiarioTest() {
        diario=new Diario();
    }

    /**
     * Test of addAluno method, of class Diario.
     */
    @Test
    public void testAddAluno() {
        System.out.println("addAluno");
        Aluno aluno = null;
        Diario instance = null;
        instance.addAluno(aluno);
      
    }

    /**
     * Test of addExame method, of class Diario.
     */
    @Test
    public void testAddExame() {
        System.out.println("addExame");
        Exame exame = null;
        Diario instance = null;
        instance.addExame(exame);
        
    }

    /**
     * Test of getAlunos method, of class Diario.
     */
    @Test
    public void testGetAlunos() {
        System.out.println("getAlunos");
        Diario instance = null;
        HashMap<Integer, Aluno> expResult = null;
        HashMap<Integer, Aluno> result = instance.getAlunos();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getAluno method, of class Diario.
     */
    @Test
    public void testGetAluno() {
        System.out.println("getAluno");
        int matricula = 1234;
        Diario instance = null;
        Aluno expResult = null;
        Aluno result = instance.getAluno(matricula);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNotasAluno method, of class Diario.
     */
    @Test
    public void testGetNotasAluno() {
        System.out.println("getNotasAluno");
        int matricula = 0;
        Diario instance = null;
        ArrayList<Double> expResult = null;
        ArrayList<Double> result = instance.getNotasAluno(matricula);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getDiario method, of class Diario.
     */
    @Test
    public void testGetDiario() {
        System.out.println("getDiario");
        Diario instance = null;
        HashMap<Integer, ArrayList<Exame>> expResult = null;
        HashMap<Integer, ArrayList<Exame>> result = instance.getDiario();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getDisciplina method, of class Diario.
     */
    @Test
    public void testGetDisciplina() {
        System.out.println("getDisciplina");
        Diario instance = null;
        String expResult = "matemática";
        String result = instance.getDisciplina();
        assertEquals(expResult, result);
     
    }
    
}
