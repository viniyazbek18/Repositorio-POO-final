/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.projeto.musica1.test;

import com.mycompany.projeto.musica1.Aula;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 202301095701
 */
public class AulaTest {

    Aula aulas = null;
    
    public AulaTest() {
        aulas = new Aula("Aula 1","asasas",2);
    }

    @Test
    public void AulaTestTitulo() {
        assertEquals("Aula 1", aulas.getTitulo());
    }
    
    @Test
    public void AulaTestDescricao() {
        assertEquals("asasas", aulas.getDescricao());
    }
    
    @Test
    public void AulaTestDuracao() {
        assertEquals(2, aulas.getDuracao());
    }
}
