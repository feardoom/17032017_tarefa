package controller;

import java.util.ArrayList;
import model.*;
import tools.easyIO;

public class GestaoQuestao {
	public static easyIO io = new easyIO(); 
	ArrayList<Questao> questoes = new ArrayList<Questao>();
	
	public GestaoQuestao() {
		gerir();
	}
	
	public ArrayList<Questao> gerir() {
		char op;
		Questao questao = new Questao();
		do {
			io.writeL("Introduza o texto da questao");
			questao.setTexto(io.readS());
			io.writeL("Deseja inserir respostas? (s/n)");
			op = io.readC();
			
			switch (op) {
				case 's':
					questao.setRespostas(new GestaoResposta().gerir());
					break;
				case 'n':			
					break;
			}
			this.questoes.add(questao);
			io.writeL("Deseja inserir mais? (s/n)");
			op = io.readC();
		}while(op!='n');
		return this.questoes;
	}
}
