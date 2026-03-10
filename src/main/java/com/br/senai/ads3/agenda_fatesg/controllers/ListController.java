package com.br.senai.ads3.agenda_fatesg.controllers;

import java.util.List;

import com.br.senai.ads3.agenda_fatesg.domains.Contato;

public interface ListController {
    List<Contato> listAll() throws Exception ;
    List<Contato> listAllActives() throws Exception ;
    List<Contato> listAllInatives() throws Exception ;
    boolean markInactiveByName(String name) throws Exception;
    List<Contato> searchName(String name) throws Exception;
}