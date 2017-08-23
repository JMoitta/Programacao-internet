package programacaoparainternet.factory;

import programacaoparainternet.repository.EditoraRepository;

public class EditoraFactory {
	private static EditoraRepository editoraRepository = new EditoraRepository();
	public static EditoraRepository getRepository(){
		return editoraRepository;
	}
}
