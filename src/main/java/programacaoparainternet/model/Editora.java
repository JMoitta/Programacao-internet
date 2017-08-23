package programacaoparainternet.model;



public class Editora {

	private int id;
	private String nome;
	private String email;
	
	public Editora(int id) {
		this.id = id;
	}
	public Editora() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Editora [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
