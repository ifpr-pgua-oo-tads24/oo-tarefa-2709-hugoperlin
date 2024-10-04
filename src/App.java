import java.util.Scanner;

public class App {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String cpf;
        String titular;
        String agencia;
        String numero;
        int op;
        

        //declaração
        Conta minhaConta;
        Conta outraConta;
        
        System.out.println("Digite seu cpf:");
        cpf = scan.nextLine();
        System.out.println("Digite seu nome:");
        titular = scan.nextLine();
        System.out.println("Digite a agencia");
        agencia = scan.nextLine();
        System.out.println("Digite o número:");
        numero = scan.nextLine();

        //instanciar
        minhaConta = new Conta(agencia,numero,cpf,titular);

        System.out.println(minhaConta.toString());

        System.out.println("Deseja modificar o numero? (1-Sim, 0-Não)");
        op = scan.nextInt();    
        scan.nextLine();

        if(op == 1){
            System.out.println("Digite o novo numero:");
            numero = scan.nextLine();

            minhaConta.setNumero(numero);
        }

        System.out.println(minhaConta);


        System.out.println("Digite seu cpf:");
        cpf = scan.nextLine();
        System.out.println("Digite seu nome:");
        titular = scan.nextLine();
        System.out.println("Digite o número:");
        numero = scan.nextLine();

        //instanciar
        outraConta = new Conta(numero,cpf,titular);

        System.out.println(outraConta.toString());

        
    }
}
