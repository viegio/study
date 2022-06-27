//      CLASSE ABSTRATA

class Estatistica 
{
    int cod_cid;
    String nome;
    int qtd_acid;
    int tipo_veic;
    
    //MÉTODO CONSTRUTOR
    Estatistica()
    {
        this(0, "", 0, 0);
    }
    
    // Método Procedimento
    Estatistica (int codig,
                 String nom,
                 int qtd,
                 int veic)
   {	
    cod_cid = codig;
    nome = nom;
    qtd_acid = qtd;
    tipo_veic = veic;            
   }
}
