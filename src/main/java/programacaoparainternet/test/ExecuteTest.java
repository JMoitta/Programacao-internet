package programacaoparainternet.test;

import programacaoparainternet.factory.EditoraFactory;
import programacaoparainternet.factory.LivroFactory;
import programacaoparainternet.model.Editora;
import programacaoparainternet.repository.EditoraRepository;
import programacaoparainternet.repository.LivroRepository;

public class ExecuteTest {
	public static void main(String[] args) {
		System.out.println(EditoraFactory.getRepository().buscarTodos());
	}
}
