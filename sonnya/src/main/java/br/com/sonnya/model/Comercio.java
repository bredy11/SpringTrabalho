package br.com.sonnya.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Comercio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column
	private String nome;
	@Column
	private String documento;
	@Column
	private String tipoComercio;
	@Column
	private String dono;
	@Column
	private String telefone;
	@Column
	private Date dtInscricao;
	

	public Date getDtInscricao() {
		return dtInscricao;
	}

	public void setDtInscricao(Date dtInscricao) {
		this.dtInscricao = dtInscricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipoComercio() {
		return tipoComercio;
	}

	public void setTipoComercio(String tipoComercio) {
		this.tipoComercio = tipoComercio;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
