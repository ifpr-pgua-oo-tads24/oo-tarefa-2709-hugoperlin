public class Conta{

    //atributos=variáveis
    String agencia;
    String numero;
    String cpf;
    String titular;
    double saldo;

    //métodos=função
    void sacar(double valor){
        saldo = saldo - valor;
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }

    public String toString(){
        String str;

        str = "6"+
                "\n\tAgencia:"+agencia+
                "\n\tNumero:"+numero+
                "\n\tTitular:"+titular+
                "\n\tCpf:"+cpf+
                "\n\tSaldo:"+saldo;
        
        return str;
    }

}