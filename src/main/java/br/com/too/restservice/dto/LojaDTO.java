package br.com.too.restservice.dto;



import br.com.too.restservice.entity.Loja;

public class LojaDTO {
	private Integer id;
	private String idLogo;
	private CarrinhoDTO carrinho;
	private MenuDTO menu;
	private String nome;
	private String descricao;
	private String email;
	private String telefone;
	private String login;
	
	public LojaDTO() {
		
	}
	
	public LojaDTO(Loja loja) {
		super();
		this.id = loja.getId();
		this.idLogo = loja.getIdLogo();
		this.menu = new MenuDTO(loja.getCategorias());
		this.nome = loja.getNome();
		this.descricao = loja.getDescricao();
		this.email = loja.getEmail();
		this.telefone = loja.getTelefone();
		this.login = loja.getLogin();
	}

	public String getIdLogo() {
		return idLogo;
	}
	public void setIdLogo(String idLogo) {
		this.idLogo = idLogo;
	}
	public CarrinhoDTO getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(CarrinhoDTO carrinho) {
		this.carrinho = carrinho;
	}
	public MenuDTO getMenu() {
		return menu;
	}
	public void setMenu(MenuDTO menu) {
		this.menu = menu;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
