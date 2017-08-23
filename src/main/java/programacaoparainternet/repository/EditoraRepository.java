package programacaoparainternet.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import programacaoparainternet.factory.ConnectionFactory;
import programacaoparainternet.factory.EditoraFactory;
import programacaoparainternet.factory.LivroFactory;
import programacaoparainternet.model.Editora;
import programacaoparainternet.model.Livro;

public class EditoraRepository {

	public List<Editora> buscarTodos(){
		Connection con = ConnectionFactory.getConnection();
		List<Editora> lista = new ArrayList<Editora>();
		String sql = "SELECT * FROM editora";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Editora editora = new Editora();
				editora.setId(rs.getInt("id"));
				editora.setNome(rs.getString("nome"));
				editora.setEmail(rs.getString("email"));
				lista.add(editora);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	public Editora buscarUm(Editora editora){
		Connection con = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM editora WHERE id = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, editora.getId());
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				editora.setNome(rs.getString("nome"));
				editora.setEmail(rs.getString("email"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return editora;
	}
	public void insirir(Editora editora){
		Connection con = ConnectionFactory.getConnection();
		String sql = "INSERT INTO editora(id, nome, email) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, editora.getId());
			stmt.setString(2, editora.getNome());
			stmt.setString(3, editora.getEmail());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void alterar(Editora editora){
		Connection con = ConnectionFactory.getConnection();
		String sql = "UPDATE editora SET nome = ?, email = ? WHERE id = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, editora.getNome());
			stmt.setString(2, editora.getEmail());
			stmt.setInt(3, editora.getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void excluir(Editora editora){
		Connection con = ConnectionFactory.getConnection();
		String sql = "DELETE FROM editora WHERE id = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, editora.getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
