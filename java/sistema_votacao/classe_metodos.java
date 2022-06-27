import javax.swing.*;
import java.util.*;
import java.io.*;

public class Metodos{
    
    //FCADASTRAR
    public Votos[] FCADASTRAR (Votos[] vot){
    int i;
    Random r = new Random();
    
       
    for (i=0; i<100; i++){
        vot[i].numsec = r.nextInt(10)+1;
        vot[i].numcand = r.nextInt(300)+1;
    }
    JOptionPane.showMessageDialog(null,"Carregamento Realizado!");
    return vot;
    }
    
   
    //FCLASSSEC
    public Votos[] FCLASSSEC (Votos[] vot){
    int i, j;
    // INSTÂNCIA DA CLASSE ABSTRATA AUXILIAR 
    Votos[] sec = new Votos[100]; 
    Votos[] aux = new Votos[1];
    
    for(i=0;i<100;i++){
        sec[i] =  vot[i];
    }
    
    for (i=0; i<99; i++){
        for (j =(i+1); j<100; j++){
            if (sec[i].numsec>sec[j].numsec){
                aux[0] = sec[i];
                sec[i] = sec[j];
                sec[j] = aux[0];
            }
        }
    }
    JOptionPane.showMessageDialog(null,"Dados classificados!");
    return sec;
    }
    
    
    //FGRAVAVOT
    public Votos[] FGRAVAVOT (Votos[] vot) throws IOException{
        Votos [] v = new Votos[100];
        int i;

        for(i=0;i<100;i++){
            v[i] =  vot[i];
        }
        
        String arch = "Votação2016.txt";
        
        BufferedWriter writer = new BufferedWriter(new FileWriter (arch));
        
        for (i=0; i<100; i++){
            writer.write("Seção: " +Integer.toString(v[i].numsec) + ". Candidato: " + Integer.toString(v[i].numcand));
            writer.newLine();
        }
        JOptionPane.showMessageDialog(null,"Arquivo Gerado!");
        writer.close();
        return v;
    }
    
    //FLERVOTOS
    public Votos[] FLERVOTOS (Votos[] vot) throws IOException{
        int i;
        String file = "Votação2016.txt";
        
        //instancia votos
        Votos[] reg = new Votos[100];
        
        //construtor
        for(i=0; i<100; i++){
            reg[i] = new Votos();
        }
        
        BufferedReader ler = new BufferedReader (new FileReader(file));
        
        for(i=0;i<100;i++){
            vot[i].numsec = Integer.parseInt(ler.readLine());
            vot[i].numcand = Integer.parseInt(ler.readLine());
        }
        
        JOptionPane.showMessageDialog(null, "Votação lida com sucesso!");
        System.out.println(vot[0].numcand);
        ler.close();
        
        return vot;
    }
    
    //FINDICADORES
    public void FINDICADORES (Votos[] vot){
    int opc=0, i, tot_vot=0, count=0;
    Votos [] aux = new Votos[100];
    int [] sec = new int[10];
    
    for (i=0; i<100; i++){
        aux[i] = vot[i];
    }
    
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("MOSTRAR INDICADORES\nEstatísticas de Votação em 2016\n"
                    + "1 - Quantidade Eleitores por Seção\n"
                    + "2 - Seção com Maior e Menor número de Eleitores\n"
                    + "3 - Quantidade de votos por candidato\n"
                    + "4 - 10 primeiros colocadas (nro  cand. e qtd votos)\n9 - Finalizar"));
            
            switch (opc){
                case 1: PQTELEIT(aux);
                    break;
                case 2: PMAIORMENOR(aux);
                    break;
                case 3: PQTVOT(aux);
                    break;
                case 4: PQ10(aux);
                    break;
                case 9: //JOptionPane.showMessageDialog(null,"Indicadores Finalizados!");
                     break;
                default: JOptionPane.showMessageDialog(null, "Código Inválido!");
            }
        }
    }//FIM INDICADORES 
        
        public void PQTELEIT (Votos[] vot){
            int i, j, count=0;
            
            for (i=1; i<11; i++){
                count = 0;
                for(j=0; j<100; j++){
                    if(vot[j].numsec==i){
                        count++;
                    }
                }
                System.out.println("Quantidade de Eleitores da Seção "+ i + ": "+count);
            }
        }
        
        public void PMAIORMENOR (Votos[] vot){
            int i, j, count;

            //instância classe abstrata
            Contar[] vet = new Contar[10];
            Contar[] aux = new Contar[1];
            
            //construtor
            for(i=0; i<10; i++){
                vet[i] = new Contar();
            }
            
            //contar eleitores por seção
            for (i=0; i<10; i++){
                count = 0;
                for(j=0; j<100; j++){
                    if(vot[j].numsec==(i+1)){
                        count++;
                    }
                }
                //COLOCAR CONTADOR E SEÇÃO NO REGISTRO
                vet[i].sec = (i+1);
                vet[i].tot = count;
                //System.out.println(vet[i].sec + ", " + vet[i].tot);
            }
            
           //ORDENAR VETOR
            for (i=0; i<9; i++){
                for (j=(i+1); j<10; j++){
                    if (vet[i].tot> vet[j].tot){
                        aux[0] = vet[i];
                        vet[i] = vet[j];
                        vet[j] = aux[0];
                    }
                }
            }
            
            /*for(i=0; i<10; i++){
            System.out.println(vet[i].sec + ", "+ vet[i].tot);
            }*/
            //PRINTAR MENOR E MAIOR
            System.out.println("Seção com maior número de Eleitores: "+vet[9].sec + "\nSeção com menor número de Eleitores: "
                                    +vet[0].sec);
        }

        public void PQTVOT (Votos[] vot){
            int i, j, count=0;
            
            for (i=1; i<301; i++){
                count = 0;
                for(j=0; j<100; j++){
                    if(vot[j].numcand==i){
                        count++;
                    }
                }
                if (count!=0){
                    System.out.println("Quantidade de Votos do Candidato "+ i + ": "+count);
                }

            }
        }
        
        public void PQ10 (Votos[] vot){
            int i, j, count;

            //instância classe abstrata
            Contar[] vet = new Contar[300];
            Contar[] aux = new Contar[1];
            
            //construtor
            for(i=0; i<300; i++){
                vet[i] = new Contar();
            }
            
            //contar votos por candidato
            for (i=0; i<300; i++){
                count = 0;
                for(j=0; j<100; j++){
                    if(vot[j].numcand==(i+1)){
                        count++;
                    }
                }
                //COLOCAR CANDIDATO E CONTADOR NO REGISTRO
                vet[i].sec = (i+1); //CANDIDATO É COMO SEC PORQUE EU NÃO QUERIA CRIAR OUTRA CLASSE
                vet[i].tot = count;
                //System.out.println(vet[i].sec + ", " + vet[i].tot);
            }
            
           //ORDENAR VETOR
            for (i=0; i<299; i++){
                for (j=(i+1); j<300; j++){
                    if (vet[i].tot> vet[j].tot){
                        aux[0] = vet[i];
                        vet[i] = vet[j];
                        vet[j] = aux[0];
                    }
                }
            }
            
            /*for(i=0; i<10; i++){
            System.out.println(vet[i].sec + ", "+ vet[i].tot);
            }*/
            //PRINTAR MAIORES
            for (i=0; i<10; i++){
                System.out.println((i+1) + "º Candidato com mais votos: "+vet[(299-i)].sec + "\nTotal de votos: "
                                    +vet[(299-i)].tot);
            }
            
        }
}//FIM CLASSE METODOS
