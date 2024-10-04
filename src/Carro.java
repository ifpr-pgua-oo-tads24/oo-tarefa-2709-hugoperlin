public class Carro {
    
    String placa;
    String modelo;
    int ano;
    double velocidade;
    double quantidadeCombustivel;
    double capacidadeTanque;


    boolean acelerar(double valor){
        
        if(quantidadeCombustivel >= valor*0.01){
            velocidade += valor*0.1;
            quantidadeCombustivel -= valor*.01;
            return true;
        }
        return false;
    }

    boolean frear(double valor){
        velocidade -= valor*.1;
        if(velocidade < 0){
            velocidade = 0.0;
            return false;
        }
        return true;
    }

    boolean abastecer(double valor){
        quantidadeCombustivel += valor;
        if(quantidadeCombustivel > capacidadeTanque){
            quantidadeCombustivel = capacidadeTanque;
            return false;
        }
        return true;
    }

    public String toString(){
        String str;

        str = "Placa:"+placa+" Modelo:"+modelo+" Velocidade:"+velocidade+" Quantidade Combustível:"+quantidadeCombustivel;
        return str;
    }

}
