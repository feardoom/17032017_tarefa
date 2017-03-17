package controller;

import java.util.ArrayList;

import model.*;
import tools.easyIO;

public class GestaoResposta {
	public static easyIO io = new easyIO(); 
	ArrayList<Resposta> respostas = new ArrayList<Resposta>();

	public GestaoResposta() {
		
	}
	
	public ArrayList<Resposta> gerir() {
		return respostas;
	}
}
