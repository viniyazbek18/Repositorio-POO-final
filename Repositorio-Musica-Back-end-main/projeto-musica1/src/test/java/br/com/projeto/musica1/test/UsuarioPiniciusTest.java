/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.projeto.musica1.test;

import com.mycompany.projeto.musica1.Usuario;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 202301095701
 */
public class UsuarioPiniciusTest {

    Usuario usuario = null;
    
    public UsuarioPiniciusTest() {
        usuario = new Usuario("Pinicius", "pini", "123");
    }

    @Test
    public void usuarioNomeTest() {
        assertEquals("Pinicius", usuario.getNome());
    }
    
    @Test
    public void usuarioUsuarioTest() {
        assertEquals("pini", usuario.getUsername());
    }
    
    @Test
    public void usuarioSenhaTest() {
        assertEquals("123", usuario.getSenha());
    }
}
