import java.time.LocalDate;

import br.com.wagner.dominio.Curso;
import br.com.wagner.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Curso JAVA");
		curso.setDescricao("Desrição do Curso");
		curso.setCargaHoraria(8);
		System.out.println(curso);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria JAVA");
		mentoria.setDescricao("Desrição de mentoria");
		mentoria.setData(LocalDate.now());
		System.out.println(mentoria);
	}
}
