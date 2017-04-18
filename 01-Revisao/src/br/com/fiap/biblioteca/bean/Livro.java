package br.com.fiap.biblioteca.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Livro extends Produto {

	public Livro() {
		super();
	}

	public Livro(long codigo, String titulo, double preco, String autor, String editora, Calendar dataLancamento) {
		super(codigo, titulo, preco);
		this.autor = autor;
		this.editora = editora;
		this.dataLancamento = dataLancamento;
	}

	private String autor;
	private String editora;
	private Calendar dataLancamento;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	@Override
	public String toString() {
		// Formatar data
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		return getTitulo() + "\n" + autor + 
				"\n" + getPreco() + "\n" + 
				formatador.format(dataLancamento.getTime()) + "\n" + editora;
	}

}
