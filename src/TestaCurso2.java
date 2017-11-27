import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Gabriel");
		// List<Aula> aulas = javaColecoes.getAulas();

		javaColecoes.adciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adciona(new Aula("Modelando com cole��es", 22));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		Collections.sort(aulas);

		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}
}
