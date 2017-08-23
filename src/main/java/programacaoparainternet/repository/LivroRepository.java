package programacaoparainternet.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import programacaoparainternet.factory.ConnectionFactory;
import programacaoparainternet.factory.EditoraFactory;
import programacaoparainternet.model.Editora;
import programacaoparainternet.model.Livro;

public class LivroRepository {

	public List<Livro> buscarTodos(){
		Connection con = ConnectionFactory.getConnection();
		List<Livro> lista = new ArrayList<>();
		String sql = "SELECT * FROM livro";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			EditoraRepository editoraRep = EditoraFactory.getRepository();
			while(rs.next()){
				Livro livro = new Livro();
				livro.setId(rs.getInt("id"));
				livro.setTitulo(rs.getString("titulo"));
				livro.setPreco(rs.getDouble("preco"));
				Editora editora = new Editora();
				editora.setId(rs.getInt("editora_id"));
				livro.setEditora_id(editoraRep.buscarUm(editora));
				lista.add(livro);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	public List<Livro> buscarPor(Livro livro){
		Connection con = ConnectionFactory.getConnection();
		List<Livro> lista = new ArrayList<>();
		String sql = "SELECT * FROM livro WHERE editora_id = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, livro.getEditora_id().getId());
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Livro livro2 = new Livro();
				livro2.setId(rs.getInt("id"));
				livro2.setTitulo(rs.getString("titulo"));
				livro2.setPreco(rs.getDouble("preco"));
				livro2.setEditora_id(livro.getEditora_id());
				lista.add(livro2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	public void buscarUm(){
		
	}
	
	public void insirir(){
		
	}
	
	public void alterar(){
		
	}
	
	public void excluir(){
		
	}
}
