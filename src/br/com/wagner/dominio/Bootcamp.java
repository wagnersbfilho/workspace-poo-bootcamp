package br.com.wagner.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate datFinal = dataInicial.plusDays(45);
	private Set<Dev> devInscritos;
	private Set<Conteudo> conteudos;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Dev> getDevInscritos() {
		if (devInscritos == null) {
			devInscritos = new HashSet<Dev>();
			
		}
		return devInscritos;
	}
	
	public void setDevInscritos(Set<Dev> devInscritos) {
		this.devInscritos = devInscritos;
	}
	
	public Set<Conteudo> getConteudos() {
		if (conteudos == null) {
			conteudos = new LinkedHashSet<Conteudo>();
		}
		return conteudos;
	}
	
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDatFinal() {
		return datFinal;
	}
	
}
