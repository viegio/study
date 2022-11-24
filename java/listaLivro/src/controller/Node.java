
package controller;


public class Node {
	private String nome;
	private int ano;
	private Node next;
	
	public Node(String nome, int ano) {
		this.setNome(nome);
		this.setAno(ano);
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
