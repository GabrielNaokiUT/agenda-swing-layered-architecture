package com.br.senai.ads3.agenda_fatesg.controllers;

import com.br.senai.ads3.agenda_fatesg.domains.Contato;

public interface IContatoCadastroController {
    Contato criar(Contato dto) throws Exception;
    Contato alterar(String originalName, Contato dto) throws Exception;
}