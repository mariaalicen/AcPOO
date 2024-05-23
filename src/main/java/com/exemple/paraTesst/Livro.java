package com.exemple.paraTesst;

import java.util.ArrayList;

public class Livro implements VerificaExistencia, VisualizaCatalogo {
        String idLivros;
        String nome;
        String auto;
        String sinopse;
        String status;
        String genero;
        int avaliacao;
        int pgAtual;
        int pgFinal;
        ArrayList livros;


        public void visualizarLivro(){

        }
        public void definirStatus(int pgAtual, int pgFinal){

        }
        public void atualizarPagina(String pgAtual){

        }
        @Override
        public void verificarExistencia(String idLivros){
                return;
        }
        @Override
        public void visualizarArrayLivros(){
        return;
        }

    }
