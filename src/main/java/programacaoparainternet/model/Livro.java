package programacaoparainternet.model;

public class Livro {

	private int id;
	private String titulo;
	private double preco;
	private Editora editora_id;
	
	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", preco=" + preco + ", editora_id=" + editora_id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Editora getEditora_id() {
		return editora_id;
	}
	public void setEditora_id(Editora editora_id) {
		this.editora_id = editora_id;
	}
	
}
