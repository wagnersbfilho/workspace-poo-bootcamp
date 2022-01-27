import java.time.LocalDate;

import br.com.wagner.dominio.Bootcamp;
import br.com.wagner.dominio.Curso;
import br.com.wagner.dominio.Dev;
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
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("Wagner");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Wagner: " + dev.getConteudosInscritos());
		dev.progredir();
		System.out.println("Conteudos inscritos Wagner: " + dev.getConteudosInscritos());
		System.out.println("Conteudos concluidos Wagner: " + dev.getConteudosConcluidos());
		
		Dev dev2 = new Dev();
		dev2.setNome("Fulano");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Fulano: " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		System.out.println("Conteudos inscritos Fulano: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos concluidos Fulano: " + dev2.getConteudosConcluidos());
	}
}
