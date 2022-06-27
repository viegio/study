import javax.swing.*;
import java.io.*;
        
public class Menu{
    public static void main (String[] args) throws IOException{
        //instância abstrata
        Votos[] vot = new Votos[100];
        
        //instância métodos
        Metodos m = new Metodos();
        
        int i;
        //EXECUÇÃO CONSTRUTOR
        for (i=0; i<100; i++){
            vot[i] = new Votos();
        }
        
        //MENU
        int opc=0;
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE VOTAÇÃO\n1 - Carregar Seção/Número Eleitor\n2 - Classificar por Seção\n"
                + "3 - Gravar Registros\n4 - Mostrar Indicadores\n5 - Ler arquivo Votação\n9 - Finalizar"));
            switch (opc){
                case 1: vot = m.FCADASTRAR(vot);
                    break;
                case 2: vot = m.FCLASSSEC(vot);
                    break;
                case 3: vot = m.FGRAVAVOT(vot);
                    break;
                case 4: m.FINDICADORES(vot);
                    break;
                case 5: m.FLERVOTOS(vot);
                    break;
                case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                     break;
                default: JOptionPane.showMessageDialog(null, "Código Inválido!");
            }//fim switch
        }//fim while
    }
}//fim classe
