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
public class Aula2Test {

    Aula aulas = null;
    
    public Aula2Test() {
        aulas = new Aula("Aula 2","asasas",2);
    }

    @Test
    public void Aula2TestTitulo() {
        assertEquals("Aula 2", aulas.getTitulo());
    }
    
    @Test
    public void Aula2TestDescricao() {
        assertEquals("asasas", aulas.getDescricao());
    }
    
    @Test
    public void Aula2TestDuracao() {
        assertEquals(2, aulas.getDuracao());
    }
}
