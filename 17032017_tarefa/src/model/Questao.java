package model;

import java.util.ArrayList;

public class Questao {
	int id_questao;
	String texto;
	ArrayList<Resposta> respostas = new ArrayList<Resposta>();
	int resposta_correta;
	
	public Questao() {
		
	}

	public Questao(int id_questao, int resposta_correta, ArrayList<Resposta> respostas) {
		super();
		this.id_questao = id_questao;
		this.resposta_correta = resposta_correta;
		this.respostas = respostas;
	}

	public int getId_questao() {
		return id_questao;
	}

	public void setId_questao(int id_questao) {
		this.id_questao = id_questao;
	}

	public ArrayList<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(ArrayList<Resposta> respostas) {
		this.respostas = respostas;
	}

	public int getResposta_correta() {
		return resposta_correta;
	}

	public void setResposta_correta(int resposta_correta) {
		this.resposta_correta = resposta_correta;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public void addResposta(Resposta resposta) {
		this.respostas.add(resposta);
	}
	
	
}
