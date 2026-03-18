package com.br.senai.ads3.agenda_fatesg.repositories;

import com.br.senai.ads3.agenda_fatesg.domains.Contato;
import com.br.senai.ads3.agenda_fatesg.exceptions.BusinessException;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface IContatoRepository {
    boolean inserir(final Contato contato) throws BusinessException;
    boolean alterar(final Contato contato) throws BusinessException;
    boolean desativar(final Contato contato) throws BusinessException;
    boolean reativar(final Contato contato) throws BusinessException;
    boolean contatoExiste(final Contato contato) throws BusinessException;
    List<Contato> buscarTodos() throws BusinessException;
    List<Contato> buscarTodos(boolean ativos) throws BusinessException;
}
