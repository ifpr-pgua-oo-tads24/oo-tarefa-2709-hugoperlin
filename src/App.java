import java.util.Scanner;

public class App {
    
    public static void main(String[] args){

       
        //declaração
        Conta minhaConta;
        Conta outraConta;

        //instanciar
        minhaConta = new Conta();
        outraConta = new Conta();

        //inicializamos 
        minhaConta.agencia = "1234";
        minhaConta.numero = "34567";
        minhaConta.cpf = "045.777.777-99";
        minhaConta.titular = "Zé";
        minhaConta.saldo = 100.0;

        outraConta.agencia = "4567";
        outraConta.numero = "876543";
        outraConta.cpf = "333.444.555-00";
        outraConta.titular = "Chico";
        outraConta.saldo = 50.0;


        System.out.println("MinhaConta:\n"+minhaConta.toString());

        System.out.println(outraConta.toString());

        minhaConta.sacar(10);

        System.out.println(minhaConta);

        minhaConta.depositar(50);

        System.out.println(minhaConta.toString());
        System.out.println(outraConta.toString());

        
    }
}
