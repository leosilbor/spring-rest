package br.com.too.restservice.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.too.restservice.dto.ProdutoDTO;

@Entity
@Table
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="produto")
	private List<Imagem> imagens;
	
	@Column
	private Double valor;
	
	@Column
	private String hashImagemPrincipal;
	
	@Column
	private Integer quantidade;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Categoria categoria;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dataInclusao = new Date();
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Loja loja;
	
	public Produto() {
		
	}
	
	public Produto(ProdutoDTO produtoDTO) {
		this.id = produtoDTO.getId();
		this.nome = produtoDTO.getNome();
		this.descricao = produtoDTO.getDescricao();
		this.valor = produtoDTO.getValor();
		this.quantidade = produtoDTO.getQuantidade();
		this.categoria = new Categoria(produtoDTO.getCategoria());
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Imagem> getImagens() {
		return imagens;
	}
	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getHashImagemPrincipal() {
		return hashImagemPrincipal;
	}
	public void setHashImagemPrincipal(String hashImagemPrincipal) {
		this.hashImagemPrincipal = hashImagemPrincipal;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	
	
}
