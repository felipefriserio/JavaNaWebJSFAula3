package fiap.scj.jsf;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LoginBean {
	
	@PostConstruct
	private void onCreate(){
		System.out.println("nava instancia de LoginBean");
	}

	private String nome;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String submit() {
		System.out.println("Nome:" + this.nome + " / Senha: "+ this.senha);
		setNome("Sucesso");
		return "sucesso";
	}
}
