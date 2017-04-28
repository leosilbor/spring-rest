package br.com.too.restservice.dto;



import br.com.too.restservice.entity.Loja;

public class LojaDTO {
	private String idLogo;
	private CarrinhoDTO carrinho;
	private MenuDTO menu;
	private String nome;
	private String descrição;
	private String email;
	
	public LojaDTO() {
		
	}
	
	public LojaDTO(String idLogo, CarrinhoDTO carrinho, MenuDTO menu, String nome, String descrição, String email) {
		super();
		this.idLogo = idLogo;
		this.carrinho = carrinho;
		this.menu = menu;
		this.nome = nome;
		this.descrição = descrição;
		this.email = email;
	}
	
	public LojaDTO(Loja loja) {
		super();
		this.idLogo = loja.getIdLogo();
		this.menu = new MenuDTO(loja.getCategorias());
		this.nome = loja.getNome();
		this.descrição = loja.getDescricao();
		this.email = loja.getEmail();
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
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
