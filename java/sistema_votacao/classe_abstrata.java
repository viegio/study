class Votos{
    //variáveis
    int numsec;
    int numcand;
    
    
    //construtor
    Votos(){
        this(0,0);
    }
    
    Votos (int nsec, int ncand){
        numsec = nsec;
        numcand = ncand;
    }
}

class Contar{
    //variáveis
    int sec;
    int tot;
    
    //construtor
    Contar(){
        this(0,0);
    }
    
    Contar (int nsec, int total){
        sec = nsec;
        tot = total;
    }
}
