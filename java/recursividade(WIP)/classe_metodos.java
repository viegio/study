// CLASSE MÉTODOS

public class Metodos_Recursividade {
    
    public int FSerie1 (int aux){
        if (aux == 1){
            return 1; 
        }
        return FSerie1(aux-1) + aux; 
    }
    
    public int FSerie2 (int n){
        if (n == 1){
            return 1;
        }
        return FSerie2(n-1) + n;
    }
    
        public double FSerie3 (double n3){
        if (n3 == 1){
            return 1;
        }
        
        return 1/FSerie3(n3-1) + (1/n3);
    }
        /*
        (1/4) + 1/5 = 2.28
        (1/3) + 1/4 = 2.08
        (1/2) + 1/3 = 1,83 
        (1/1) + 1/2 = 1.5
        */
}
