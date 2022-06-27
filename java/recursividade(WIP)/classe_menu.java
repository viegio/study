// MENU DOS MÉTODOS DE RECURSIVIDADE (estudo)

import javax.swing.JOptionPane;

public class Menu {
    public static void main (String[] args){
        
        //INSTÂNCIA CLASSE Metodos_Recursividade
        Metodos_Recursividade r = new Metodos_Recursividade();
        
        //MENU
        int opc=0;
    
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("            Exercícios de Recursividade\n\n"
                                                                + "1 - Serie1 = (1+2+3+...+100)\n"
                                                                + "2 - Serie2 = (N) + (N-1) + (N-2) + ... + (1)\n"
                                                                + "3 - Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N)\n"
                                                                + "4 - Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)\n"
                                                                + "5 - Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!\n"
                                                                + "9 - Finalizar Programa"));
            
            //AUXILIAR SERIES
            
            switch (opc){
                case 1: 
                    int aux = 100;
                    System.out.println("Serie 1 = " + r.FSerie1(aux));
                    break;
                case 2:
                    int n;
                    n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de n:"));
                    System.out.println("Serie 2 = " + r.FSerie2(n));
                    break;
                case 3:
                    double n3;
                    n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de n:"));
                    System.out.println("Serie 3 = " + r.FSerie3(n3));
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9: JOptionPane.showMessageDialog(null, "Programa Finalizado!");
                    break;
                default: JOptionPane.showMessageDialog(null, "Código Inválido!");
            }//fim switch
        }//fim while
    }
}//fim classe
