package view;

import javax.swing.JOptionPane;

import controller.List;

public class Main {

	public static void main(String[] args) {
		int opc = 0;
		List livro = new List();
		String nome = "";
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 - Inserir livro no começo\n2 - Inserir livro no fim\n3 - "
					+ "Inserir livro na posição escolhida\n4 - Mostrar lista\n5 - Ordenar lista\n9 - Sair\nInsira o comando desejado:"));
			
			switch (opc) {
				case 1: nome = JOptionPane.showInputDialog("Insira o novo livro:");
						livro.addIncio(nome);
					break;
					
				case 2: nome = JOptionPane.showInputDialog("Insira o novo livro:");
						livro.addFim(nome);
					break;
					
				case 3: nome = JOptionPane.showInputDialog("Insira o novo livro:");
						int posicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição em que deseja adicionar o livro:"));
						livro.addMeio(nome, posicao);
					break;
					
				case 4: livro.mostrarLista();
					break;
					
				case 5: System.out.print("opção 5");
					break;
					
				case 9: JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso :)");
					break;
					
				default: JOptionPane.showMessageDialog(null,"Erro! Número inválido.");
			}
		}
	}
}