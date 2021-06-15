package br.sp.gov.sebrae.challenge.mvc.service;

import java.util.List;

import br.sp.gov.sebrae.challenge.mvc.dto.Cliente;

public interface ClienteService {

	List<Cliente>listaClientes();
	Cliente salvarCliente(Cliente cliente);
	Cliente editarCliente(Long id);
}
