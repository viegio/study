//      CLASSE PRINCIPAL
import javax.swing.JOptionPane;
class ClasseMenu {
    public static void main (String[] args){
    //INSTÂNCIA CLASSE ABSTRATA
    Estatistica[] est = new Estatistica[4];
    
    //INSTÂNCIA CLASSE MÉTODO
    ClasseMetodos m = new ClasseMetodos();
    
    int i;
    
    //EXECUÇÃO DO MÉTODO CONSTRUTOR
    for (i = 0; i<3; i++){
        est[i] = new Estatistica();}
    
    //MENU
    
    int opc = 0;
    while (opc!=9){
        opc = Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATÍSTICA\nEstatísticas de acidentes em 2015\n"
                                                          + "1 - Cadastro Estatística\n2 - Consulta por tipo de veículo\n"
                                                          + "3 - Consulta por quantidade de acidentes\n4 - Consulta todas as cidades\n"
                                                          + "5 - Consulta maior menor média de acidentes\n9 - Finaliza"));
        switch (opc){
            case 1: est = m.FCadEst(est);
                    break;
            case 2: m.Ptipo(est);
                    break;
            case 3: m.Pqtd(est);
                    break;
            case 4: m.PConsultAcid(est);
                    break;
            case 5: m.PMaiorMenor(est);
                    break;
            case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                     break;
            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
            
            }//FIM SWITCH
        }//FIM WHILE
    }//FIM MENU
}//FIM CLASSE
