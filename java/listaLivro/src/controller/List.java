package controller;

public class List {
	private Node head; // cabeca cabeca

	public void addIncio(String nome, int ano) { //adicionar novo nó no início da lista
		//LL empty
		if (this.head == null) {
			this.head = new Node(nome, ano);
		}
		// LL not empty
		else {
			Node newNode = new Node(nome, ano);
			newNode.setNext(this.head);
			this.head = newNode;
		}
	}

	public void addMeio(String nome, int ano, int posicao) {
		Node antes = head;
				
		if (head == null) {
			this.head = new Node(nome, ano);
		}
		else {
			for (int i = 0; i < (posicao - 2); i++) {
				antes = antes.getNext();
			}
			Node depois = antes.getNext();
			Node newNode = new Node(nome, ano);
			newNode.setNext(depois);
			antes.setNext(newNode);
		}
	}

	public void addFim(String nome, int ano) {
		Node last = head;
		
		if (head == null) {
			this.head = new Node(nome, ano);
		}
		else {
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(new Node(nome, ano));;
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
				System.out.println("- " + mostrar.getNome() +", " + mostrar.getAno());
				mostrar = mostrar.getNext();
			}
			System.out.println();
		}
	}
	
	public void OrdenarLista() {
		Node temp = head;
		int c = 0;
		
		if (temp == null || temp.getNext() == null) {
			return;
		}
		
		while (temp != null) {
			temp = temp.getNext();
			c++;
		}
		
		for (int i = 0; i < c; i++) {
			Node prev = head;
			Node prox = prev.getNext();
			
			for (int j = i+1; j < c; j++) {
				if (prox.getAno() < prev.getAno()) {
					int ano = prev.getAno();
					String nome = prev.getNome();
					
					prev.setAno(prox.getAno());
					prev.setNome(prox.getNome());
					
					prox.setAno(ano);
					prox.setNome(nome);
				}
				prev = prox;
				prox = prox.getNext();
			}
		}
	}
	
	public void buscarPorAno(int ano) {
		Node temp = head;
		int index =0;
		
		while (temp.getAno() != ano) {
			temp = temp.getNext();
			index++;
			if (temp == null) {
				System.out.println("Não encontrado");
				return;
			}
		}
		System.out.println("Livro encontrado na " + (index+1) +"ª posição: " + temp.getNome() + ", " + temp.getAno());
	}
	
	public void buscarPorNome(String nome) {
		Node temp = head;
		int index=0;
		
		while (!temp.getNome().contains(nome)) {
			temp = temp.getNext();
			index++;
			
			if (temp == null) {
				System.out.println("Não encontrado");
				return;
			}
		}
		System.out.println("Livro encontrado na " + (index+1) +"ª posição: " + temp.getNome() + ", " + temp.getAno());
	}
}
