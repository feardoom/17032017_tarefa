package model;

public class Resposta {
	private int id_resposta;
	private String texto;
	
	public Resposta() {
		
	}

	public Resposta(int id_resposta, String texto) {
		super();
		this.id_resposta = id_resposta;
		this.texto = texto;
	}

	public int getId_resposta() {
		return id_resposta;
	}

	public void setId_resposta(int id_resposta) {
		this.id_resposta = id_resposta;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	} 
	
	
}


