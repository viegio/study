
package controller;


public class Node {
	private String nome;
	private Node next;
	
	public Node(String nome) {
		this.setNome(nome);
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

}
