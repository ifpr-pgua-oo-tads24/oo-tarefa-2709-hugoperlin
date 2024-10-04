import java.util.Scanner;

public class AppCarro {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int op,ano;
        String placa,modelo;
        double valor,capacidadeTanque;

        Carro carro=null;

        do{
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Acelerar");
            System.out.println("3 - Frear");
            System.out.println("4 - Abastecer");
            System.out.println("5 - Imprimir");
            System.out.println("0 - Sair");
            op = scan.nextInt();
            scan.nextLine();
            if(op == 1){
                
                //instanciei
                carro = new Carro();
                
                //leitura dos dados
                System.out.println("Placa:");
                placa = scan.nextLine();
                System.out.println("Modelo:");
                modelo = scan.nextLine();
                System.out.println("Ano:");
                ano = scan.nextInt();
                System.out.println("Capacidade do Tanque:");
                capacidadeTanque = scan.nextDouble();

                //inicialização
                carro.placa = placa;
                carro.modelo = modelo;
                carro.ano = ano;
                carro.capacidadeTanque = capacidadeTanque;


            }else if(op == 2){
                System.out.println("Digite a intensidade:");
                valor = scan.nextDouble();
                if(carro.acelerar(valor)){
                    System.out.println("Acelerou!!");
                }else{
                    System.out.println("Não foi possível acelerar!");
                }
            }else if(op == 4){
                System.out.println("Digite a quantidade:");
                valor = scan.nextDouble();
                if(carro.abastecer(valor)){
                    System.out.println("Abasteceu!");
                }else{
                    System.out.println("Não foi possível abastecer!");
                }
            }else if(op == 5){
                
                if(carro != null){
                    System.out.println(carro.toString());
                }else{
                    System.out.println("É necessário cadastrar!");
                }
                
            }

            /*switch(op){
                case 1: 
                    carro = new Carro();

                break;
            }*/
        }while(op != 0);


    }
}
