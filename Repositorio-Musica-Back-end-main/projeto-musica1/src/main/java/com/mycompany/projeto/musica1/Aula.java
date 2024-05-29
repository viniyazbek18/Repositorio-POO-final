/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.musica1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 202301095701
 */
public class Aula {
    private String titulo;
    private String descricao;
    private int duracao;

    // Construtor
    public Aula(String titulo, String descricao, int duracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
    }
    
    // Getter para o título
    public String getTitulo() {
        return titulo;
    }

    // Setter para o título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para a descrição
    public String getDescricao() {
        return descricao;
    }

    // Setter para a descrição
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter para a duração
    public int getDuracao() {
        return duracao;
    }

    // Setter para a duração
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
