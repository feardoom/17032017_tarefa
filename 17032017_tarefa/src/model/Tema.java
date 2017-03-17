package model;

import java.util.ArrayList;

public class Tema {
	int id_tema;
	String nome;
	ArrayList<Questao> questoes = new ArrayList<Questao>();
	
	public Tema() {
	
	}

	public Tema(int id_tema, String nome, ArrayList<Questao> questoes) {
		super();
		this.id_tema = id_tema;
		this.nome = nome;
		this.questoes = questoes;
	}

	public int getId_tema() {
		return id_tema;
	}

	public void setId_tema(int id_tema) {
		this.id_tema = id_tema;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(ArrayList<Questao> questoes) {
		this.questoes = questoes;
	}
	
	public void addQuestao(Questao questao) {
		this.questoes.add(questao);
	}
	
	
	
	
	

}
