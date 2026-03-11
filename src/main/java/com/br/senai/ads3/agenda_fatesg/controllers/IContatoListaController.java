package com.br.senai.ads3.agenda_fatesg.controllers;

import java.util.List;

import com.br.senai.ads3.agenda_fatesg.domains.Contato;

public interface IContatoListaController {
    List<Contato> listarTodos() throws Exception ;
    List<Contato> listarTodosAtivos() throws Exception ;
    List<Contato> listaTodosInativos() throws Exception ;
    boolean inativarPorNome(String name) throws Exception;
    List<Contato> buscarPorNome(String name) throws Exception;
}