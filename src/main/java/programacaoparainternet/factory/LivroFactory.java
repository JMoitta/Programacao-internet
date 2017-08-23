package programacaoparainternet.factory;

import programacaoparainternet.repository.LivroRepository;

public class LivroFactory {

	private static LivroRepository livroRepository = new LivroRepository();
	public static LivroRepository getRepository(){
		return livroRepository;
	}
}
