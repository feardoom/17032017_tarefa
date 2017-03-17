package controller;

import java.util.ArrayList;
import model.*;
import tools.easyIO;
public class GestaoTema {
	public static easyIO io = new easyIO(); 
	ArrayList<Tema> temas = new ArrayList<Tema>();
	
	public GestaoTema() {
		int op;
		do {
			io.writeL("Escolha uma opcao");
			io.writeL("1. Adicionar Questionario");
			io.writeL("2. Listar Questionarios");
			io.writeL("0. Sair1");
			op = io.readN();
			
			switch (op) {
				case 1:
					inserirTema();
					break;
				case 2:
					listTemas();
					break;
			}
		}while(op!=0);
	}
	
	public void inserirTema() {
		char op;
		Tema tema = new Tema();
		do {
			io.writeL("Introduza o nome do tema");
			tema.setNome(io.readS());
			io.writeL("Deseja inserir questoes? (s/n)");
			op = io.readC();
			
			switch (op) {
				case 's':
					tema.setQuestoes(new GestaoQuestao().gerir());
					break;
				case 'n':			
					break;
			}
			addTema(tema);
			io.writeL("Deseja inserir mais? (s/n)");
			op = io.readC();
		}while(op!='n');
	}
	
	public void addTema(Tema tema) {
		this.temas.add(tema);
	}
	
	public void listTemas() {
		io.writeL("Temas/Questoes/Respostas");
		for(Tema t:temas) {
			io.writeL("id: " + t.getId_tema());
			io.writeL("nome: " + t.getNome());
			if (t.getQuestoes().size()>0) {
				io.writeL("questoes:");
				for(Questao q:t.getQuestoes()) {
					io.writeL("  id: " + q.getId_questao());
					io.writeL("  questao: " + q.getTexto());
					if (q.getRespostas().size()>0) {
						io.writeL("  respostas:");
						for(Resposta r:q.getRespostas()) {
							io.writeL("    id: " + r.getId_resposta());
							io.writeL("    texto: " + r.getTexto() + (q.getResposta_correta()==r.getId_resposta()? "(correta)" : ""));
						}
					}
				}
				
			}
		}
	}
	
}
