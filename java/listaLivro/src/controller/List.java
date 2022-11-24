package controller;

public class List {
	private Node head; // cabeca cabeca

	public void addIncio(String nome) { //adicionar novo nó no início da lista
		//LL empty
		if (this.head == null) {
			this.head = new Node(nome);
		}
		// LL not empty
		else {
			Node newNode = new Node(nome);
			newNode.setNext(this.head);
			this.head = newNode;
		}
	}

	public void addMeio(String nome, int posicao) {
		Node antes = head;
				
		if (head == null) {
			this.head = new Node(nome);
		}
		else {
			for (int i = 0; i < (posicao - 2); i++) {
				antes = antes.getNext();
			}
			Node depois = antes.getNext();
			Node newNode = new Node(nome);
			newNode.setNext(depois);
			antes.setNext(newNode);
		}
	}

	public void addFim(String nome) {
		Node last = head;
		
		if (head == null) {
			this.head = new Node(nome);
		}
		else {
			while (last.getNext() != null) {
				last = last.getNext();
				System.out.println("not null");
			}
			last.setNext(new Node(nome));;
		}
	}

	public void mostrarLista() {
		Node mostrar = head;
		
		if (head == null) {
			System.out.println("Lista vazia! Adicione um novo livro");
		}
		else {
			System.out.println("Lista de livros:\n");
			while (mostrar != null) {
				System.out.println("- " + mostrar.getNome());
				mostrar = mostrar.getNext();
			}
			System.out.println();
		}
	}
	
	public void OrdenarLista() {
		
	}
}