package view;

import javax.swing.JOptionPane;

import controller.List;

public class Main {

	public static void main(String[] args) {
		int opc = 0;
		List livro = new List();
		String nome = "";
		int ano;
		
		System.out.println(

" _      _     _          _      _                     " + "\n" +
"| |    (_)   | |        | |    (_)                    " + "\n" +
"| |     _ ___| |_ __ _  | |     ___   ___ __ ___  ___ " + "\n" +
"| |    | / __| __/ _` | | |    | \\ \\ / / '__/ _ \\/ __|" + "\n" +
"| |____| \\__ \\ || (_| | | |____| |\\ V /| | | (_) \\__ \\" + "\n" +
"|______|_|___/\\__\\__,_| |______|_| \\_/ |_|  \\___/|___/" + "\n" +
"                                                      "				                                                      
);
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 - Inserir livro no começo\n2 - Inserir livro no fim\n3 - "
					+ "Inserir livro na posição escolhida\n4 - Mostrar lista\n5 - Ordenar lista\n9 - Sair\nInsira o comando desejado:"));
			
			switch (opc) {
				case 1: nome = JOptionPane.showInputDialog("Insira o nome do livro:");
						ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do livro:"));
						livro.addIncio(nome, ano);
					break;
					
				case 2: nome = JOptionPane.showInputDialog("Insira o nome do livro:");
						ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do livro:"));
						livro.addFim(nome, ano);
					break;
					
				case 3: nome = JOptionPane.showInputDialog("Insira o nome do livro:");
						ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do livro:"));
						int posicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição em que deseja adicionar o livro:"));
						livro.addMeio(nome, ano, posicao);
					break;
					
				case 4: livro.mostrarLista();
					break;
					
				case 5: livro.OrdenarLista();;
					break;
					
				case 9: JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso :)");
					break;
					
				default: JOptionPane.showMessageDialog(null,"Erro! Número inválido.");
			}
		}
	}
}
