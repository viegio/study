//      CLASSE DE MÉTODOS
import javax.swing.JOptionPane;
public class ClasseMetodos {
    //FUNÇÃO CADASTRAR ESTATÍSTICA (receber est, retornar Estatistica[])
    public Estatistica[] FCadEst(Estatistica[] est){
        int i;
        
        for (i=0; i<3; i++){ //MUDAR i PARA COMBINAR COM NÚMERO DE REGISTROS
            est[i].cod_cid = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da cidade."));
            est[i].nome = JOptionPane.showInputDialog("Informe o nome da cidade.");
            est[i].qtd_acid = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de acidentes."));
            est[i].tipo_veic = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de veículo."));
            System.out.println(est[i].cod_cid+", "+est[i].nome+", "+est[i].qtd_acid+", "+est[i].tipo_veic);
        }
        System.out.println("Estatística Cadastrada");
        return est;}
    
    //PROCEDIMENTO CONSULTAR POR TIPO DE VEÍCULO
    public void Ptipo(Estatistica[] est){
        int i, count1=0, count2=0, count3=0;
        
        for (i=0; i<3; i++){ //MUDAR i PARA COMBINAR COM NÚMERO DE REGISTROS
            if (est[i].tipo_veic == 1){
                count1 = count1 + est[i].qtd_acid;
            }
            else
                if (est[i].tipo_veic == 2){
                count2 = count2 + est[i].qtd_acid;
                }
                else
                    if (est[i].tipo_veic == 3){
                    count3 = count3 + est[i].qtd_acid;
                    }
        }
            System.out.println("Quantidade de acidentes pelo tipo de veículo:\n1 - Carro: " + count1
                                            + "\n2 - Moto: "+ count2+ "\n3 - Caminhão: " + count3);
            
    }
    
    //PROCEDIMENTO CONSULTAR POR QUANTIDADE DE ACIDENTES
    public void Pqtd(Estatistica[] est){
        int i;
        
        System.out.println("Cidades com quantidade de acidentes entre 100 e 500:");
        for (i=0; i<3; i++){ //MUDAR i PARA COMBINAR COM NÚMERO DE REGISTROS
            if (est[i].qtd_acid > 100 && est[i].qtd_acid < 500){
                System.out.println(est[i].nome + ": "+ est[i].qtd_acid);
            }
        }
    }     
    
    //PROCEDIMENTO CONSULTAR CÓDIGO, NOME, QTDE ACIDENTES
    public void PConsultAcid(Estatistica [] est){
        int i, opc=0;
        Estatistica [] res = new Estatistica[3];
        
        for(i=0; i<3; i++){
            res[i] = new Estatistica();
        }
        
        while (opc!=9){
            opc = Integer.parseInt (JOptionPane.showInputDialog("Consultar por: \n1 - Código da cidade\n2 - Nome da cidade"
                                                                + "\n3 - Quantidade de acidentes\n9 - Voltar"));

            switch (opc) {
                case 1: res = FConsCod(est);
                        break;
                case 2: res = FCONSNOME(est);
                        break;
                case 3: res = FCONSQTD(est);
                        break;
                case 9: JOptionPane.showMessageDialog(null, "Consulta Finalizada");
                        break;
                default: JOptionPane.showMessageDialog(null, "Código Inválido");
            }
        }
    }
    
        //PROCEDIMENTO CONSULTAR POR CÓDIGO
        public Estatistica[] FConsCod(Estatistica[] est){
            int i, cod;

            cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Cidade:"));

            for (i=0; i<3; i++){
                if (est[i].cod_cid==cod){
                    System.out.println("Código: "+ est[i].cod_cid + "\nNome da Cidade: "+ est[i].nome+ "\nQuantidade de acidentes: "
                                        + est[i].qtd_acid);
                }
            }
            return est;
        }

        //PROCEDIMENTO CONSULTAR POR NOME
        public Estatistica[] FCONSNOME(Estatistica[] est){
            int i;
            String nom;

            nom = JOptionPane.showInputDialog("Digite o nome da Cidade: ");

            for (i=0; i<3; i++){
                
                //if(nome1.equals(nome2))
                if (est[i].nome.equals(nom)){
                    System.out.println("Código: "+ est[i].cod_cid + "\nNome da Cidade: "+ est[i].nome+ "\nQuantidade de acidentes: "
                                        + est[i].qtd_acid);
                }
            }
            return est;
        }

        //PROCEDIMENTO CONSULTAR POR QUANTIDADE
        public Estatistica[] FCONSQTD(Estatistica[] est){
            int i, qtd;

            qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes da Cidade:"));

            for (i=0; i<3; i++){
                if (est[i].qtd_acid==qtd){
                    System.out.println("Código: "+ est[i].cod_cid + "\nNome da Cidade: "+ est[i].nome+ "\nQuantidade de acidentes: "
                                        + est[i].qtd_acid);
                }
            }
            return est;
        }
    
    //PROCEDIMENTO CONSULTAR MENOR, MAIOR E QTDE ACIMA DA MÉDIA
    public void PMaiorMenor (Estatistica[] est){
        int i, j;
        
    //INSTÂNCIA CLASSE ABSTRATA
    Estatistica[] aux = new Estatistica[1];
        
    //BUBBLE SORT PARA DEFINIR MAIOR E MENOR
        for (i=0;i<2;i++){ //MUDAR i PARA COMBINAR COM NÚMERO DE REGISTROS
            for(j=(i+1);j<3;j++){ //MUDAR j PARA COMBINAR COM NÚMERO DE REGISTROS
                if (est[i].qtd_acid>est[j].qtd_acid){
                    aux[0] = est[i];
                    est[i] = est[j];
                    est[j] = aux[0];
                }
            }
        }
        

        System.out.println("Cidade com menor quantidade de acidentes: "+est[0].nome);
        System.out.println("Cidade com maior quantidade de acidentes: "+est[2].nome);//MUDAR [2] PARA COMBINAR COM NÚMERO DE REGISTROS
        
    //MÉDIA DE ACIDENTES
        int m, som=0;
        
        for(i=0; i<3; i++){ //MUDAR i PARA COMBINAR COM NÚMERO DE REGISTROS
            som = som + est[i].qtd_acid;
        }
       
        m = som/3;
        System.out.println("Média de acidentes: "+m);
        System.out.println("Cidades com quantidade de acidentes acima da média:");
        for(i=0; i<3; i++){
            if (est[i].qtd_acid>m){
                System.out.println(est[i].nome+": "+est[i].qtd_acid);
            }
        }
    }
}
