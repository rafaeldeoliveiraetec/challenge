package br.sp.gov.sebrae.challenge.mvc.dto;

import java.io.Serializable;

//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	@NotNull
	private String nome;
	@NotNull
	private String endereco;
	@NotNull
	private String enderecoN;
	@NotNull
	private String cidade;
	@NotNull
	private String estado;
	@NotNull
	private String cep;
	@NotNull
	private String cpf;
	@NotNull
	private String rg;
	@NotNull
	private String dataNascimento;
	@NotNull
	private String email;
	@NotNull
	private String telefone;
	@NotNull
	private String celular;
	@NotNull
	private String tipoFinanciamento;
	@NotNull
	private String quantidadeParcelamento;
	@NotNull
	private String valorIntencao;
	@NotNull
	private String salario;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEnderecoN() {
		return enderecoN;
	}
	public void setEnderecoN(String enderecoN) {
		this.enderecoN = enderecoN;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getTipoFinanciamento() {
		return tipoFinanciamento;
	}
	public void setTipoFinanciamento(String tipoFinanciamento) {
		this.tipoFinanciamento = tipoFinanciamento;
	}
	public String getQuantidadeParcelamento() {
		return quantidadeParcelamento;
	}
	public void setQuantidadeParcelamento(String quantidadeParcelamento) {
		this.quantidadeParcelamento = quantidadeParcelamento;
	}
	public String getValorIntencao() {
		return valorIntencao;
	}
	public void setValorIntencao(String valorIntencao) {
		this.valorIntencao = valorIntencao;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
	
}
