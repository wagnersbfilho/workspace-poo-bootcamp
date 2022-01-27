package br.com.wagner.dominio;

public abstract class Conteudo {

	public static final Double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	
	public abstract Double calcularXP();
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
