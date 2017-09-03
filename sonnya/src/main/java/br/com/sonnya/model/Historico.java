package br.com.sonnya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Historico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idHistorico;
	@Column
	private String formaPamendo;
	@Column
	private String documentoPrestador;
	@Column
	private String nomePrestador;
	@Column
	private String endereco;
	@Column
	private String parcelado;
	@Column
	private Double desconto;
	@Column
	private Double valor;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idComercio")
	private Comercio comercio;
	
	
	
	
	
	public Comercio getComercio() {
		return comercio;
	}
	public void setComercio(Comercio comercio) {
		this.comercio = comercio;
	}
	public Integer getIdHistorico() {
		return idHistorico;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public void setIdHistorico(Integer idHistorico) {
		this.idHistorico = idHistorico;
	}
	public String getFormaPamendo() {
		return formaPamendo;
	}
	public void setFormaPamendo(String formaPamendo) {
		this.formaPamendo = formaPamendo;
	}
	public String getDocumentoPrestador() {
		return documentoPrestador;
	}
	public void setDocumentoPrestador(String documentoPrestador) {
		this.documentoPrestador = documentoPrestador;
	}
	public String getNomePrestador() {
		return nomePrestador;
	}
	public void setNomePrestador(String nomePrestador) {
		this.nomePrestador = nomePrestador;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getParcelado() {
		return parcelado;
	}
	public void setParcelado(String parcelado) {
		this.parcelado = parcelado;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}


}   
